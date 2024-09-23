package technology;

public class Computer extends AbstractEntity{
    private String operatingSystem;
    private double screenSizeInches;
    private String interfaceType;


    public Computer(String os, double screenSize, String interfaceType){

        this.operatingSystem = os;
        this.screenSizeInches = screenSize;
        this.interfaceType = interfaceType;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public String toString(){
        return "Operating System: " + operatingSystem + ", Screen Size: " + screenSizeInches + ", Input Type: " + interfaceType + ", ID: " + getId();
    }

    public String noise(){
        return "*** DIAL-UP NOISES ***";
    }
}
