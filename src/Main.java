//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(); // создаём список игрушек
        productList.add(new Product("Конструктор", 'S', 900));//создаем игрушку №1 и помещаем её в список
        productList.add(new Product("Кукла", 'M', 550)); //создаем игрушку №2 и помещаем её в список
        productList.add(new Product("Пистолет", 'L', 190)); //создаем игрушку №3 и помещаем её в список
        productList.add(new Product("Конструктор", 'M', 1800)); //создаем игрушку №4 и помещаем её в список
        productList.add(new Product("Меч", 'L', 500)); //создаем игрушку №5 и помещаем её в список
        productList.add(new Product("Кукла", 'S', 900)); //создаем игрушку №6 и помещаем её в список
        productList.add(new Product("Кукла", 'L', 1550)); //создаем игрушку №7 и помещаем её в список
        productList.add(new Product("Пистолет", 'S', 290)); //создаем игрушку №8 и помещаем её в список
        productList.add(new Product("Конструктор", 'L', 2800)); //создаем игрушку №9 и помещаем её в список
        productList.add(new Product("Меч", 'S', 250)); //создаем игрушку №10 и помещаем её в список

        Map<String, Object> productMap = new HashMap<>(); // создаём HashMap
        productMap.put("Lego", productList.get(0)); //даём название первой игрушке
        productMap.put("Barbie", productList.get(1)); //даём название второй игрушке
        productMap.put("Eagle", productList.get(2)); //даём название третьей игрушке
        productMap.put("Technics", productList.get(3)); //даём название четвёртой игрушке
        productMap.put("Кладенец", productList.get(4)); //даём название пятой игрушке
        productMap.put("Аленка", productList.get(5)); //даём название шестой игрушке
        productMap.put("Марина", productList.get(6)); //даём название седьмой игрушке
        productMap.put("ТТ", productList.get(7)); //даём название восьмой игрушке
        productMap.put("Ugears", productList.get(8)); //даём название девятой игрушке
        productMap.put("Сабля", productList.get(9)); //даём название десятой игрушке


        printCollection1((HashMap) productMap); //вызываем метод распечатки Map
        System.out.println(); // пустая строка

        printCollection2((HashMap) productMap);//вызываем метод распечатки Keys
        System.out.println(); // пустая строка

        printCollection3((HashMap) productMap); //вызываем метод распечатки Values
    }

    private static void printCollection1(HashMap productMap) {//метод распечатки Map
        System.out.println(productMap.entrySet());
    }
    private static void printCollection2(HashMap productMap) {//метод распечатки Keys
        System.out.println(productMap.keySet());
    }
    private static void printCollection3(HashMap productMap) { //метод распечатки Values
        System.out.println(productMap.values());
    }
}