package Classes.Interfaces.Dashboard;

import javax.swing.*;

public class OpenResearcherGUI {
    public void displayOpenResearcherGUIForm() {

        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                OpenResearcherGUIForm openResearcherGUIForm = new OpenResearcherGUIForm();
                openResearcherGUIForm.setVisible(true);
            }
        });
    }
}
