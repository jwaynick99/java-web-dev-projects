package technology;

public class Program {
    public static void main(String[] args){
        Computer comp = new Computer("Windows", 27, "Mouse/Keyboard");
        Laptop laptop = new Laptop("Acer", "Windows", 16.7, "Touchpad/Keyboard");
        SmartPhone phone = new SmartPhone("Google Pixel 6", "Chromium Android", 6.7, "Touch Screen");

        System.out.println(comp.toString());
        System.out.println(laptop.toString());
        System.out.println(phone.toString());

        System.out.println(laptop.mainGame("World of WarCraft"));
        System.out.println(phone.messagesSent());

    }

}
