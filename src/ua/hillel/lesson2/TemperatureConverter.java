package ua.hillel.lesson2;

public class TemperatureConverter {

    public static void main(String[] args) {
        double tempCels = 20;
        double tempKelvin = tempCels  + 273.16;
        double tempFahr = tempCels *9/5 + 32;

        System.out.println(tempCels + "С дорівнює "+ tempFahr + " F та " + tempKelvin + " K");
    }
}
