import java.awt.Color;
import java.awt.Graphics;

    public class Platform {
        private int x;          // X position of the platform
        private int y;          // Y position of the platform
        private int width;      // Width of the platform
        private int height;     // Height of the platform

        public Platform(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void move(int dx) {
            x += dx;
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

        public void draw(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, width, height);
        }
    }


