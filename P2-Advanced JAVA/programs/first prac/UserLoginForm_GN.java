import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLoginForm_GN{
    // declaration of components
    JFrame mainFrame;
    JLabel heading;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JLabel statusBar;

    // creating constructor coz it is a good practice 
    UserLoginForm_GN(){
        // initialization 
        mainFrame = new JFrame("User login form");
        heading = new JLabel("USER LOGIN FORM");
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField("Username");
        passwordField = new JPasswordField("");
        loginButton = new JButton("Login");
        statusBar = new JLabel("Status.. ");

        // setting bounds for each coz using layout as "null"
        heading.setBounds(80,10,150,30);
        usernameLabel.setBounds(50,50,100,20);
        passwordLabel.setBounds(50,90,100,20);
        usernameField.setBounds(120,50,100,25);
        passwordField.setBounds(120,90,100,25);
        loginButton.setBounds(50,130,170,30);
        statusBar.setBounds(70,170,150,30);

        mainFrame.add(heading);
        mainFrame.add(usernameLabel);
        mainFrame.add(passwordLabel);
        mainFrame.add(usernameField);
        mainFrame.add(passwordField);
        mainFrame.add(loginButton);
        mainFrame.add(statusBar);

	    // imp things to be added before anything
        // frame properties
        mainFrame.setSize(300,250);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        // if frame close then teminate the program
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding actionlistener for loginButton
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                performLogin();
            }
        });
    }
    
    // method to be perform after login button click
    public void performLogin(){
        String username = usernameField.getText();
        char[] passwordChar = passwordField.getPassword();
        String password = new String(passwordChar);

        if (username.equals("Jayesh") && password.equals("123")){
            statusBar.setText("User login successful :)");
        } else {
            statusBar.setText("User login failed :(");
        }
    }
    // main method or entry point
    public static void main(String[] args){
        // instance of a class 
        new UserLoginForm_GN(); 
    }
}


