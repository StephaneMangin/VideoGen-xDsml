package org.irisa.diverse.videogen.transformations.utils

import java.io.IOException
import java.util.LinkedList
import java.util.List
import java.util.logging.Logger
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.apache.commons.exec.ExecuteException
import org.apache.commons.exec.LogOutputStream
import org.apache.commons.exec.PumpStreamHandler

/** 
 * Execute helper using apache commons exed
 * add this dependency to your pom.xml:
 * <dependency>
 * 		<groupId>org.apache.commons</groupId>
 * 		<artifactId>commons-exec</artifactId>
 * 		<version>1.2</version>
 * </dependency>
 * @see http://stackoverflow.com/questions/7340452/process-output-from-apache-commons-exec
 * @author Wolfgang Fahl <info@bitplan.com>
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * TODO: should be abstract from creating files inside the system path... Which could lead to mkDirs method removal
 */
public abstract class Executor {
	
	/**
	 * Local logger
	 */	
	protected static Logger LOGGER = Logger.getLogger("videoGen.cmd")
	
	/** 
	 * LogOutputStream
	 * http://stackoverflow.com/questions/7340452/process-output-from
	 * -apache-commons-exec
	 * @author Wolfgang Fahl <info@bitplan.com>
	 */
	protected static class ExecResult extends LogOutputStream {
		int exitCode

		/** 
		 * @return the exitCode
		 * 
		 * @author Wolfgang Fahl <info@bitplan.com>
		 */
		def int getExitCode() {
			return exitCode
		}

		/** 
		 * @param exitCode the exitCode to set
		 * 
		 * @author Wolfgang Fahl <info@bitplan.com>
		 */
		def void setExitCode(int exitCode) {
			this.exitCode = exitCode
		}

		final List<String> lines = new LinkedList<String>()

		override protected void processLine(String line, int level) {
			lines.add(line)
		}

		def List<String> getLines() {
			return lines
		}
	}

	/** 
	 * execute the given command
	 * @param cmd - the command 
	 * @param exitValue - the expected exit Value
	 * @return the output as lines and exit Code
	 * @throws Exception
	 * 
	 * @author Wolfgang Fahl <info@bitplan.com>
	 */
	def static ExecResult execCmd(String cmd, int exitValue) {
		LOGGER.info('''Running «cmd»''')
		var CommandLine commandLine = CommandLine.parse(cmd)
		var DefaultExecutor executor = new DefaultExecutor()
		executor.setExitValue(exitValue)
		var ExecResult result = new ExecResult()
		executor.setStreamHandler(new PumpStreamHandler(result))
		try {
			result.setExitCode(executor.execute(commandLine))
		} catch (ExecuteException e) {
			e.printStackTrace()
		} catch (IOException e) {
			e.printStackTrace()
		}
		return result
	}
	
	def static void processResult(ExecResult result) {
		for (String line : result.getLines()) {
			if (result.exitCode == 0) {
				LOGGER.info(line)
			}
			if (result.exitCode == 1) {
				LOGGER.warning(line)
			}
			if (result.exitCode == 2) {
				LOGGER.severe(line)
			}
		}
	}
    
}
