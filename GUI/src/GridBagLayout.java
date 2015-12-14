import javax.swing.*;
import java.awt.*;

/**
 * Created by Kamil on 12/10/2015.
 */
public class GridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new java.awt.GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        for (int i=0; i<3; i++) {
            gbc.gridx = i;
            gbc.gridy = i;
            contentPane.add(new JButton("Button (" + i + ")"), gbc);
            contentPane.add(new JButton("Button (" + i + ")"), gbc);
        }
        for (int y=3; y<6; y++) {
            for (int x = 3; x < 6; x++) {
                gbc.gridx = x;
                gbc.gridy = y;
                contentPane.add(new JButton("Button (" + x + ", " + y + ")"), gbc);
            }
        }
        frame.pack();
        frame.setVisible(true);
    }
}
