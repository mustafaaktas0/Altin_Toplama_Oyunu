import javax.swing.*;
import java.io.IOException;

public class Frame extends JFrame {


    Frame() throws IOException {
        this.add(new Panel());
        this.setTitle("Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
