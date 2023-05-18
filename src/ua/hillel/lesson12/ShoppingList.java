package ua.hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Цукор", 8);
        shoppingList.put("Сіль", 1);
        shoppingList.put("Кава", 23);
        shoppingList.put("Молоко", 7);
        shoppingList.put("Морозиво", 2);
        shoppingList.put("Сир", 33);
        shoppingList.put("Яблука", 12);
        shoppingList.put("Полуниці", 5);


       int countGoods = 0;
       for (Map.Entry <String, Integer> goods : shoppingList.entrySet()) {
            countGoods += goods.getValue();
            System.out.println(goods.getKey() + ": " +  goods.getValue());
       }
        System.out.println("Загальна кількість доданих товарів :"  + countGoods);
    }

}
