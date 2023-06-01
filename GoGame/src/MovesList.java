import java.util.*;


public class MovesList {

    private static boolean legalMove;

    public static  Map<String, Integer> movesList ;


    public void setMovesList(Map<String, Integer> movesList) {
        this.movesList = movesList;
    }

    public MovesList() {
        this.movesList = new LinkedHashMap<>();
    }

    public static void getGameMap(MovesList gameMap1) {

        // reverse the list to print in front the last move

         List<Map.Entry<String, Integer>> list = new ArrayList<>(movesList.entrySet());
        Collections.reverse(list);

        System.out.println("Move list .. ");

        for (Map.Entry<String, Integer> entry : list) {
          System.out.print(" [ "+entry.getKey() + " : " + entry.getValue()+ " ] ");

        // for (String key : movesList.keySet()) {      function but not in reverse

          //   System.out.print(" [ "+ key + ": " + movesList.get(key)+ " ] ");    function but not in reverse

            // System.out.println(movesList);    for debug
        }

    }

    public static void put(String moveMapStringValue, int gameMapCounter) {

        movesList.put(moveMapStringValue,gameMapCounter);
    }


    public boolean isLegalMove(String a, String b) {

        if (movesList.containsKey(a)) {
            System.out.println("Value " + a + " is present in the list.");
            this.setLegalMove(false);
        } else {
            if (movesList.containsKey(b)) {
                System.out.println("Value " + b + " is present in the list.");
                this.setLegalMove(false);
            } else{
                System.out.println("Value " + a + " is not present in the list.");
                this.setLegalMove(true);
            }

        }
        return legalMove;
    }
    public boolean isLegalMove() {
        return legalMove;
    }

    public void setLegalMove(boolean legalMove) {
        this.legalMove = legalMove;
    }

}






