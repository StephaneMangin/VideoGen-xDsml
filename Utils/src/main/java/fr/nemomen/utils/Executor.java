package fr.nemomen.utils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.LogOutputStream;
import org.apache.commons.exec.PumpStreamHandler;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

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
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-10T12:02+0100")
public abstract class Executor {
  /**
   * LogOutputStream
   * http://stackoverflow.com/questions/7340452/process-output-from
   * -apache-commons-exec
   * @author Wolfgang Fahl <info@bitplan.com>
   */
  protected static class ExecResult extends LogOutputStream {
    private int exitCode;
    
    /**
     * @return the exitCode
     * 
     * @author Wolfgang Fahl <info@bitplan.com>
     */
    public int getExitCode() {
      return this.exitCode;
    }
    
    /**
     * @param exitCode the exitCode to set
     * 
     * @author Wolfgang Fahl <info@bitplan.com>
     */
    public void setExitCode(final int exitCode) {
      this.exitCode = exitCode;
    }
    
    private final List<String> lines = new LinkedList<String>();
    
    @Override
    protected void processLine(final String line, final int level) {
      this.lines.add(line);
    }
    
    public List<String> getLines() {
      return this.lines;
    }
  }
  
  /**
   * Local logger
   */
  protected static Logger LOGGER = Logger.getLogger("videoGen.cmd");
  
  /**
   * execute the given command
   * @param cmd - the command
   * @param exitValue - the expected exit Value
   * @return the output as lines and exit Code
   * @throws Exception
   * 
   * @author Wolfgang Fahl <info@bitplan.com>
   */
  public static Executor.ExecResult execCmd(final String cmd, final int exitValue) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Running ");
    _builder.append(cmd, "");
    Executor.LOGGER.info(_builder.toString());
    CommandLine commandLine = CommandLine.parse(cmd);
    DefaultExecutor executor = new DefaultExecutor();
    executor.setExitValue(exitValue);
    Executor.ExecResult result = new Executor.ExecResult();
    PumpStreamHandler _pumpStreamHandler = new PumpStreamHandler(result);
    executor.setStreamHandler(_pumpStreamHandler);
    try {
      int _execute = executor.execute(commandLine);
      result.setExitCode(_execute);
    } catch (final Throwable _t) {
      if (_t instanceof ExecuteException) {
        final ExecuteException e = (ExecuteException)_t;
        e.printStackTrace();
      } else if (_t instanceof IOException) {
        final IOException e_1 = (IOException)_t;
        e_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return result;
  }
  
  public static void processResult(final Executor.ExecResult result) {
    List<String> _lines = result.getLines();
    for (final String line : _lines) {
      {
        if ((result.exitCode == 0)) {
          Executor.LOGGER.info(line);
        }
        if ((result.exitCode == 1)) {
          Executor.LOGGER.warning(line);
        }
        if ((result.exitCode == 2)) {
          Executor.LOGGER.severe(line);
        }
      }
    }
  }
}
