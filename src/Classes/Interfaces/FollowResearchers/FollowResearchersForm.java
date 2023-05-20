package Classes.Interfaces.FollowResearchers;
import javax.swing.DefaultListModel;

import javax.swing.*;

public class FollowResearchersForm extends JFrame {
    private JPanel UserReadingListPanel;
    private JPanel FollowResearchersPanel;
    private JList<String> list1;
    private JButton followButton;
    private JCheckBox paper3CheckBox;
    private JCheckBox paper2CheckBox;
    private JCheckBox paper1CheckBox;
    private JButton unfollowButton;
    private JCheckBox paper4CheckBox;

    public FollowResearchersForm() {
        add(FollowResearchersPanel);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        list1.setModel(listModel);
        listModel.addElement("Software Engineering");
        listModel.addElement("Machine Learning");
        listModel.addElement("Artificial Intelligence");
        listModel.addElement("Software Testing");

        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

