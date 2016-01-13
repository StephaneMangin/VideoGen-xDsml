package org.istic.idm.xtext.videogen;

import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import static org.junit.Assert.*
import org.junit.Test
import java.nio.file.Paths
import org.istic.idm.xtext.videogen.videoGen.VideoGen
import org.istic.idm.xtext.videogen.videoGen.Statement
import org.istic.idm.xtext.videogen.videoGen.Mandatory
import org.istic.idm.xtext.videogen.videoGen.Optional
import org.istic.idm.xtext.videogen.videoGen.Alternatives

class VideoGenTests {

	
	def loadVideoGen(URI uri) {
		VideoGenStandaloneSetup.doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}
	
	@Test
	def test1() {
		
		// loading
		var videoGen = loadVideoGen(URI.createURI(Paths.get("resources/test.vg").toAbsolutePath.toString))
		assertNotNull(videoGen)
		saveVideoGen(URI.createURI("test.xmi"), videoGen)
		var indice = 0
		for (Statement statement: videoGen.statements) {
			if (statement instanceof Mandatory) {
				assertNotNull(statement.sequence)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				statement.sequence.name = "MandatorySequence_" + indice
			}
			if (statement instanceof Optional) {
				assertNotNull(statement.sequence)
				assertTrue(100 >= statement.probability)
				assertTrue(0 <= statement.probability)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				statement.sequence.name = "OptionalSequence_" + indice
			}
			if (statement instanceof Alternatives) {
				statement.name = "Alternative_" + indice
				assertNotEquals(0, statement.options.size)
				var totalProb = 0
				for (optional: statement.options) {
					assertTrue(100 >= optional.probability)
					assertTrue(0 <= optional.probability)
					totalProb += optional.probability
				}
				//assertEquals(100, totalProb)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				var indiceAlt = 0
				for (sequence: statement.options.map[sequence]) { 
					sequence.name = "Alternative_" + indice + "_Sequence_" + indiceAlt
				}
				indiceAlt++
			}
		}
		// Does not effectively add metadatas
		videoGen = VideoGenTransform.addMetadata(videoGen)	
		// serializing
		saveVideoGen(URI.createURI("full-restructured.vg"), videoGen) 
	}
	
	
	//@Test
	//def test2() {
	//	
		// loading
	//	var videoGen = loadVideoGen(URI.createURI("test1.vq")) 
	//		
		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
	//	var html = toVideoGen(videoGen.statements)
	//	assertNotNull(html)
	//	
		// serializing (note: we could type check the HTML 
		// with Xtext by specifying the grammar for instance)
	//	val fw = new FileWriter("foo1.html")
	//	fw.write(html.toString)
	//	fw.close
		
		
	//}
	
	def toVideoGen(List<Statement> statements) {
		'''<html>
	<body>
		�FOR s : statements�
			�IF s instanceOf Mandatory�
				<h1>�v.name�</h1>
				<p>
					url : �v.url�<br />
				</p>
			�ENDIF�
			�IF s instanceOf Optional�
				<h1>�v.name� (Optional)</h1>
				<p>
					url : �v.url�<br />
				</p>
			�ENDIF�
			�IF s instanceOf Alternatives�
				�FOR v : s.sequences�
					<h1>�v.name�</h1>
					<p>
						url : �v.url�<br />
					</p>
				�ENDFOR�
			�ENDIF�
		�ENDFOR�
	</body>
	</html>'''
	}
	
	

}
