// creating all the components in the main 
// it is bad code as it has all the code in the main class only 

import javax.swing.*;
public class FirstSwingExample{
    public static void main(String[] args){
        JFrame f = new JFrame();
        
        JButton button = new JButton("Click bruhh");
        button.setBounds(100,100,100,100);

        f.add(button);
        f.setSize(300,300);

        f.setLayout(null);
        f.setVisible(true);


    }
}