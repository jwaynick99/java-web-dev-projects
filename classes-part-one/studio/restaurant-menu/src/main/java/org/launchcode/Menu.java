package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private static ArrayList<MenuItem> items = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public void setItem(MenuItem item){
        items.add(item);
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem removeItem){
        items.remove(removeItem);
        lastUpdated = LocalDate.now();
    }

    @Override
    public String toString(){
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item: items){
            if (item.getCategory().equals("appetizer")){
                appetizer.append("\n").append(item).append("\n");
            }
        }
        StringBuilder entree = new StringBuilder();
        for (MenuItem item: items){
            if (item.getCategory().equals("entree")){
                entree.append("\n").append(item).append("\n");
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item: items){
            if (item.getCategory().equals("dessert")){
                dessert.append("\n").append(item).append("\n");
            }
        }
        return "\nStudio Food Place\n"  + "\n *** Appetizers ***\n" + appetizer.toString() + "\n*** Entrees *** \n"  + entree.toString() + "\n*** Desserts ***\n" + dessert.toString() + "\n\nMenu last updated: " + lastUpdated;
    }


    //MenuItem dish = new MenuItem("Spaghetti", 8.99, "pasta dish", "entree", LocalDate.of(1700, 10, 9));
}
