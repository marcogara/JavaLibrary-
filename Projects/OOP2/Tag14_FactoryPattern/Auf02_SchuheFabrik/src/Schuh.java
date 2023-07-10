public abstract class Schuh {
    private final String ortFabrik;

    public Schuh(String ortFabrik) {
        this.ortFabrik = ortFabrik;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "ortFabrik='" + ortFabrik + '\'' +
                '}';
    }
}

class Gummistiefel extends Schuh {
    public Gummistiefel(String ortFabrik) {
        super(ortFabrik);
    }
}

class Hausschuhe extends Schuh {
    public Hausschuhe(String ortFabrik) {
        super(ortFabrik);
    }
}

class HighHeels extends Schuh {
    public HighHeels(String ortFabrik) {
        super(ortFabrik);
    }
}

class Sneaker extends Schuh {
    public Sneaker(String ortFabrik) {
        super(ortFabrik);
    }
}

class Stiefel extends Schuh {
    public Stiefel(String ortFabrik) {
        super(ortFabrik);
    }
}

class Sandalen extends Schuh {
    public Sandalen(String ortFabrik) {
        super(ortFabrik);
    }
}
