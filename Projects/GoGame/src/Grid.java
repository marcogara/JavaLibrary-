public class Grid {

    public static String[][] gridTest; // GUI array to display the game

    public Grid(int rows, int cols) {
        this.gridTest = new String[rows][cols];
        fillUpGridTest();
    }

    private void fillUpGridTest() {
        for (int i = 0; i < gridTest.length; i++) {

            for (int j = 0; j < gridTest.length; j++) {

                gridTest[i][j] = "--|-";
                if(i==0 && j==0)
                    gridTest[i][j] = "  |‾";
                if(i==0 && j >0 )
                    gridTest[i][j] = "‾‾|‾";
                if(i==0 && j == gridTest.length-1)
                    gridTest[i][j] = "‾‾| ";

                if(i!=0 && j==0)
                    gridTest[i][j] = "  |-";
                if(i !=0 && j == gridTest.length-1 )
                    gridTest[i][j] = "--| ";

                if(i==gridTest.length-1 && j == 0 )
                    gridTest[i][j] = "  |_";
                if(i==gridTest.length-1 && j > 0 )
                    gridTest[i][j] = "__|_";
                if(i==gridTest.length-1 && j == gridTest.length-1 )
                    gridTest[i][j] = "__| ";
            }
        }
    }
    public static void printGridTest(HumanPlayer me) {

        String humanPlayerSymbol ;
        String computerPlayerSymbol ;

        if (me.getPlayerColor() == StoneColor.stoneColor.BLACK)
        {
            humanPlayerSymbol = " (#)";
            computerPlayerSymbol = " ( )";
        }
        else{
            humanPlayerSymbol = " (#)";
            computerPlayerSymbol = " ( )";
        }

        System.out.print("     ");
        for (int i = 0; i < gridTest[0].length; i++) {
            System.out.print((char) ('A' + i) + "   ");
        }
        System.out.println();

        for (int i = 0; i < gridTest.length; i++) {

            System.out.print(i+1 + "  ");

            for (int j = 0; j < gridTest[i].length; j++) {

                if( i== 2 && j == gridTest[i].length-1){
                    System.out.print(gridTest[i][j]+"                             You are :   "+humanPlayerSymbol);
                    break;
                }
                if ( i== 3 && j == gridTest[i].length-1)
                    System.out.print(gridTest[i][j]+"                             Computer is:"+computerPlayerSymbol);
                else
                    System.out.print(gridTest[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printGridTest() {
        System.out.print("     ");
        for (int i = 0; i < gridTest[0].length; i++) {
            System.out.print((char) ('A' + i) + "   ");
        }
        System.out.println();

        for (int i = 0; i < gridTest.length; i++) {

            System.out.print(i+1 + "  ");


            for (int j = 0; j < gridTest[i].length; j++) {

                    System.out.print(gridTest[i][j]);
            }

            System.out.println();
        }
        System.out.println();
    }

    /*
     alternative idea for terminal gui
    public void printGrid1() {



        System.out.println(" |‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾|‾‾‾‾‾| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |-----|-----|-----|-----|-----|-----|-----|-----|-----| ");
        System.out.println(" |     |     |     |     |     |     |     |     |     | ");
        System.out.println(" |_____|_____|_____|_____|_____|_____|_____|_____|_____| ");

        System.out.println();
        System.out.println();

    }


     */

/*
                        only as reference this is how the grid look like

        System.out.println("    A   B   C   D   E   F   G   H   I   ");
        System.out.println(" 1  |‾‾‾|‾‾‾|‾‾‾|‾‾‾|‾‾‾|‾‾‾|‾‾‾|‾‾‾| ");
        System.out.println(" 2  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 3  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 4  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 5  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 6  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 7  |---|---|---|---|---|---|---|---| ");
        System.out.println(" 8  |---|---|--(#)--|---|---|---|---| ");
        System.out.println(" 9  |___|___|___|___|___|___|___|___| ");

    */

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

        }








