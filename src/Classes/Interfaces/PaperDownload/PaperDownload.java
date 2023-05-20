package Classes.Interfaces.PaperDownload;

import javax.swing.*;

public class PaperDownload {
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
