package Classes.Interfaces.Login;

import javax.swing.*;

public class Login {
    public void displayLoginForm() {

        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginForm login = new LoginForm();
                login.setVisible(true);
            }
        });
    }

}
