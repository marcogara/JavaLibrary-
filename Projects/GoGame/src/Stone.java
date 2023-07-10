public abstract class Stone extends StoneColor{

    private char x;
    private int y;
    private stoneColor color;
    private int stoneCount = 0;

    public int getStoneCount() {
        return stoneCount;
    }

    public void setStoneCount(int stoneCount) {
        this.stoneCount = stoneCount;
    }

    public stoneColor getColor() {
        return color;
    }

    public void setColor(stoneColor color) {
        this.color = color;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
