package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String itemName;
    private double price;
    private  String description;
    private String category;
    private final LocalDate dateAdded;
    private boolean isNew;

    public MenuItem(String itemName, double price, String description, String category, LocalDate dateAdded){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = isNewItem();
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aNew) {
        isNew = aNew;
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
    public boolean isNewItem() {
        long daysSinceAdded = ChronoUnit.DAYS.between(dateAdded, LocalDate.now());
        if (daysSinceAdded <= 14) {
            return true;
        } else {
            return false;
        }
    }
}
