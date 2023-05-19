public class Main {

    public static void main(String[] args) throws InterruptedException {
        new Main().init();
    }

    private void init() throws InterruptedException {


        // GameBoard board = new GameBoard();
        Grid grid1 = new Grid(9,9);


        while (true)
        {


            grid1.printGrid();
            System.out.println();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();
            Stone.askMoveX();
            Stone.askMoveO();

            break;
        }




    }}


