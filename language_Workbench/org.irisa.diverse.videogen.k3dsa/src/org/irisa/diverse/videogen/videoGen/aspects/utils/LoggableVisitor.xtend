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
		val workspacePath = Paths.get(ResourcesPlugin.workspace.root.projects.get(0).locationURI)
		val logPath = Paths.get(workspacePath + "/logs")
		// Log is reset before use
		SystemHelper.mkDirs(logPath)
		val FileHandler fh = new FileHandler(logPath + "/" + log.name + ".log", true)
        val formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);
		log.addHandler(fh)
	}
}