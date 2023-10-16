import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String args[]) {

        JFrame frame = new JFrame("Todotodo");

        JButton button = new JButton("Pencet");

        button.setBounds(50,100,100,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);

        frame.add(button);

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
