package chapter8;

public enum Region {
    SOUTH_EAST("Abia","Imo","Enugu"),
    SOUTH_SOUTH("Akwa-Ibom", "Edo","Delta"),
    NORTH_CENTRAL("Kwara","Plateau","Benue");



    private final String[] states;

    Region(String... states){
        this.states = states;
        System.out.println("I am now creating" + this.name());
    }

    public String[] getStates() {
        return states;
    }
}
