package creational.singleton;

/**
 * Created by drdas on 02/11/16.
 */
public class MainClass {

    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        //obj1 returns 1
        System.out.println(obj1.getI());
        //setting 2 to obj2
        obj2.setI(2);
        //obj1 will return 2 proving that obj1 and obj2 are same object
        System.out.println(obj1.getI());
    }

}
