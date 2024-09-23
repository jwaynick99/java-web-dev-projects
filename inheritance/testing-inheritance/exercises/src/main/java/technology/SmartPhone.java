package technology;

public class SmartPhone extends Computer{
    private String model;

    public SmartPhone(String model, String os, double screenSize, String interfaceType){
        super(os, screenSize, interfaceType);
        this.model = model;
    }

    @Override
    public String noise(){
        return "Phone Chime";
    }

    @Override
    public String toString(){
        return "Operating System: " + getOperatingSystem() + ", Screen Size: " + getScreenSizeInches() + ", Input Type: " + getInterfaceType() + ", Model: " + model + ", ID: " + getId();
    }

    public String messagesSent(){
        return "No one wants to text you loser.";
    }

}
