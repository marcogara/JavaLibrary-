public abstract class Fabrik {

    /*
          Von der abstrakten Fabrik erbt die MarsFabrik,
          welche dann in Ihrer Fabrik auf dem Mars zum Einsatz kommen wird,
          und die VenusFabrik, welche auf der Venus verwendet werden soll.
          Die abstrakte Fabrik stellt die abstrakte Methode erstellePizza
          bereit, welche die Sorte als String übergeben bekommt und das erstellte
          Pizza-Objekt zurückgibt.

     */
    abstract Pizza erstellePizza(String sorte);
}

class MarsFabrik extends Fabrik {

    // In der überschriebenen erstellePizza-Methode wird die
    // Sorte geprüft und daraufhin das passende Pizza-Objekt erstellt
    // und zurückgegeben.
    @Override
    Pizza erstellePizza(String sorte) {

        if (sorte == "salami" || sorte == "Salami")
            return new MarsSalamiPizza();
        if (sorte == "schinken" || sorte == "Schinken")
            return new MarsSchinkenPizza();

        return null;
    }
}


class VenusFabrik extends Fabrik {
    @Override
    Pizza erstellePizza(String sorte) {

        switch (sorte) {
            case "Salami":
                return new VenusSalamiPizza();
            case "Schinken":
                return new VenusSchinkenPizza();
            default:
                return null;
        }

    }
}

