

public class WhiteStone extends Stone {



    public stoneColor getColor() {
        return super.getColor();
    }

    public void setColor(stoneColor color) {
        super.setColor(stoneColor.WHITE);
    }



    public static void positionWhiteStone(char x, int y)
    {

        // int moveMapIntValue=Board.getGameMapIntValue();

        String moveMapStringValue = x+" "+y+" "+"O";

        int yMove =Board.charToInt(x);
        // System.out.println(xMove);
        int xMove= y;
        // System.out.println(yMove);
        Board.board[xMove-1][yMove-1] = 'O';

        Board.setGameMapIntValue(+1);

        Board.gameMap.put(moveMapStringValue,Board.getGameMapIntValue());

    }

}
