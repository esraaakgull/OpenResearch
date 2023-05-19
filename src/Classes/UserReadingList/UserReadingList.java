package Classes.UserReadingList;

import Classes.PaperDownload.PaperDownloadForm;

import javax.swing.*;

public class UserReadingList {
    public void displayUserReadingForm() {

        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ReadingListForm readingListForm = new ReadingListForm();
                readingListForm.setVisible(true);
            }
        });
    }
}
