package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String itemName;
    private double price;
    private  String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String itemName, double price, String description, String category, String dateAdded){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.parse(dateAdded);
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
    public boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysOnMenu = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysOnMenu < 30;
    }

    @Override
    public String toString(){
        String checkNew = isNew() ? " *** NEW ITEM ***": "";
        return itemName + checkNew + "\n" + description + " | $" + price;
    }
}
