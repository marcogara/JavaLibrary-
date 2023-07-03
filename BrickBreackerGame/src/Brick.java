
import java.awt.Color;
import java.awt.Graphics;

    public class Brick {
        private int x;          // X position of the brick
        private int y;          // Y position of the brick
        private int width;      // Width of the brick
        private int height;     // Height of the brick
        private boolean destroyed;   // Flag to indicate if the brick is destroyed

        public Brick(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.destroyed = false;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public boolean isDestroyed() {
            return destroyed;
        }

        public void setDestroyed(boolean destroyed) {
            this.destroyed = destroyed;
        }

        public void draw(Graphics g) {
            if (!destroyed) {
                g.setColor(new Color(54, 110, 59));
                g.fillRect(x, y, width, height);
            }
        }
    }



