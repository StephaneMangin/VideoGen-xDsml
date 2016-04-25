package org.irisa.diverse.videogen.videoGen.aspects.utils

import java.util.logging.FileHandler
import java.util.logging.Logger
import java.util.logging.SimpleFormatter
import org.eclipse.core.resources.ResourcesPlugin
import org.irisa.diverse.videogen.transformations.helpers.SystemHelper
import java.nio.file.Paths

class LoggableVisitor {
	protected Logger log = Logger.getLogger(class.simpleName)
	
	new () {
		val prefix = ResourcesPlugin.workspace.root.projects.get(0).locationURI.toString.replace("file:", "")
		val logDir = prefix + "/logs/"
		SystemHelper.mkDirs(Paths.get(logDir))
		val format = new SimpleFormatter
		val handler = new FileHandler(logDir + class.simpleName + ".log")
		handler.formatter = format
		log.addHandler(handler)
	}
}