import java.util.ArrayList;

public class Foods {
    private ArrayList < fruit > fruits = new ArrayList < fruit > ();
    private ArrayList < meal > meals = new ArrayList < meal > ();
    private ArrayList < dessert > desserts = new ArrayList < dessert > ();
    private ArrayList < nut > nuts = new ArrayList < nut > ();
    public void addFood(String foodID, String name, Integer calorie) {
        if (foodID.substring(0, 2).equals("10")) {
            fruits.add(new fruit(foodID, name, calorie));
        } else if (foodID.substring(0, 2).equals("11")) {
            desserts.add(new dessert(foodID, name, calorie));
        } else if (foodID.substring(0, 2).equals("12")) {
            meals.add(new meal(foodID, name, calorie));
        } else if (foodID.substring(0, 2).equals("13")) {
            nuts.add(new nut(foodID, name, calorie));
        } else {
            System.out.printf("this %s is not a food\n", foodID);
        }
    }
    public ArrayList < fruit > getFruits() {
        return fruits;
    }
    public ArrayList < meal > getMeals() {
        return meals;
    }
    public ArrayList < dessert > getDesserts() {
        return desserts;
    }
    public ArrayList < nut > getNuts() {
        return nuts;
    }
}
class Food {
    protected String foodID;
    protected String name;
    protected Integer calorie;
    public Food(String foodID, String name, Integer calorie) {
        this.foodID = foodID;
        this.name = name;
        this.calorie = calorie;
    }
}
class fruit extends Food {
    public fruit(String foodID, String name, Integer calorie) {
        super(foodID, name, calorie);
    }
}
class meal extends Food {
    public meal(String foodID, String name, Integer calorie) {
        super(foodID, name, calorie);
    }
}
class dessert extends Food {
    public dessert(String foodID, String name, Integer calorie) {
        super(foodID, name, calorie);
    }
}
class nut extends Food {
    public nut(String foodID, String name, Integer calorie) {
        super(foodID, name, calorie);
    }
}