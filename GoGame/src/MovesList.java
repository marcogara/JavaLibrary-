import java.util.LinkedHashMap;
import java.util.Map;



public class MovesList {

    public static  Map<String, Integer> movesList ;


    public void setMovesList(Map<String, Integer> movesList) {
        this.movesList = movesList;
    }

    public MovesList() {
        this.movesList = new LinkedHashMap<>();
    }

    public static void getGameMap(MovesList gameMap1) {

        for (String key : movesList.keySet()) {
            System.out.println(key + ": " + movesList.get(key));
        }

        // to reverse the order of the moves

        //  List<Map.Entry<String, Integer>> list = new ArrayList<>(gameMap.entrySet());
        // Collections.reverse(list);

        // System.out.println("this is in GoGame  main: reverse ?  "+ gameMap+ " "+gameMapCounter);

        // for (Map.Entry<String, Integer> entry : list) {
        //  System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }

        // return movesList;
    }

    public void put(String moveMapStringValue, int gameMapCounter) {

        this.movesList.put(moveMapStringValue,gameMapCounter);
    }


}
