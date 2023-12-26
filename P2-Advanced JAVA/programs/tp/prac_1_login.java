import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prac_1_login {
    JTextField t;
    JLabel status;
    JPasswordField p;
    public prac_1_login() {

        JFrame f = new JFrame();
        
        JLabel l1 = new JLabel("Name: ");
        JLabel l2 = new JLabel("Password: ");
        t = new JTextField();
        p = new JPasswordField();
        JButton b = new JButton("Login");
        status = new JLabel("Status...");

        f.add(l1);
        f.add(l2);
        f.add(t);
        f.add(p);
        f.add(b);
        f.add(status);

        l1.setBounds(50, 50, 70, 20);
        l2.setBounds(50, 100, 70, 20);
        t.setBounds(150, 50, 100, 20);
        p.setBounds(150, 100, 100, 20);
        b.setBounds(50, 150, 200, 20);
        status.setBounds(50, 200, 200, 20);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PerformLogin();
            }
        });

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void PerformLogin() {
        String username = t.getText();
        char[] passwordchar = p.getPassword();
        String password = new String(passwordchar);

        if (username.equals("shubham") && password.equals("ckt")) {
            status.setText("Login Successfully");
        } else {
            status.setText("Login Failed");
        }
        p.setText("");
    }

    public static void main(String[] args) {
        new prac_1_login();
    }
}