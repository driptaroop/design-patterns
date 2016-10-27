package structural.bridge;

/**
 * Created by drdas on 27/10/16.
 */
public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    @Override
    public void drawShape() {
        System.out.printf("Drew Square ");
        getColour().fillColor();
    }
}
