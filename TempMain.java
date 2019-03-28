import javax.swing.*;
import java.awt.*;
public class TempMain extends JFrame{
    public static void main(String[] args){
        Temp frame = new Temp();
        frame.setTitle("Tempurature Converter");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
    }
}