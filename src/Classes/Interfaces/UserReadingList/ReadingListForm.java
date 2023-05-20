package Classes.Interfaces.UserReadingList;

import javax.swing.*;

public class ReadingListForm extends JFrame {
    private JList<String> list1;
    private JButton addReadingListButton;
    private JTextField enterReadingListTitleTextField;
    private JCheckBox paper1CheckBox;
    private JCheckBox paper3CheckBox;
    private JCheckBox paper2CheckBox;
    private JButton removePaperButton;
    private JPanel UserReadingListPanel;
    private JCheckBox paper4CheckBox;

    public ReadingListForm(){
        add(UserReadingListPanel);

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
