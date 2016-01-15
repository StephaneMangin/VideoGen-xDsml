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
		for (e : v.statements) {
			e.compile(node)
		}
		object.add("VideoGen", node)
		object.build
	}

	/**
	 * Statements
	 * 
	 * @param v VideoGen
	 * @return StringBuilder
	 */
	private def void compile(Statement s, JsonObjectBuilder node) {
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
		m.sequence.compile(newnode)
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
		o.sequence.compile(newnode)
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
			o.sequence.compile(newnode)
		]
		node.add("Alternatives", newnode)
	}

	/**
	 * Sequence
	 * 
	 * @param s Sequence
	 * @return StringBuilder
	 */
	private def void compile(Sequence s, JsonObjectBuilder node) {
		node.add("url", s.url)
		node.add("description", s.description)
		node.add("length", s.length)
		node.add("mimetype", s.mimetype.literal)
	}
			
}
