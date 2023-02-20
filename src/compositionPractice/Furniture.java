package compositionPractice;

public class Furniture {
    private String type;
    private String colour;

    public Furniture(String type, String colour){
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
