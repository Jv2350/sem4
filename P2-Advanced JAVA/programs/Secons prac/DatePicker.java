import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXDatePicker;

public class DatePicker extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JXPicker Example");
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 400, 250, 100);

        JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));

        panel.add(picker);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}