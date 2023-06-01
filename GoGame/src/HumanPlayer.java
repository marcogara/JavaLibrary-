import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player{
    ComputerPlayer cp ;

    public HumanPlayer()
    {
        this.setExitGame(false);
        this.setMyTurn(false);

    }

    public stoneColor decideColor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to play with black or 2 to play with white.");

        int stoneSelector = scanner.nextInt();

        switch (stoneSelector) {
            case 1 :    {
                this.setPlayerColor(stoneColor.BLACK);

                break;
            }

            case  2 :           {

                this.setPlayerColor(stoneColor.WHITE);
                break;
            }
            default:
                System.out.println(" select 1 or 2 please...");
        }

        System.out.println("Game start, you are : "+ this.getPlayerColor());

       // System.out.println(" computer ist : "+ cp.getPlayerColor());

        return getPlayerColor();
    }

    public void askMoveHumanPlayer(HumanPlayer me, MovesList movesList, int gameMapCounter) throws InterruptedException {
        // stoneColor humanPlayerColor = stoneColor.BLACK;

        char yMove = 'a';
        int xMove = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            // ask for the letter
            while (true) {
                try {
                    System.out.println();
                    System.out.println("Play your move - give a letter first:                             exit the game with:  'q'");
                    yMove = scanner.next().charAt(0);
                    yMove = Character.toUpperCase(yMove);

                    if (yMove >= 'A' && yMove <= 'I') { // check if input is valid\r
                        break; // exit loop if valid input is received\r
                    }
                    if (yMove == 'q') {

                        me.setExitGame(true);
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a single letter from A to I.");
                        scanner.nextLine(); // clear buffer before next iteration of loop
                    }
                } catch (InputMismatchException e) { // catch non-character inputs
                    System.out.println("Invalid input. Please enter a single letter.");
                    scanner.nextLine(); // clear buffer before next iteration of loop
                }
            }
            if (me.isExitGame() == true) {
            System.out.println("game over..");
            return;
            }

                // ask for the number
                while (true) {
                    try {
                        System.out.println("give a Number now: ");
                        xMove = scanner.nextInt();
                        if (xMove >= 1 && xMove <= 9) { // check if input is valid\r
                            break; // exit loop if valid input is received
                        } else {
                            System.out.println("Invalid input. Please enter a single number from 1 to 9.");
                        }
                        scanner.nextLine(); // clear buffer before next iteration of looprn
                    } catch (
                            InputMismatchException e) {                                                  // catch non-integer inputs for yMovern
                        System.out.println("Invalid input. Please enter an integer for the number.");
                        scanner.nextLine(); // clear buffer before next iteration of looprn
                    }
                }

                // logic to prove if the move is legal before placing the stone
                String moveToCheck = yMove + " " + xMove + " " + "(#)";
                String moveToCheck1 = yMove + " " + xMove + " " + "( )";
                movesList.isLegalMove(moveToCheck, moveToCheck1);

        } while (movesList.isLegalMove() == false);


                // logic to select if player move black or white stone

                if (me.getPlayerColor() == stoneColor.BLACK) {
                    BlackStone.positionBlackStone(xMove, yMove, movesList, gameMapCounter);

                } else {
                    WhiteStone.positionWhiteStone(xMove, yMove, movesList, gameMapCounter);
                }

                // Board.printBoard(); Old board

                Grid.printGridTest(me);

                System.out.println();

                System.out.println("Computer is thinking ... ");

                Thread.sleep(2000); // sleep for 8 second

                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

        // return gameMapCounter;

    }
}


