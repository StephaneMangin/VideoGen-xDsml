package org.istic.idm.xtext.videogen.utils

import javax.json.Json
import javax.json.JsonNumber
import javax.json.JsonObject
import javax.json.JsonString
import org.istic.idm.xtext.videogen.videoGen.Alternatives
import org.istic.idm.xtext.videogen.videoGen.Mandatory
import org.istic.idm.xtext.videogen.videoGen.Optional
import org.istic.idm.xtext.videogen.videoGen.Sequence
import org.istic.idm.xtext.videogen.videoGen.Statement
import org.istic.idm.xtext.videogen.videoGen.VideoGen
import javax.json.JsonObjectBuilder

/**
 * Add missing arguments to a VIdeoGen instance
 * 
 * TODO: should be renamed ?
 * 
 */
class VideoGenSerializer {
		
	private var JsonObjectBuilder object
	
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
		val tmp = object
		object = Json.createObjectBuilder()
		tmp.add("VideoGen", object)
		for (e : v.statements) {
			e.compile()
		}
		object = tmp
		object.build
	}

	/**
	 * Statements
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	private def void compile(Statement s) {
		if (s instanceof Mandatory) {
			s.compile()
		}
		else if (s instanceof Optional) {
			s.compile()
		}
		else if (s instanceof Alternatives) {
			s.compile()
		}

	}

	/**
	 * Mandatory
	 * 
	 * @param m Mandatory
	 * @return StringBuilder
	 */
	private def void compile(Mandatory m) {
		val tmp = object
		object = Json.createObjectBuilder
		m.sequence.compile()
		tmp.add("Mandatory", object.build)
		object = tmp
	}

	/**
	 * Optional
	 * 
	 * @param o Optional
	 * @return StringBuilder
	 */
	private def void compile(Optional o) {
		val tmp = object
		object = Json.createObjectBuilder
		var proba = 50
		if (o.probability != 0) {
			proba = o.probability
		}
		object.add("probability", proba)
		o.sequence.compile()
		tmp.add("Optional", object.build)
		object = tmp
	}

	/**
	 * Alternatives
	 * 
	 * @param a Alternatives
	 * @return StringBuilder
	 */
	private def void compile(Alternatives a) {
		val tmp = object
		object = Json.createObjectBuilder
		a.options.forEach [ o |
			o.sequence.compile()
		]
		tmp.add("Alternatives", object.build)
		object = tmp
	}

	/**
	 * Sequence
	 * 
	 * @param s Sequence
	 * @return StringBuilder
	 */
	private def void compile(Sequence s) {
		object.add("url", s.url)
		object.add("description", s.description)
		object.add("length", s.length)
		object.add("mimetype", s.mimetype.literal)
	}
			
}
