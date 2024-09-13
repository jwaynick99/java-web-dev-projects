package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private static ArrayList<MenuItem> items = new ArrayList<>();

    public void setItem(MenuItem item){
        items.add(item);
    }
    //MenuItem dish = new MenuItem("Spaghetti", 8.99, "pasta dish", "entree", LocalDate.of(1700, 10, 9));
}
