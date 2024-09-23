package technology;

public class Laptop extends Computer{
    private String brand;

    public Laptop(String brand, String os, double screenSize, String interfaceType){
        super(os, screenSize, interfaceType);
        this.brand = brand;
    }

    @Override
    public String noise(){
        return "Clickity-Clack";
    }

    @Override
    public String toString(){
        return "Operating System: " + getOperatingSystem() + ", Screen Size: " + getScreenSizeInches() + ", Input Type: " + getInterfaceType() + ", Brand: " + brand + ", ID: " + getId();
    }

    public String mainGame(String game){
        return "Mostly used to play: " + game;
    }
}
