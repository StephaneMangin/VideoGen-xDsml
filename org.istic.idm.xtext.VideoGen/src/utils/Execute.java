package utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.LogOutputStream;
import org.apache.commons.exec.PumpStreamHandler;

/**
 * Execute helper using apache commons exed
 *
 *  add this dependency to your pom.xml:
   <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-exec</artifactId>
            <version>1.2</version>
        </dependency>

 * @author wf
 *
 */
public class Execute {

    protected static java.util.logging.Logger LOGGER = java.util.logging.Logger
            .getLogger("videoGen.cmd");

    public Execute() {
    	LOGGER.setLevel(Level.ALL);
	}
    /**
     * LogOutputStream
     * http://stackoverflow.com/questions/7340452/process-output-from
     * -apache-commons-exec
     * 
     * @author wf
     * 
     */
    public static class ExecResult extends LogOutputStream {
        private int exitCode;
        /**
         * @return the exitCode
         */
        public int getExitCode() {
            return exitCode;
        }

        /**
         * @param exitCode the exitCode to set
         */
        public void setExitCode(int exitCode) {
            this.exitCode = exitCode;
        }

        private final List<String> lines = new LinkedList<String>();

        @Override
        protected void processLine(String line, int level) {
            lines.add(line);
        }

        public List<String> getLines() {
            return lines;
        }
    }

    /**
     * execute the given command
     * @param cmd - the command 
     * @param exitValue - the expected exit Value
     * @return the output as lines and exit Code
     * @throws Exception
     */
    public static ExecResult execCmd(String cmd, int exitValue) {
		LOGGER.info("Running "+cmd);
        CommandLine commandLine = CommandLine.parse(cmd);
        DefaultExecutor executor = new DefaultExecutor();
        executor.setExitValue(exitValue);
        ExecResult result =new ExecResult();
		executor.setStreamHandler(new PumpStreamHandler(result));
		try {
			result.setExitCode(executor.execute(commandLine));
		} catch (ExecuteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
    }

    // Helper methods
    public static void createThumbnails(Path fullPath, Path thumbFileName) {
		String cmd = "avconv -i \"" + fullPath + "\" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 \"" + thumbFileName + "\"";
		ExecResult result = execCmd(cmd, 0);
		for (String line: result.getLines()) {
			LOGGER.finest(line);
		}	
    }
    
    public static void convert(Path fullPath, Path newFullPathName, String format) {
		String cmd = "avconv -i \"" + fullPath + "\" -strict -2 -f " + format + " \"" + newFullPathName + "\"";
		ExecResult result = execCmd(cmd, 0);
		for (String line: result.getLines()) {
			LOGGER.finest(line);
		}	
    }
   
    public static void mkDirs(Path path) {
			try {
				CommandLine mkdir = CommandLine.parse("mkdir -p " + path.toAbsolutePath());
				LOGGER.info(mkdir.toString());
				DefaultExecutor executor = new DefaultExecutor();
				executor.setExitValue(0);
				executor.execute(mkdir);
			} catch (Exception e) {
				LOGGER.severe(e.getMessage());
			}
    }
    
}