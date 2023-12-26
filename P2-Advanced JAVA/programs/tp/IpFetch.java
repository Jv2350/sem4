import javax.swing.*;
import java.awt.event.*;

public class IpFetch extends JFrame implements ActionListener {
    //declaration of components
    JTextField tf;
    JLabel l;
    JButton b;

    IpFetch() { //constructor
        tf = new JTextField();
        l = new JLabel();
        b = new JButton("Find IP");

        tf.setBounds(50, 50, 250, 30); //setting positions and sizes of components
        b.setBounds(50, 100, 250, 30);
        l.setBounds(50, 150, 250, 30);

        b.addActionListener(this); //adding ActionListener to the button

        add(b);
        add(tf);
        add(l);

        setSize(350, 230); //setting Frame properties
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText(); //getting input from the text field
            String ip = java.net.InetAddress.getByName(host).getHostAddress(); //retrieving IP address
            l.setText("IP of " + host + " is: " + ip); //displaying IP address in the label
        } catch (Exception ex) {
            System.out.println(ex); //handling exceptions (printing to console in this case)
        }
    }

    public static void main(String[] args) {
        new IpFetch(); //creating an instance of the class (which initializes the GUI)
    }
}
