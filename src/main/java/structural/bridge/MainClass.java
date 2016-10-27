package structural.bridge;

/**
 * Created by drdas on 27/10/16.
 */
public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(new BlueColour());
        circle.drawShape();
    }
}
