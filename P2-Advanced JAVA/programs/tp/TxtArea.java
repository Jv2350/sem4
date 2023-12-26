import javax.swing.*;
import java.awt.event.*;


public class TxtArea implements ActionListener{
    JLabel l1,l2;
    JTextArea txtArea;
    JButton b;

    TxtArea(){
        JFrame f = new JFrame();
        l1 = new JLabel();
        l2 = new JLabel();
        txtArea = new JTextArea();
        b = new JButton("Count Words");

        b.addActionListener(this);

        l1.setBounds(50,25,100,30);
        l2.setBounds(160,25,100,30);
        txtArea.setBounds(20,75,250,200);
        b.setBounds(100,300,120,30);

        f.add(l1);
        f.add(l2);
        f.add(txtArea);
        f.add(b);

        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);;
    }
    public void actionPerformed(ActionEvent e){
        String txt = txtArea.getText();
        String words[] = txt.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+txt.length());
    }

    public static void main(String[] args){
        new TxtArea();
    }
}