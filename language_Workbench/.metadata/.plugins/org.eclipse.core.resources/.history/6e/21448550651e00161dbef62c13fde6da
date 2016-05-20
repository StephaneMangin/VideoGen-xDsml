package org.irisa.diverse.videogen.videoGen.aspects.exceptions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsType;

@SuppressWarnings("all")
public class ConstraintsFailed extends Exception {
  public static class MessageBoxExample {
    private Display display = new Display();
    
    private Shell shell = new Shell(this.display);
    
    private Button button;
    
    public MessageBoxExample(final String message, final int icon) {
      Button _button = new Button(this.shell, SWT.PUSH);
      this.button = _button;
      this.button.addListener(SWT.Selection, new Listener() {
        @Override
        public void handleEvent(final Event event) {
          final MessageBox messageBox = new MessageBox(MessageBoxExample.this.shell, icon);
          messageBox.setText("Constraint error");
          messageBox.setMessage(message);
          messageBox.open();
        }
      });
      this.button.setText("Ok");
      this.button.setBounds(0, 0, 100, 30);
      this.shell.pack();
      this.shell.open();
      while ((!this.shell.isDisposed())) {
        boolean _readAndDispatch = this.display.readAndDispatch();
        boolean _not = (!_readAndDispatch);
        if (_not) {
          this.display.sleep();
        }
      }
      this.display.dispose();
    }
  }
  
  public ConstraintsFailed(final ConstraintsType type, final Boolean showDialog) {
    super(type.getMessage());
    if ((showDialog).booleanValue()) {
      String _message = type.getMessage();
      new ConstraintsFailed.MessageBoxExample(_message, SWT.ABORT);
    }
  }
}
