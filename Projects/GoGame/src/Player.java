
import java.util.Scanner;

public abstract class Player extends StoneColor {
    private String name;
    private stoneColor playerColor;

    private boolean myTurn;

    private boolean exitGame ;

    public boolean isExitGame() {
        return exitGame;
    }

    public void setExitGame(boolean exitGame) {
        this.exitGame = exitGame;
    }

    public boolean isMyTurn() {
        return myTurn;
    }

    public void setMyTurn(boolean myTurn) {
        this.myTurn = myTurn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public stoneColor getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(stoneColor playerColor) {
        this.playerColor = playerColor;
    }

    // public enum playerType { HUMAN, COMPUTER};



}
