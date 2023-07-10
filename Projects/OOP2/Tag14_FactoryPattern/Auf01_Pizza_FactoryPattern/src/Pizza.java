public abstract class Pizza {
    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }
}

class MarsSalamiPizza extends Pizza {

}

class MarsSchinkenPizza extends Pizza {

}

class VenusSchinkenPizza extends Pizza {

}

class VenusSalamiPizza extends Pizza {

}


