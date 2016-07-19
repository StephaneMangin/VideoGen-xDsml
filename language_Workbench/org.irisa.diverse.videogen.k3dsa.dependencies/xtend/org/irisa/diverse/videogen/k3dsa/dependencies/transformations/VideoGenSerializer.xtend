package org.irisa.diverse.videogen.k3dsa.dependencies.transformations

import javax.json.Json
import javax.json.JsonObjectBuilder
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen

/**
 * Add missing arguments to a VIdeoGen instance
 * 
 * TODO: should be renamed ?
 * 
 */
class VideoGenSerializer {
		
	private val JsonObjectBuilder object
	
	new () {
		object = Json.createObjectBuilder()
	}
		
	/**
	 * VideoGen
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	def compile(VideoGen v) {
		val node = Json.createObjectBuilder()
		var transition = v.transitions.get(0)
		while (transition !== null) {
			transition.compile(node)
			transition = transition.nextTransition
		}
		object.add("VideoGen", node)
		object.build
	}

	/**
	 * Transitions
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	private def void compile(Transition t, JsonObjectBuilder node) {
		if (t instanceof Sequence) {
			t.compile(node)
		}

	}
	
	/**
	 * Statements
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	private def void compile(Sequence s, JsonObjectBuilder node) {
		if (s instanceof Mandatory) {
			s.compile(node)
		}
		else if (s instanceof Optional) {
			s.compile(node)
		}
		else if (s instanceof Alternatives) {
			s.compile(node)
		}

	}

	/**
	 * Mandatory
	 * 
	 * @param m Mandatory
	 * @return StringBuilder
	 */
	private def void compile(Mandatory m, JsonObjectBuilder node) {
		val newnode = Json.createObjectBuilder
		m.video.compile(newnode)
		node.add("Mandatory", newnode)
	}

	/**
	 * Optional
	 * 
	 * @param o Optional
	 * @return StringBuilder
	 */
	private def void compile(Optional o, JsonObjectBuilder node) {
		val newnode = Json.createObjectBuilder
		o.video.compile(newnode)
		var proba = 50
		if (o.probability != 0) {
			proba = o.probability
		}
		newnode.add("probability", proba)
		node.add("Optional", newnode)
	}

	/**
	 * Alternatives
	 * 
	 * @param a Alternatives
	 * @return StringBuilder
	 */
	private def void compile(Alternatives a, JsonObjectBuilder node) {
		val newnode = Json.createObjectBuilder
		a.options.forEach [ o |
			o.video.compile(newnode)
		]
		node.add("Alternatives", newnode)
	}

	/**
	 * Sequence
	 * 
	 * @param s Sequence
	 * @return StringBuilder
	 */
	private def void compile(Video s, JsonObjectBuilder node) {
		node.add("url", s.url)
		node.add("description", s.description)
		node.add("length", s.duration)
		node.add("mimetype", s.mimetype.literal)
	}
			
}
