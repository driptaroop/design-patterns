package structural.composite;

import java.util.Arrays;

/**
 * Created by drdas on 28/10/16.
 */
public class MainClass {

    public static void main(String[] args) {
        Employee sub1 = new Employee(2, "sub1");
        Employee sub2 = new Employee(3, "sub2");
        Employee manager = new Employee(1, "manager");
        manager.setSubordinates(Arrays.asList(sub1, sub2));

        System.out.println(manager);
    }

}
