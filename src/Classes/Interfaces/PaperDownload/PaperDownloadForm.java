package Classes.Interfaces.PaperDownload;

import javax.swing.*;

public class PaperDownloadForm extends JFrame{
    private JPanel PDownloadPanel;
    private JButton downloadButton;
    private JButton addToReadingListButton;
    private JComboBox<String> comboBox1;

    public PaperDownloadForm(){
        add(PDownloadPanel);
        comboBox1.addItem("Software Engineering");
        comboBox1.addItem("Machine Learning");
        comboBox1.addItem("Artificial Intelligence");
        comboBox1.addItem("Software Testing");

        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
