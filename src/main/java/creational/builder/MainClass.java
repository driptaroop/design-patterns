package creational.builder;

/**
 * Created by drdas on 02/11/16.
 */
public class MainClass {

    public static void main(String[] args) {
        Meal meal = Meal.getBuilder().burger(new CheeseBurger()).drink(new CocaCola()).build();
        System.out.println(meal);
    }

}
