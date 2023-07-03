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
        createBricks(new BrickCreationParameters(2, 6, 120, 20, 30, 60, 4));

    }


        /*
        // Create the bricks
        int rows = 2;
        int cols = 6;
        int brickWidth = 120;
        int brickHeight = 20;
        bricks = new Brick[rows * cols];

        int startX = 30; // Starting X-coordinate of the first brick
        int startY = 60; // Starting Y-coordinate of the first brick

        int currentX = startX;
        int currentY = startY;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int index = row * cols + col;
                bricks[index] = new Brick(currentX, currentY, brickWidth, brickHeight);

                // Update the X-coordinate for the next brick in the same row
                currentX += brickWidth + 4; // Add some spacing between bricks
            }

            // Move to the next row and reset the X-coordinate
            currentX = startX;
            currentY += brickHeight + 4; // Add some spacing between rows

         */

    private void createBricks(BrickCreationParameters parameters) {
        int rows = parameters.getRows();
        int cols = parameters.getCols();
        int brickWidth = parameters.getBrickWidth();
        int brickHeight = parameters.getBrickHeight();
        int startX = parameters.getStartX();
        int startY = parameters.getStartY();
        int spacing = parameters.getSpacing();

        bricks = new Brick[rows * cols];

        int currentX = startX;
        int currentY = startY;

        for (int row = 0; row < rows; row++) {
            createBricksInRow(row, cols, brickWidth, brickHeight, currentX, currentY, spacing);
            currentX = startX;
            currentY += brickHeight + spacing; // Add some spacing between rows
        }
    }

    private void createBricksInRow(int row, int cols, int brickWidth, int brickHeight, int startX, int startY, int spacing) {
        for (int col = 0; col < cols; col++) {
            int index = row * cols + col;
            bricks[index] = new Brick(startX, startY, brickWidth, brickHeight);
            startX += brickWidth + spacing; // Add some spacing between bricks
        }
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
        int rows = 2;
        int cols = 6;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int index = row * cols + col;
                bricks[index].draw(g);

            }

        }
    }
}

