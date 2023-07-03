 import java.awt.Color;
        import java.awt.Graphics;

public class Ball {
    private int x;          // X position of the ball
    private int y;          // Y position of the ball
    private int radius;     // Radius of the ball
    private int dx;         // X direction of the ball's movement
    private int dy;         // Y direction of the ball's movement

    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = 1;      // Initial X direction
        this.dy = -1;     // Initial Y direction
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void reverseDirectionX() {
        dx = -dx;
    }

    public void reverseDirectionY() {
        dy = -dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}


