public class Adapter extends NeueAPI {

    LegacyAPI legacyAPI;


    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += LegacyAPI.addNumbers(sum, numbers[i]);
        }
        return sum;
    }

}
