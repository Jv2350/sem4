// creating the constructor of class and calling in the main method

import javax.swing.*;
public class simple{
    JFrame f;
    simple(){
        f=new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40);

        f.add(b);
        f.setSize(400,500);

        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new simple();
    }
}