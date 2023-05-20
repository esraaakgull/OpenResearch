package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OpenResearchGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton downloadButton;
    private JButton createListButton;
    private JButton addToListButton;
    private JButton removeFromListButton;
    private JButton followButton;
    private JButton viewListsButton;

    private List<String> readingLists;

    public OpenResearchGUI() {
        frame = new JFrame("OpenResearch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));

        downloadButton = new JButton("Download");
        createListButton = new JButton("Create Reading List");
        addToListButton = new JButton("Add to List");
        removeFromListButton = new JButton("Remove from List");
        followButton = new JButton("Follow");
        viewListsButton = new JButton("View Lists");

        readingLists = new ArrayList<>();

        downloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle download button action
                // ...
            }
        });

        createListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String listName = JOptionPane.showInputDialog(frame, "Enter the name of the reading list:");
                if (listName != null && !listName.isEmpty()) {
                    readingLists.add(listName);
                    JOptionPane.showMessageDialog(frame, "Reading list created: " + listName);
                }
            }
        });

        addToListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle add to list button action
                // ...
            }
        });

        removeFromListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle remove from list button action
                // ...
            }
        });

        followButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle follow button action
                // ...
            }
        });

        viewListsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String list : readingLists) {
                    sb.append(list).append("\n");
                }
                JOptionPane.showMessageDialog(frame, sb.toString(), "Reading Lists", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(downloadButton);
        panel.add(createListButton);
        panel.add(addToListButton);
        panel.add(removeFromListButton);
        panel.add(followButton);
        panel.add(viewListsButton);

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }
}
