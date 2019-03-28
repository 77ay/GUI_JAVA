import javax.swing.*;
import java.awt.BorderLayout;
public class CounterMain extends JFrame{
    public static void main(String[] args){
        SwingCounter counter = new SwingCounter();
        counter.setTitle("Swing Counter");
        counter.setLocationRelativeTo(null);
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counter.setSize(300,100);
        counter.setVisible(true);
    }
}