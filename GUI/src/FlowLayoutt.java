import javax.swing.*;
import java.awt.*;

/**
 * Created by Kamil on 12/10/2015.
 */
public class FlowLayoutt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        for (int i=1; i<=10; i++) {
            contentPane.add(new JButton("Button " + i));
        }
        frame.pack();
        frame.setVisible(true);
    }
}
