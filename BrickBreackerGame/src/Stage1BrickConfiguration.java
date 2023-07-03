import java.awt.*;

public class Stage1BrickConfiguration {
        private int rows;
        private int cols;
        private int brickWidth;
        private int brickHeight;
        private int startX;
        private int startY;
        private int spacing;

        public Stage1BrickConfiguration() {
            rows = 2;
            cols = 6;
            brickWidth = 120;
            brickHeight = 20;
            startX = 30;
            startY = 60;
            spacing = 4;
        }

        public Brick[] createBricks() {
            Brick[] bricks = new Brick[rows * cols];
            int currentX = startX;
            int currentY = startY;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int index = row * cols + col;
                    bricks[index] = new Brick(currentX, currentY, brickWidth, brickHeight);
                    currentX += brickWidth + spacing;
                }
                currentX = startX;
                currentY += brickHeight + spacing;
            }

            return bricks;
        }
    }



