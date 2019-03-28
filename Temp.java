import java.awt.GridLayout;
import javax.swing.*;

public class Temp extends JFrame {
    public Temp(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        p1.add(new JLabel("Celsius"));
        p1.add(new JTextField(12));

        JPanel p2 = new JPanel(new GridLayout(1,2));
        p2.add(new JLabel("Fahrenhiet"));
        p2.add(new JTextField(12));

        JPanel panel = new JPanel(new GridLayout(2,1));
        panel.add(p1);
        panel.add(p2);

        add(panel);
    }
}