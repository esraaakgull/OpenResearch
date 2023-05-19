package Classes.FollowResearchers;

import javax.swing.*;

public class FollowResearchersForm extends JFrame{
    private JPanel UserReadingListPanel;
    private JCheckBox paperAdıCheckBox1;
    private JCheckBox paperAdıCheckBox;
    private JCheckBox paperAdıCheckBox2;
    private JButton unfollowButton;
    private JButton followButton;
    private JList list1;
    private JPanel FollowResearchersPanel;

    public FollowResearchersForm(){
        add(FollowResearchersPanel);
        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
