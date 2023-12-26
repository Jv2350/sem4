import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// import java.util.Arrays;

public class UserLoginForm_3 {
    JFrame f;
    JLabel l1;
    JLabel l2;
    private JTextField t;
    JPasswordField p;
    JButton b;
    JLabel status;
    public UserLoginForm_3() {
     
            JFrame f = new JFrame();
            JLabel l1 = new JLabel("Name: ");
            JLabel l2 = new JLabel("Password: ");
            JTextField t = new JTextField("24");
            JPasswordField p = new JPasswordField();
            JButton b = new JButton("Login");
            JLabel status = new JLabel("Status...");

            //f.setLayout(new GridLayout(4, 2)); // Using GridLayout

            f.add(l1);
            f.add(t);
            f.add(l2);
            f.add(p);
            f.add(b);
            f.add(status);

            l1.setBounds(20,20,50,20);
            t.setBounds(100,20,100,20);
            l2.setBounds(20,50,70,20);
            p.setBounds(100,50,100,20);
            b.setBounds(20,100,150,20);
            status.setBounds(20,150,150,20);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PerformLogin();
                }
            });

            f.setSize(500, 500);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            f.setVisible(true);
        };
    

    public void PerformLogin() {
        String username = t.getText();
        char[] passwordchar = p.getPassword();
        String password = new String(passwordchar);
        // Consider using a more secure password handling approach
        if (username.equals("shubham") && password.equals("ckt")) {
            status.setText("Login Successfully");
        } else {
            status.setText("Login Failed");
        }
        p.setText("");
    }

    public static void main(String[] args) {
        new UserLoginForm_3();
    
}
}