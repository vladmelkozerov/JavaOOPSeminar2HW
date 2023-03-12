package org.example;

import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop("ASUS", "N56D", 15.6, 6.00, 40000.00);
        Laptop laptop1 = new Laptop("ASUS", "N80J", 15.6, 10.00, 60000.00);
        Laptop laptop2 = new Laptop("Lenovo", "A3", 15.6, 3.00, 30000.00);
        Laptop laptop3 = new Laptop("HP", "2000", 15.6, 2.00, 12000.00);
        Laptop laptop4 = new Laptop("Sony", "27HL", 8.2, 1.00, 10000.00);
        Laptop laptop5 = new Laptop("Toshiba", "R56", 14.1, 2.00, 16000.00);

        ArrayList<Laptop> arrLT = new ArrayList<>(Arrays.asList(laptop, laptop1, laptop2, laptop3, laptop4, laptop5));
        Set<Laptop> setLT = new HashSet<>(arrLT);
        Map<Integer,String> filterMap = new HashMap<>();
        filterMap.put(1,"Марка");
        filterMap.put(2,"Модель");
        filterMap.put(3,"Размер экрана");
        filterMap.put(4,"ПЗУ");
        filterMap.put(5,"Стоимость");
        System.out.println("Подбор моделей, соответствующих заданным требованиям");
        for (Map.Entry<Integer,String> entry : filterMap.entrySet()) {
            System.out.println("Для поиска по параметру " + entry.getValue()+" введите цифру "+ entry.getKey());
        }

        int parameter = scanner.nextInt();
        laptop.filterPC(setLT,parameter);

        System.out.println("Для тест-драйва интересующей модели, выберите ее номер из общего списка");
        for (Laptop laptopZ:arrLT) {
            System.out.println("Товар № "+ (arrLT.indexOf(laptopZ)+1) +" "+ laptopZ.getBrand()+" "+laptopZ.getModel());
        }
        System.out.println();
        parameter = scanner.nextInt();
        laptop.TestLoad(arrLT.get(parameter-1));
    }
}