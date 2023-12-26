import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;
// import javax.swing.event.*;

public class AllComponentsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("All Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("Button");
        JLabel label = new JLabel("Label");
        JTextField textField = new JTextField(10);
        JCheckBox checkBox = new JCheckBox("Check Box");
        JRadioButton radioButton1 = new JRadioButton("Radio Button 1");
        JRadioButton radioButton2 = new JRadioButton("Radio Button 2");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        JList<String> list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        JSeparator separator = new JSeparator();
        JMenuItem menuItem2 = new JMenuItem("Exit");
        menu.add(menuItem);
        menu.add(separator);
        menu.add(menuItem2);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        button.addActionListener(e -> {/*********************** */
            String text = textField.getText();
            label.setText("Button Clicked: " + text);
        });

        menuItem.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Dialog", true);
            JFileChooser fileChooser = new JFileChooser();
            dialog.add(fileChooser);
            dialog.setSize(300, 200);
            dialog.setVisible(true);
        });

        menuItem2.addActionListener(e -> System.exit(0));

        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(comboBox);
        panel.add(scrollPane);
        panel.add(slider);
        panel.add(progressBar);

        frame.add(panel);
        frame.setVisible(true);
    }
}
