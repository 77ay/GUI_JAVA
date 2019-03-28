import java.awt.FlowLayout;
import javax.swing.*;

public class SwingCounter extends JFrame {
    public SwingCounter(){
        setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
        add(new JLabel("Counter"));
        add(new JTextField(12));
        add(new JButton("Count"));
    }
}