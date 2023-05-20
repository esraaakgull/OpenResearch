package Classes.Interfaces.PaperDownload;

import javax.swing.*;

public class PaperDownloadForm extends JFrame{
    private JPanel PDownloadPanel;
    private JButton downloadButton;
    private JButton addToReadingListButton;
    private JComboBox comboBox1;

    public PaperDownloadForm(){
        add(PDownloadPanel);
        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
