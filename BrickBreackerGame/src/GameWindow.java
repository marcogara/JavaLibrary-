import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class GameWindow extends JFrame {
    private Ball ball;

    public GameWindow() {
        setTitle("Brick Breaker Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Set the size of the game window
        setSize(800, 600);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Create the ball
        ball = new Ball(400, 300, 10);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the ball
        ball.draw(g);
    }

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.setVisible(true);
    }
}



