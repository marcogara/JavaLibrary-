import java.util.Map;
import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(){

    }

    public static void askMoveComputerPlayer(ComputerPlayer cp,MovesList movesList, int gameMapCounter) throws InterruptedException {

            // Thread.sleep(4000); // sleep for 4 second

            // char xMove = 'a';
            // int yMove =0;
            Random random = new Random();
            char xMove = (char) (Math.random() * 9 + 'A');

            // System.out.println(xMove);

            int yMove = random.nextInt(9) + 1;

            // System.out.println(yMove);

            if (cp.getPlayerColor() == stoneColor.BLACK)
            {
                BlackStone.positionBlackStone(xMove, yMove, movesList, gameMapCounter);

            }

            else{
                WhiteStone.positionWhiteStone(xMove, yMove, movesList, gameMapCounter);
            }

            Board.printBoard();
            System.out.println();

        if (cp.getPlayerColor() == stoneColor.BLACK)
        {
            System.out.println(" you are     :     O");
            System.out.println(" computer is :     X");
            System.out.println();
        }

        else{
            System.out.println(" you are     :     X");
            System.out.println(" computer is :     O");
            System.out.println();
        }
        // return gameMapCounter;
        }

    public void assignColor(stoneColor stoneColor) {

        if(stoneColor == StoneColor.stoneColor.BLACK)
            this.setPlayerColor(stoneColor.WHITE);
        else
        this.setPlayerColor(stoneColor.BLACK);


         System.out.println(" computer ist : "+ this.getPlayerColor());
    }
}
