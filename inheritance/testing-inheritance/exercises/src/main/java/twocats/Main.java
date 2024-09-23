package twocats;

public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield");
        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(garfield.getWeight());
    }
}
