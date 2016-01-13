package fr.nemomen.utils

import java.nio.file.Path


/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class SystemHelper extends Executor {
	
	/**
	 * Create dirs contained in the given url
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void mkDirs(Path path) {
		var cmd = '''mkdir -p «path.toAbsolutePath()»'''
		var result = execCmd(cmd, 0)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}
    
}
