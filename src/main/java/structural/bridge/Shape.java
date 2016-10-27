package structural.bridge;

/**
 * Created by drdas on 27/10/16.
 */
public abstract class Shape {

    private Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public abstract void drawShape();
}
