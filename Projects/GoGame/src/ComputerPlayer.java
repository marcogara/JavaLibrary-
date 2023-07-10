import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer extends Player {

    public ComputerPlayer(){

    }

    public static void askMoveComputerPlayer(ComputerPlayer cp,MovesList movesList, int gameMapCounter) throws InterruptedException {



        char yMove = 'a';
        int xMove = 0;


        do{

            Random random = new Random();
            yMove = (char) (Math.random() * 9 + 'A');
            // System.out.println(xMove);
            xMove = random.nextInt(9) + 1;
            // Thread.sleep(4000); // sleep for 4 second

            // char xMove = 'a';
            // int yMove =0;


            // System.out.println(yMove);

            // logic to prove if the move is legal before placing the stone
            String moveToCheck = yMove + " " + xMove + " " + "(#)";
            String moveToCheck1 = yMove + " " + xMove + " " + "( )";
            movesList.isLegalMove(moveToCheck, moveToCheck1);

        } while (movesList.isLegalMove() == false);

        if (cp.getPlayerColor() == stoneColor.BLACK)
        {
            BlackStone.positionBlackStone(xMove, yMove, movesList, gameMapCounter);

        }

        else{
            WhiteStone.positionWhiteStone(xMove, yMove, movesList, gameMapCounter);
        }

            // Board.printBoard(); Old board

            Grid.printGridTest();
            System.out.println();

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










































