package ua.hillel.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {
    public static void main(String[] args) {

        List<Integer> listOriginal = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOriginal.add((int) (Math.random() * 100) + 1);
        }
        List<Integer> listFor2 = new ArrayList<>();
        List<Integer> listFor3 = new ArrayList<>();
        List<Integer> listOther = new ArrayList<>();

        for (int i : listOriginal) {
            if (i % 2 == 0 && i % 3 == 0) {
                listFor2.add(i);
                listFor3.add(i);
            } else if (i % 2 == 0) {
                listFor2.add(i);
            } else if (i % 3 == 0) {
                listFor3.add(i);
            } else {
                listOther.add(i);
            }
        }
        System.out.println("Початкова колекція чисел: " +  "\n"  + listOriginal);
        System.out.println("Колекція чисел, що ділеться на 2:" +  "\n"+  listFor2);
        System.out.println("Колекція чисел, що ділеться на 3:" +  "\n" + listFor3);
        System.out.println("Усі інші числа:"+  "\n" + listOther);
    }
}


