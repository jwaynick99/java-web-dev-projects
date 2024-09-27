package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    private String content;

    public DVD(int storageSize, int spinSpeed, String name, String discType, String content){
        super(storageSize, spinSpeed, name, discType);
        this.content = content;
    }
    @Override
    public void spinDisc() {
        System.out.println("Spinning...   RPMS: " + getSpinSpeed());
    }

    @Override
    public void dataSize() {
        System.out.println(getStorageSize());
    }

    @Override
    public void writeToDisc(String content) {
        setContent(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void readData() {
        System.out.println("LAZOORRRSS GRINDING NOISES " + "\nMovie Playing: " + content);
    }

    @Override
    public String report(){
        return ("Name: " + getName() + "\nCapacity: " + getStorageSize() + "\nContents: " + content + "\nDiscType: " + getDiscType());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
