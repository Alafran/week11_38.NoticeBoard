
package noticeboard;

import java.awt.event.*;
import javax.swing.*;

public class ActionEventListener implements ActionListener {
    private JTextField origin;
    private JLabel destination;
    
    public ActionEventListener(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}
