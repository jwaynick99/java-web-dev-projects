package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem dish1 = new MenuItem("Spaghetti and Meatballs", 8.99,
                "Perfect Al dente pasta with a Tomato Sauce and Meatballs", "entree", "1700-12-25");

        MenuItem dish2 = new MenuItem("Cheese Fries", 5.99, "Crispy Fried Potatoes Covered" +
                "in a Melty Cheese Sauce", "appetizer", "2024-08-24");

        MenuItem dish3 = new MenuItem("Tiramisu", 7.99, "Ladyfingers Dipped in Coffee and " +
                "Layered with Delicous Cream", "dessert", "1973-08-19");

        MenuItem dish4 = new MenuItem("Pizza", 12.99, "Large Pizza with Two Toppings of " +
                "your Choice", "entree", "1976-06-13");

        MenuItem dish5 = new MenuItem("Hot Ham Water", 99.99, "Yep", "appetizer",
                "1996-10-04");

        MenuItem dish6 = new MenuItem("Cherry Cheesecake", 8.99, "Silky Cheesecake Topped with " +
                "Cherries", "dessert", "2024-09-16");

        Menu StudioMenu = new Menu();
        StudioMenu.setItem(dish1);
        StudioMenu.setItem(dish2);
        StudioMenu.setItem(dish3);
        StudioMenu.setItem(dish4);
        StudioMenu.setItem(dish5);
        StudioMenu.setItem(dish6);

        System.out.println(StudioMenu);
    }
}
