package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc{
    private int storageSize;
    private int spinSpeed;
    private String name;
    private String discType;

    public BaseDisc(int storageSize, int spinSpeed, String name, String discType){
        this.storageSize = storageSize;
        this.spinSpeed = spinSpeed;
        this.name = name;
        this.discType = discType;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

}
