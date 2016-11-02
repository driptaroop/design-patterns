package creational.singleton;

/**
 * Created by drdas on 02/11/16.
 */
public class SingletonClass {

    private static SingletonClass instance;
    private SingletonClass(){}

    private int i = 1;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static SingletonClass getInstance() {
        if(null == instance)
            instance = new SingletonClass();
        return instance;
    }
}
