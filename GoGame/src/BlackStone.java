import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackStone extends Stone {

    private stoneColor color;

    public static void positionBlackStone(char x, int y) {



            String moveMapStringValue = x+" "+y+" "+"X";

            int yMove =Board.charToInt(x);
            // System.out.println(xMove);
            int xMove= y;
            // System.out.println(yMove);
            Board.board[xMove-1][yMove-1] = 'X';

        // Board.setGameMapIntValue(+1);
        Board.setGameMapIntValue(+1);

        Board.gameMap.put(moveMapStringValue,Board.getGameMapIntValue());
        }

    public stoneColor getColor() {
        return color;
    }

    public void setColor(stoneColor color) {
        this.color = stoneColor.BLACK;
    }

}
