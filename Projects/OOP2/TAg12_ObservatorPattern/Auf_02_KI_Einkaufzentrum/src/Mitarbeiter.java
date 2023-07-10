public class Mitarbeiter implements KundeGruessen {
    //  Die Grüßen-Methode macht nichts anderes, als testweise eine Begrüßung auf dem Bildschirm auszugeben.
    //  Da die KI japanisch ist, sagt sie "Irasshaimase!" als Mitarbeiter und "Irasshaimase!!!" als Geschäftsführer.
    @Override
    public void gruessen() {
        System.out.println("Irasshaimase!");


    }
}
