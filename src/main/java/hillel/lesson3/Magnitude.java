package hillel.lesson3;

public class Magnitude {

    public static void main(String[] args) {
       double oneNumber = 25;
       double twoNumber = -25;

       if (Math.abs(oneNumber) > Math.abs(twoNumber)) {
           System.out.println(oneNumber + " " + "найбільше абсолютне значення");
       } else if (Math.abs(oneNumber) < Math.abs(twoNumber)) {
           System.out.println(twoNumber + " " + "найбільше абсолютне значення" );
       } else System.out.println("немає найбільшого значення, воні рівні");


    }

}
