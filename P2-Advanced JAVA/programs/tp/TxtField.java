import javax.swing.*;

class TxtField{
    public static void main(String[] args){
        JFrame f = new JFrame("Text field example");
        JTextField t1, t2;

        t1 = new JTextField("Welcome to java");
        t2 = new JTextField("AWT Tutorial");

        t1.setBounds(50,100,200,30);
        t2.setBounds(50,150,200,30);

        f.add(t1);
        f.add(t2);

        f.setSize(300,280);
        f.setLayout(null);
        f.setVisible(true);
    }
}