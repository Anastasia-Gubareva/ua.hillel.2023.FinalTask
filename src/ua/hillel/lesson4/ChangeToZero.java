package ua.hillel.lesson4;

import java.util.Arrays;
import java.util.Random;

public class ChangeToZero {
    public static void main(String[] args) {

        int[] arrayOfRandomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(100);
                  if (arrayOfRandomNumbers[i] % 2 == 0) {
                    arrayOfRandomNumbers[i] = 0;
                    }
       }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));
    }
}
