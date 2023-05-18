package ua.hillel.lesson12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {

        List<Integer> listWithDuplicates = new ArrayList<>();
        for (int i = 0; i < 100; i++ ) {
            listWithDuplicates.add ((int)(Math.random()*50)+1);
        }
        System.out.println("Початковий масив чисел:  "   +  "\n"  + listWithDuplicates);

        Set<Integer> SetWithoutDuplicates = new HashSet<>(listWithDuplicates);

        System.out.println("Масив з видаленими дубликатами:  "  +  "\n"  + SetWithoutDuplicates);
        System.out.println("Кількість видалених дубликатів дорівнює:  "  +  "\n" + (listWithDuplicates.size() - SetWithoutDuplicates.size()));



    }
}
