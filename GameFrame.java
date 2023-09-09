
// Java Swing is used to create window-based applications
// GamePanel instance is created
import javax.swing.*;

public class GameFrame extends JFrame {

    //Creating GameFrame Constructor
    GameFrame() {

        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);




    }
}
