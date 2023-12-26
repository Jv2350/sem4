import javax.swing.*;
import java.awt.event.*;

public class PswdField {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");

        final JLabel l = new JLabel();
        final JPasswordField p = new JPasswordField();
        final JTextField tf = new JTextField();
        JLabel l1 = new JLabel("Username: ");
        JLabel l2 = new JLabel("Password: ");
        JButton b = new JButton("Login");

        l.setBounds(50, 200, 200, 50);
        tf.setBounds(120, 50, 100, 30);
        p.setBounds(120, 100, 100, 30);
        l1.setBounds(50, 50, 80, 30);
        l2.setBounds(50, 100, 80, 30);
        b.setBounds(50, 150, 170, 30);

        f.add(l);
        f.add(p);
        f.add(tf);
        f.add(l1);
        f.add(l2);
        f.add(b);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + tf.getText();
                data += "Password: " + new String(p.getPassword());
                l.setText(data);
            }
        });
    }
}