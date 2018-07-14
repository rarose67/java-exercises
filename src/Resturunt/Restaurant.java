package Resturunt;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant
{
    public static void main(String[] args) {

        MenuItem burger = new MenuItem("Burger", 1.50, "A burger, on a whole-wheat bun", "main course", false);
        MenuItem HotDog = new MenuItem("Hot Dog", 1.15, "A hot-dog with ketchup", "main course", true);
        MenuItem vBurger = new MenuItem("Veggie Burger", 2.00, "A Soy-burger, on a whole-wheat bun", "main course");
        MenuItem rings = new MenuItem("Onion rings", 1.00, "Crispy onion rings", "appetizer", false);
        MenuItem cookie = new MenuItem("chocolate-chip cookie", 0.50, "Double fudge chocolate-chip cookie", "dessert", false);
        MenuItem burger2 = new MenuItem("Burger", 1.50, "A burger, on a whole-wheat bun", "main course", false);
        ArrayList<MenuItem> items = new ArrayList<>();

        items.add(burger);
        items.add(HotDog);
        items.add(vBurger);
        items.add(rings);
        items.add(cookie);

        Menu menu = new Menu("Lunch", items);

        menu.printMenu();

        System.out.println("\nBurger:  " + burger.equals(vBurger));
        System.out.println("\nBurger2:  " + burger.equals(burger2));



    }
}
