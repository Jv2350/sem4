import javax.swing.*;
public class button{
    public static void main(String[] args){
        JFrame f = new JFrame("Display a button ");
        JButton b = new JButton("Click Here!");

        b.setBounds(50,100,100,30);

        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}