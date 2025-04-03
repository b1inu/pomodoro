import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pomodoro");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color bgColor = Color.decode("#eee9d5");
        Color fgColor = Color.decode("#1e1e1c");

        JPanel panel = new JPanel();
        panel.setBackground(bgColor);

        JLabel label = new JLabel("Pomodoro");
        label.setFont(new Font("SansSerif", Font.PLAIN, 24));
        label.setForeground(fgColor);

        panel.add(label);
        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
