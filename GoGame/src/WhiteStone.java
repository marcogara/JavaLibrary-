import java.util.Map;

public class WhiteStone extends Stone {

    public stoneColor getColor() {
        return super.getColor();
    }

    public void setColor(stoneColor color) {
        super.setColor(stoneColor.WHITE);
    }

    public static int positionWhiteStone(int x, char y, MovesList movesList, int gameMapCounter)
    {

        // int moveMapIntValue=Board.getGameMapIntValue();

        // Print the with stone in the correct position of the board with the x y coordinates
        int xMove = x;
        int yMove =Board.charToInt(y);
        // System.out.println(xMove);

        // System.out.println(yMove);

        // Old use for Board old type
        // Board.board[xMove-1][yMove-1] = 'O';

        // This logic assure to print the correct format on the edge of the board and on the first line

        if (yMove == 1) {
            //  if(xMove ==1 && yMove ==9)
            Grid.gridTest[xMove-1][yMove-1] = " ( )";

        }
        else {

            if(xMove ==1 && yMove !=1)
                Grid.gridTest[xMove-1][yMove-1] = "‾( )";   // print at the top only first raw , if its not the first in the corner left

            else {
                if (xMove == 9)  Grid.gridTest[xMove-1][yMove-1] = "_( )";

                else                Grid.gridTest[xMove-1][yMove-1] = "-( )";

            }

        }

        // create a string for the moves list


        String moveMapStringValue = y +" " + x +" "+"( )";

        gameMapCounter++;

        MovesList.put(moveMapStringValue,gameMapCounter);     // encapsulation in class

        // MovesList.movesList.put(moveMapStringValue,gameMapCounter);    function but not encapsulated

        // gameMap1.put(moveMapStringValue,gameMapCounter);  old

        return gameMapCounter;

    }




}
