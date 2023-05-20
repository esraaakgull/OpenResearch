package Classes.Interfaces.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JPanel loginPanel;
    private JTextField password;
    private JTextField username;
    private JButton loginButton;

    public LoginForm() {
        add(loginPanel);
        setSize(400, 200);
        setTitle("OpenResearch");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String formUsername, formPassword;
                formUsername = username.getText();
                formPassword = password.getText();
                System.out.println(formUsername + " " + formPassword);
            }
        });
    }
}
