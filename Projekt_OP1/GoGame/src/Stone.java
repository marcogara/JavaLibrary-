import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Stone {

    public static void askMoveX() {
        char xMove = 'a';
        int yMove = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Play your first move - give a letter first: ");
                xMove = scanner.next().charAt(0);

                if (xMove >= 'a' && xMove <= 'i') { // check if input is valid\r
                    break; // exit loop if valid input is received\r
                } else {
                    System.out.println("Invalid input. Please enter a single letter from A to I.");
                    scanner.nextLine(); // clear buffer before next iteration of loop
                }
            } catch (InputMismatchException e) { // catch non-character inputs
                System.out.println("Invalid input. Please enter a single letter.");
                scanner.nextLine(); // clear buffer before next iteration of loop
            }
        }

        while (true) {
            try {
                System.out.println("give a Number now: ");
                yMove = scanner.nextInt();
                if (yMove >= 1 && yMove <= 9) { // check if input is valid\r
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

        Grid.positionStoneX(xMove, yMove);
        Grid.printGrid();
        System.out.println();
    }

    public static void askMoveO() throws InterruptedException {

        Thread.sleep(4000); // sleep for 1 second

        // char xMove = 'a';
        // int yMove =0;
        Random random = new Random();
        char xMove = (char) (Math.random() * 9 + 'A');

        // System.out.println(xMove);

        int yMove = random.nextInt(9) + 1;

        // System.out.println(yMove);

        Grid.positionStoneO(xMove, yMove);
        Grid.printGrid();
        System.out.println();
    }
}

/*
    public static void move() {
        char xMove ;
        int yMove;
        System.out.println("Play your first move give a letter first: ");
        
        Scanner scanner = new Scanner(System.in);
        
        xMove = scanner.next().charAt(0);
        
        System.out.println("give a Number now: ");
        yMove = scanner.nextInt();
    }
}

 */
