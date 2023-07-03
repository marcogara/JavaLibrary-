import javax.swing.JFrame;
import java.awt.*;

public class GameWindow extends JFrame {
    private Ball ball;
    private Platform platform;
    private Brick[] bricks;

    public GameWindow() {
        setTitle("Brick Breaker Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Set the size of the game window
        setSize(800, 600);

        // Center the window on the screen
        setLocationRelativeTo(null);

        createBall();
        createPlatform();

        Stage1BrickConfiguration brickConfig = new Stage1BrickConfiguration();
        bricks = brickConfig.createBricks();
    }

    private void createPlatform() {
        // Create the platform
        platform = new Platform(350, 550, 100, 10);
    }

    private void createBall() {
        // Create the ball
        ball = new Ball(400, 500, 10);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the border
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));  // Set the border thickness
        g.setColor(Color.black);
        g.drawRect(20, 50, getWidth() - 40, getHeight() - 80);

        // Draw the ball
        ball.draw(g);

        // Draw the platform
        platform.draw(g);

        // Draw the bricks
        for (Brick brick : bricks) {
            brick.draw(g);

        }

    }
}



