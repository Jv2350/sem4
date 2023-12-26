import javax.swing.*;
import java.awt.event.*;

public class CheckBox{
    CheckBox(){
        JFrame f = new JFrame("CheckBox Example");
        final JLabel l = new JLabel();
        JCheckBox cb1 = new JCheckBox("C++");
        JCheckBox cb2 = new JCheckBox("Java");

        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        cb1.setBounds(50,100,100,50);
        cb2.setBounds(50,150,100,50);
        
        f.add(l);
        f.add(cb1);
        f.add(cb2);

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                l.setText("C++ Checkbox: " + (e.getStateChange()==1 ? "checked" : "unchecked"));
            }
        });

        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                l.setText("Java checkbox: "+(e.getStateChange()==1 ? "checked" : "unchecked"));
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new CheckBox();
    }
}