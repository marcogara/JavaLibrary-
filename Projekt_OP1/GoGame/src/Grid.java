
public class Grid {
    private static char[][] grid;

    public Grid(int rows, int cols) {
        this.grid = new char[rows][cols];
        fillUpGrid();
    }



    private void fillUpGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }
    }

    public static int charToInt(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 1;
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a' + 1;
        } else {
            throw new IllegalArgumentException("Invalid input: " + c);
        }
    }

    public static void positionStoneX(char x, int y)
    {
        int yMove =charToInt(x);
        // System.out.println(xMove);
        int xMove= y;
        // System.out.println(yMove);
        grid[xMove-1][yMove-1] = 'X';

                }

    public static void positionStoneO(char x, int y) {

        int yMove =charToInt(x);
        // System.out.println(xMove);
        int xMove= y;
        // System.out.println(yMove);
        grid[xMove-1][yMove-1] = 'O';


    }


    public static void printGrid() {
        System.out.print("  ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}