import java.util.Map;

public class BlackStone extends Stone {

    private stoneColor color;

    public static int positionBlackStone(int x,char y, MovesList movesList, int gameMapCounter) {



            int xMove= x;
            int yMove =Board.charToInt(y);
            // System.out.println(xMove);

            // System.out.println(yMove);

        // Old use for Board old type
        //             Board.board[xMove-1][yMove-1] = 'X';

        if (yMove == 1) {
           //  if(xMove ==1 && yMove ==9)
            Grid.gridTest[xMove-1][yMove-1] = " (#)";

        }
        else {

            if(xMove ==1 && yMove !=1)
                Grid.gridTest[xMove-1][yMove-1] = "‾(#)";

            else {
                if (xMove == 9)  Grid.gridTest[xMove-1][yMove-1] = "_(#)";

                    else                Grid.gridTest[xMove-1][yMove-1] = "-(#)";

            }

        }

        // System.out.println(xMove +" xMove ");     for debug
        // System.out.println(yMove +" yMove ");     for debug

            gameMapCounter++;

        String moveMapStringValue = y +" "+x +" "+"(#)";

        MovesList.put(moveMapStringValue,gameMapCounter);     // encapsulation in class

        // MovesList.movesList.put(moveMapStringValue,gameMapCounter);    function but not encapsulated

            return gameMapCounter;
        }

    public stoneColor getColor() {
        return color;
    }

    public void setColor(stoneColor color) {
        this.color = stoneColor.BLACK;
    }

}
