package ua.hillel.lesson4;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

        int [] arrayRandom = new int[20];
        for (int i = 0; i < arrayRandom.length; i ++) {
            arrayRandom[i] = (int) (Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arrayRandom));
        double sum = 0;
        for (double d : arrayRandom) {
            sum+= d;
        }
        System.out.println("Average of array  " + sum/arrayRandom.length);
    }

}
