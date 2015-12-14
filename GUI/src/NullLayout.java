import javax.swing.*;
import java.awt.*;

/**
 * Created by Kamil on 12/12/2015.
 */
public class NullLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);

        JButton b1 = new JButton("Przycisk 1");
        b1.setBounds(10, 10, 100, 50);
        contentPane.add(b1);
        frame.setBounds(400, 300, 400, 300);
        frame.setVisible(true);
    }
}
