import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class UserLoginForm_2 extends JFrame{
    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextArea usernameArea;
    JPasswordField passwordArea;
    JLabel status;
    JButton loginButton;

    public UserLoginForm_2(){
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameArea = new JTextArea();
        passwordArea = new JPasswordField();
        status = new JLabel("Status..");
        loginButton = new JButton("Login");

        add(usernameLabel);
        add(passwordLabel);
        add(usernameArea);
        add(passwordArea);
        add(status);
        add(loginButton);

        usernameLabel.setBounds(50,50,100,20);
        passwordLabel.setBounds(50,100,100,20);
        usernameArea.setBounds(120,50,100,20);
        passwordArea.setBounds(120,100,100,20);
        status.setBounds(100,150,200,20);
        loginButton.setBounds(50,200,200,20);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args){
        new UserLoginForm_2();
    }

}