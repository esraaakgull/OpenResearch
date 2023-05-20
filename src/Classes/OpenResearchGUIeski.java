package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OpenResearchGUIeski {
    private JFrame frame;
    private JPanel panel;
    private JButton downloadButton;
    private JButton addToListButton;
    private JButton followButton;

    public OpenResearchGUIeski() {
        frame = new JFrame("OpenResearch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));

        downloadButton = new JButton("Download Paper Page");
        addToListButton = new JButton("Add-Remove to-from List Page");
        followButton = new JButton("Follow-Unfollow Page");

        downloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle download button action
                // ...
            }
        });

        addToListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle add to list button action
                // ...
            }
        });

        followButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle follow button action
                // ...
            }
        });

        panel.add(downloadButton);
        panel.add(addToListButton);
        panel.add(followButton);
        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }
}
