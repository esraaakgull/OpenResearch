package Classes.Interfaces.Dashboard;

import Classes.Interfaces.FollowResearchers.FollowResearchers;
import Classes.Interfaces.Login.Login;
import Classes.Interfaces.PaperDownload.PaperDownload;
import Classes.Interfaces.UserReadingList.ReadingList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenResearcherGUIForm extends JFrame{
    private JButton logInPageButton;
    private JButton followUnfollowPageButton;
    private JButton addRemoveToFromButton;
    private JButton downloadPaperPageButton;
    private JPanel OpenResearcherGUIPanel;

    public OpenResearcherGUIForm(){
        add(OpenResearcherGUIPanel);
        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        logInPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.displayLoginForm();
            }
        });
        downloadPaperPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PaperDownload paperDownload = new PaperDownload();
                paperDownload.displayPDownloadForm();
            }
        });
        addRemoveToFromButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReadingList readingList = new ReadingList();
                readingList.displayUserReadingForm();
            }
        });
        followUnfollowPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FollowResearchers followResearchers = new FollowResearchers();
                followResearchers.displayFollowResearchersForm();
            }
        });
    }
}
