import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String args[]) {
        final int HEIGHT = 600;
        final int WIDTH = 800;

        JFrame frame = new JFrame("Todotodo");

        JButton button = new JButton("Pencet");
        JLabel tes = new JLabel("Belajar Label");

        tes.setBounds(WIDTH / 2, 100, 1, 1 );
        button.setBounds(WIDTH / 2,HEIGHT / 2,100,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);

        frame.add(button);

        tes.setSize(200, 200);

        frame.add(tes);
        frame.add(panel);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
