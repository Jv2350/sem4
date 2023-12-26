// using the grid layout 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserloginForm extends JFrame{
    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JLabel statusLabel;
    JButton loginButton;

    public UserloginForm(){
        setLayout(new GridLayout(4,2,20,20));      
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        statusLabel = new JLabel("Status");

        add(new JLabel("USER LOGIN FORM"));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(new JLabel());
        add(statusLabel);

        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                performLogin();
            }
        });
        
        setTitle("Userlogin form");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        private void performLogin(){
            String username = usernameField.getText();
            char[] passwordChar = passwordField.getPassword();
            String password = new String(passwordChar);

            if (username.equals("Jayesh") && password.equals("123")){
                statusLabel.setText("Login Succefully!!");
            } else {
                statusLabel.setText("Login Failed!!");
            }
            passwordField.setText("");
            usernameField.setText("");
        }
    public static void main(String[] args){
        new UserloginForm();
    }
}