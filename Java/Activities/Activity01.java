package activities;

public class Activity01 {
    public static void main(String[] args){
        Car Toyota = new Car();
        Toyota.intMake= 2020;
        Toyota.strColor= "White";
        Toyota.transmission = "Manual";

        Toyota.displayCharacteristics();
        Toyota.accelarate();
        Toyota.brake();
    }

}
