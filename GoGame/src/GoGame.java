import java.util.*;

public class GoGame {

    public static void main(String[] args) throws InterruptedException {

        int firstmove = 0;
        int gameMapCounter= 0;

        Board gameTest = new Board(9,9);

        MovesList gameMap1 = new MovesList();

        HumanPlayer me = new HumanPlayer();

        ComputerPlayer cp = new ComputerPlayer();

        cp.assignColor(me.decideColor());

        System.out.println();
        System.out.println("Black starts ... ");
        System.out.println();

        do {

            // logic to make black move first
            if (me.getPlayerColor() == StoneColor.stoneColor.BLACK)          // I enter here only if I choose black

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
                me.askMoveHumanPlayer(me,gameMap1,gameMapCounter);
                gameMapCounter++;
                // System.out.println("this is in GoGame  main "+ gameMap+ " "+gameMapCounter);                 // debug
                me.setMyTurn(false);

                if (!me.isExitGame())
                {
                    cp.askMoveComputerPlayer(cp,gameMap1,gameMapCounter);
                    gameMapCounter++;

                    MovesList.getGameMap(gameMap1);
                    // System.out.println(gameMap1);

                    me.setMyTurn(true);
                }
            }

            if (me.getPlayerColor() == StoneColor.stoneColor.WHITE)
            {
                me.setPlayerColor(StoneColor.stoneColor.WHITE);
                cp.setPlayerColor(StoneColor.stoneColor.BLACK);
                // cp.setMyTurn(true);
                cp.askMoveComputerPlayer(cp, gameMap1, gameMapCounter);
                // cp.setMyTurn(false);
                System.out.println();
                me.setMyTurn(true);

                if (!me.isExitGame())
                {
                    me.askMoveHumanPlayer(me, gameMap1,gameMapCounter);
                    me.setMyTurn(false);
                }
            }

        }        while (!me.isExitGame());

        // gameTest.printBoard();

        }


}

