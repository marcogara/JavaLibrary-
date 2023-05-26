import java.util.Map;

public class WhiteStone extends Stone {



    public stoneColor getColor() {
        return super.getColor();
    }

    public void setColor(stoneColor color) {
        super.setColor(stoneColor.WHITE);
    }



    public static int positionWhiteStone(char x, int y,MovesList movesList, int gameMapCounter)
    {

        // int moveMapIntValue=Board.getGameMapIntValue();

        String moveMapStringValue = x+" "+y+" "+"O";

        int yMove =Board.charToInt(x);
        // System.out.println(xMove);
        int xMove= y;
        // System.out.println(yMove);
        Board.board[xMove-1][yMove-1] = 'O';

        gameMapCounter++;

        MovesList.movesList.put(moveMapStringValue,gameMapCounter);

        // gameMap1.put(moveMapStringValue,gameMapCounter);  old



        return gameMapCounter;

    }

}
