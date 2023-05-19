package Classes.PaperDownload;

import Classes.Login.LoginForm;

import javax.swing.*;

public class PDownload {
    public void displayPDownloadForm() {

        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PaperDownloadForm paperDownloadForm = new PaperDownloadForm();
                paperDownloadForm.setVisible(true);
            }
        });
    }

}
