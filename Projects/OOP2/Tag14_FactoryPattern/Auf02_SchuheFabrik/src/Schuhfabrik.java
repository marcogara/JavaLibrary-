public abstract class Schuhfabrik {
    public abstract Schuh erzeugeProdukt(Schuhart art);
}

class Nordfabrik extends Schuhfabrik {
    @Override
    public Schuh erzeugeProdukt(Schuhart art) {
        String ort = getClass().getSimpleName();
        Schuh schuh = null;
        switch (art) {
            case GUMMISTIEFEL:
                schuh = new Gummistiefel(ort);
                break;
            case HAUSSCHUHE:
                schuh = new Hausschuhe(ort);
                break;
            case SNEAKER:
                schuh = new Sneaker(ort);
                break;
            case STIEFEL:
                schuh = new Stiefel(ort);
                break;
            case HIGHHEELS:
                schuh = new HighHeels(ort);
                break;
            case SANDALEN:
                schuh = new Sandalen(ort);
                break;
        }
        System.out.println("Erstelle... " + schuh);
        return schuh;
    }

}

class Südfabrik extends Schuhfabrik {

    @Override
    public Schuh erzeugeProdukt(Schuhart art) {
        String ort = getClass().getSimpleName();
        Schuh schuh = null;
        switch (art) {
            case GUMMISTIEFEL:
                schuh = new Gummistiefel(ort);
                break;
            case HAUSSCHUHE:
                schuh = new Hausschuhe(ort);
                break;
            case SNEAKER:
                schuh = new Sneaker(ort);
                break;
            case STIEFEL:
                schuh = new Stiefel(ort);
                break;
            case HIGHHEELS:
                schuh = new HighHeels(ort);
                break;
            case SANDALEN:
                schuh = new Sandalen(ort);
                break;
        }
        System.out.println("Erstelle... " + schuh);
        return schuh;
    }

}

class Nordsüdfabrik extends Schuhfabrik {

    @Override
    public Schuh erzeugeProdukt(Schuhart art) {
        String ort = getClass().getSimpleName();
        Schuh schuh = null;
        switch (art) {
            case GUMMISTIEFEL:
                schuh = new Gummistiefel(ort);
                break;
            case HAUSSCHUHE:
                schuh = new Hausschuhe(ort);
                break;
            case SNEAKER:
                schuh = new Sneaker(ort);
                break;
            case STIEFEL:
                schuh = new Stiefel(ort);
                break;
            case HIGHHEELS:
                schuh = new HighHeels(ort);
                break;
            case SANDALEN:
                schuh = new Sandalen(ort);
                break;
        }
        System.out.println("Erstelle... " + schuh);
        return schuh;
    }

}
