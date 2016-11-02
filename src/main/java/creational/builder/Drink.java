package creational.builder;

/**
 * Created by drdas on 02/11/16.
 */
public abstract class Drink {
    protected abstract String getDrink();

    @Override
    public String toString() {
        return getDrink();
    }
}
