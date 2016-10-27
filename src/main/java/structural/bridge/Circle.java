package structural.bridge;

/**
 * Created by drdas on 27/10/16.
 */
public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void drawShape() {
        System.out.printf("Drew Circle ");
        getColour().fillColor();
    }
}
