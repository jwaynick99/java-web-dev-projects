package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    private ArrayList<String> contents = new ArrayList<>();
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(int storageSize, int spinSpeed, String name, ArrayList<String> contents, String discType){
        super(storageSize, spinSpeed, name, discType);
        this.contents = contents;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void addContents(String content){
        this.contents.add(content);
    }

    public void spinDisc(){
        System.out.println("Spinning...   RPMS: " + getSpinSpeed());
    }

    @Override
    public void dataSize() {
        System.out.println(getStorageSize());
    }

    @Override
    public void writeToDisc(String content) {
        addContents(content);
    }

    @Override
    public void readData() {
        System.out.println("LAZOORRRSS GRINDING NOISES " + "\nData:\n" + getContents());
    }

    @Override
    public String report(){
        return ("Name: " + getName() + "\nCapacity: " + getStorageSize() + "\nContents: " + getContents() + "\nDiscType: " + getDiscType());
    }

}
