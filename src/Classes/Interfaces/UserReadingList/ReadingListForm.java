package Classes.Interfaces.UserReadingList;

import javax.swing.*;

public class ReadingListForm extends JFrame {
    private JList list1;
    private JButton addReadingLiistButton;
    private JTextField enterReadingListTitleTextField;
    private JCheckBox paperAdıCheckBox;
    private JCheckBox paperAdıCheckBox1;
    private JCheckBox paperAdıCheckBox2;
    private JButton removePaperButton;
    private JPanel UserReadingListPanel;

    public ReadingListForm(){
        add(UserReadingListPanel);
        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
