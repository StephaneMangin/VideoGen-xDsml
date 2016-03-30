package org.irisa.diverse.videogen.videoGen.aspects.exceptions

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

class ConstraintsFailed extends Exception {

	new(ConstraintsType type, Boolean showDialog) {
		super(type.getMessage())
		if (showDialog) {
			new MessageBoxExample(type.message, SWT.ABORT);
		}
	}

	public static class MessageBoxExample {
		Display display = new Display();
		Shell shell = new Shell(display);
		Button button;

		new(String message, int icon) {
			button = new Button(shell, SWT.PUSH)

			button.addListener(SWT.Selection, new Listener() {

				override handleEvent(Event event) {
					val messageBox = new MessageBox(shell, icon)

					messageBox.setText("Constraint error")
					messageBox.setMessage(message)
					messageBox.open()
				}
			})

			button.setText("Ok")

			button.setBounds(0, 0, 100, 30)

			shell.pack()
			shell.open()
			// textUser.forceFocus()
			// Set up the event loop.
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					// If no more entries in event queue
					display.sleep()
				}
			}

			display.dispose()
		}
	}
}