public class Kap05 {

    public static void main(String[] args) {

        String month = "Januar";
        int days = 0;
        switch (month) {
            case "Januar":
            case "März":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                days = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                days = 30;
                break;
            case "Februar":
                days = 28; // oder 29, wenn Schaltjahr
                break;
            default:
                System.out.println("Ungültiger Monatsname!");
                days=0;
        }
        if(days !=0) {
            System.out.println("Der "+month+" hat "+days+" Tage.");
        }
    }
}

