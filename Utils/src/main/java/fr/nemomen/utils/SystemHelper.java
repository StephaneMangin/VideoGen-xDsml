package fr.nemomen.utils;

import fr.nemomen.utils.Executor;
import java.nio.file.Path;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-13T11:46+0100")
public class SystemHelper extends Executor {
  /**
   * Create dirs contained in the given url
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static void mkDirs(final Path path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mkdir -p ");
    Path _absolutePath = path.toAbsolutePath();
    _builder.append(_absolutePath, "");
    String cmd = _builder.toString();
    Executor.ExecResult result = Executor.execCmd(cmd, 0);
    List<String> _lines = result.getLines();
    for (final String line : _lines) {
      Executor.LOGGER.finest(line);
    }
  }
}
