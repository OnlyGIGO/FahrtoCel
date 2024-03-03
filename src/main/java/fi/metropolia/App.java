package fi.metropolia;

public class App {
    public static void main(String[] args) {
        System.out.println("32 Fahrenheit is "+FahrToCel.convertFahrToCel(32)+" Celsius");
        System.out.println("212 Kelvin is "+FahrToCel.kelvintoCel(212)+" Celsius");
        System.out.println("300.1 Kelvin is "+FahrToCel.kelvinToFahr(300.1f)+" Fahrenheit");

    }
}
