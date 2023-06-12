class Square implements Polygon, Relatable{

    public int width;

    private String s;
    @Override
    public int getArea(int a, int b) {
        return a*b;
    }

    // a method for computing
    // the area of the Square
    public int getArea() {
        return width * width;
    }

    @Override
    public int isLargerThan(Relatable other) {
            Square otherSquare
                    = (Square) other;
            if (this.getArea() < otherSquare.getArea())
                return -1;
            else if (this.getArea() > otherSquare.getArea())
                return 1;
            else
                return 0;
        }

}

