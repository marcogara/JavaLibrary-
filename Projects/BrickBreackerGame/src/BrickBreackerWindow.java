import javax.swing.JFrame;

public class BrickBreackerWindow {

    public static class GameWindow extends JFrame {
        public GameWindow() {
            setTitle("Brick Breaker Game");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);

            // Set the size of the game window
            setSize(800, 600);

            // Center the window on the screen
            setLocationRelativeTo(null);
        }

    }

}
