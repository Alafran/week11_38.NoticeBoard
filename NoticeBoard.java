package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(400, 250));
        
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField textAreaTop = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel textCopiedOnBottom = new JLabel();
        
        ActionEventListener copier = new ActionEventListener(textAreaTop, textCopiedOnBottom);
        copyButton.addActionListener(copier);
        
        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textCopiedOnBottom);
    }
}
