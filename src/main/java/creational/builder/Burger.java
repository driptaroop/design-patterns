package creational.builder;

/**
 * Created by drdas on 02/11/16.
 */
public abstract class Burger {
    protected abstract String material();

    @Override
    public String toString() {
        return material() + "Burger";
    }
}
