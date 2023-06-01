import java.util.HashMap;
import java.util.Map;

public class Board {

    private int gameID;

    public static char[][] board; // GUI array to display the game

    // public static Map<String, Integer> gameMap ;
   //  private static int gameMapIntValue = 0;

    // public static int getGameMapIntValue() {
        // return gameMapIntValue;
   //  }

    // public static void setGameMapIntValue(int gameMapIntValue) {
      //   Board.gameMapIntValue = gameMapIntValue;
    // }

    // public Map<String, Integer> getGameMap() {
        // return gameMap;
    // }

    // public void setGameMap(Map<String, Integer> gameMap) {
       //  this.gameMap = gameMap;
    // }

    public Board(int rows, int cols) {
        this.board = new char[rows][cols];
        fillUpGrid();
    }

    private void fillUpGrid() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < board[0].length; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // logic to transform x coordinate into int type

    public static int charToInt(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 1;
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a' + 1;
        } else {
            throw new IllegalArgumentException("Invalid input: " + c);
        }
    }

  //   public void blackFirstMove(HumanPlayer me) {

           //   HumanPlayer.askMoveHumanPlayer();

       //  else
            // ComputerPlayer.askMoveComputerPlayer();

  //   }

   //  public void blackFirstMove(ComputerPlayer cp) {

      //   ComputerPlayer.askMoveComputerPlayer();


}





