package org.irisa.diverse.videogen.transformations

import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Conclusion
import org.irisa.diverse.videogen.videoGen.Introduction
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.impl.VideoGenFactoryImpl
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper

/**
 * Add missing arguments to a VIdeoGen instance
 * 
 * TODO: should be renamed ?
 * 
 */
class VideoGenChecker {
		
	private val StringBuilder result
	private val tabs = new StringBuilder
	private var tabulation = "\t"
	
	new () {
		result = new StringBuilder
		tabs.append(tabulation)
	}
	
	def setTabulation(String tabulation) {
		this.tabulation = tabulation
	}
	
	/**
	 * VideoGen check and all descendants
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	def compile(VideoGen v) {
		result.append('''VideoGen {''' + "\n")
		var Sequence sequence = VideoGenHelper.getIntroduction(v)
		while (sequence !== null) {
			sequence.compile()
			sequence = sequence.nextSequence
		}
		result.append('''}''')
		result
	}

	/**
	 * VideoGen check and all descendants
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	def compile(Sequence s) {
		if (s instanceof Mandatory) {
			s.compile()
		}
		else if (s instanceof Optional) {
			s.compile()
		}
		else if (s instanceof Alternatives) {
			s.compile()
		}
		else if (s instanceof Introduction) {
			s.compile()
		}
		else if (s instanceof Conclusion) {
			s.compile()
		}
		result

	}

	/**
	 * Mandatory check and all descendants
	 * 
	 * @param m Mandatory
	 * @return StringBuilder
	 */
	def compile(Introduction m) {
		tabs.append(tabulation)
		result.append(tabs + '''@Introduction''' + "\n")
		m.video.compile()
		tabs.delete(0, 1)
		result
	}

	/**
	 * Mandatory check and all descendants
	 * 
	 * @param m Mandatory
	 * @return StringBuilder
	 */
	def compile(Conclusion m) {
		tabs.append(tabulation)
		result.append(tabs + '''@Conclusion''' + "\n")
		m.video.compile()
		tabs.delete(0, 1)
		result
	}

	/**
	 * Mandatory check and all descendants
	 * 
	 * @param m Mandatory
	 * @return StringBuilder
	 */
	def compile(Mandatory m) {
		tabs.append(tabulation)
		result.append(tabs + '''@Mandatory''' + "\n")
		m.video.compile()
		tabs.delete(0, 1)
		result
	}

	/**
	 * Optional check and all descendants
	 * 
	 * @param o Optional
	 * @return StringBuilder
	 */
	def compile(Optional o) {
		var proba = 50
		if (o.probability != 0) {
			proba = o.probability
		}
		result.append(tabs + '''@Optional''' + "\n")
		result.append(tabs + '''@Probability(«proba»)''' + "\n")
		tabs.append(tabulation)
		o.video.compile()
		tabs.delete(0, 1)
		result
	}

	/**
	 * Alternatives check and all descendants
	 * 
	 * @param a Alternatives
	 * @return StringBuilder
	 */
	def compile(Alternatives a) {
		val probas = VideoGenHelper.checkProbabilities(a)
		result.append(tabs + '''Alternatives «a.name» {''' + "\n")
		tabs.append(tabulation)
		a.options.forEach [ o |
			result.append(tabs + '''@Probability(«probas.get(o.video.name)»)''' + "\n")
			o.video.compile()
		]
		tabs.delete(0, 1)
		result.append(tabs + '''}''' + "\n")
		result
	}

	/**
	 * Sequence check and all descendants
	 * 
	 * @param s Sequence
	 * @return StringBuilder
	 */
	def compile(Video s) {
		result.append(tabs + '''Sequence «s.name» {''' + "\n")
		result.append(tabs + '''    url="«s.url»"''' + "\n")
		result.append(tabs + '''    description="«s.description»"''' + "\n")
		result.append(tabs + '''    length=«s.duration»''' + "\n")
		result.append(tabs + '''    mimetype=«s.mimetype.literal»''' + "\n")
		result.append(tabs + '''}''' + "\n")
		result
	}
			
}
