package Classes.Interfaces.FollowResearchers;

import javax.swing.*;

public class FollowResearchers {
    public void displayFollowResearchersForm() {
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FollowResearchersForm followResearchersForm = new FollowResearchersForm();
                followResearchersForm.setVisible(true);
            }
        });
    }
}
