import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GoGame {

    public static void main(String[] args) throws InterruptedException {

        int firstmove = 0;

        // GameBoard board = new GameBoard();

        Board gameTest = new Board(9,9);
        Scanner scanner = new Scanner(System.in);

        HumanPlayer me = new HumanPlayer();

        ComputerPlayer cp = new ComputerPlayer();

        cp.assignColor(me.decideColor());

        System.out.println();
        System.out.println("Black starts ... ");
        System.out.println();

        do {

            // logic to make black move first
            if (me.getPlayerColor() == StoneColor.stoneColor.BLACK)

            {
                while (me.isExitGame())

                me.setPlayerColor(StoneColor.stoneColor.BLACK);
                cp.setPlayerColor(StoneColor.stoneColor.WHITE);
                me.setMyTurn(true);
                if(firstmove == 0)
                {
                    gameTest.printBoard();
                    firstmove++;
                }

                // System.out.println("  You are 'X' ");
                me.askMoveHumanPlayer(me);
                me.setMyTurn(false);

                if (!me.isExitGame())
                {
                    cp.askMoveComputerPlayer(cp);
                    // for control of map Move
                    System.out.println(Board.gameMap);

                    me.setMyTurn(true);

                }

            }

            if (me.getPlayerColor() == StoneColor.stoneColor.WHITE)
            {
                me.setPlayerColor(StoneColor.stoneColor.WHITE);
                cp.setPlayerColor(StoneColor.stoneColor.BLACK);
                // cp.setMyTurn(true);
                cp.askMoveComputerPlayer(cp);
                // cp.setMyTurn(false);
                System.out.println();
                me.setMyTurn(true);

                if (!me.isExitGame())
                {
                    me.askMoveHumanPlayer(me);
                    me.setMyTurn(false);
                }
            }

        }        while (!me.isExitGame());





        // gameTest.printBoard();

        }


}

