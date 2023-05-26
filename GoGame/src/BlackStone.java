import java.util.Map;

public class BlackStone extends Stone {

    private stoneColor color;

    public static int positionBlackStone(char x, int y, MovesList movesList, int gameMapCounter) {



            String moveMapStringValue = x+" "+y+" "+"X";

            int yMove =Board.charToInt(x);
            // System.out.println(xMove);
            int xMove= y;
            // System.out.println(yMove);
            Board.board[xMove-1][yMove-1] = 'X';

            gameMapCounter++;



        MovesList.movesList.put(moveMapStringValue,gameMapCounter);

        // gameMap1.put(moveMapStringValue,gameMapCounter);  old


            return gameMapCounter;
        }

    public stoneColor getColor() {
        return color;
    }

    public void setColor(stoneColor color) {
        this.color = stoneColor.BLACK;
    }

}
