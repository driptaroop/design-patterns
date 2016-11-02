package creational.builder;

/**
 * Created by drdas on 02/11/16.
 */
public class Meal {
    private Burger burger;
    private Drink drink;

    private Meal(MealBuilder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public static MealBuilder getBuilder(){
        return new MealBuilder();
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                '}';
    }

    public static class MealBuilder{
        private Burger burger;
        private Drink drink;

        public MealBuilder burger(Burger burger) {
             this.burger = burger;
            return this;
        }

        public MealBuilder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }
    }
}
