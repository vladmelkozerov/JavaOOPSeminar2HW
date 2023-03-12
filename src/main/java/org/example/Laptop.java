package org.example;

import java.util.*;

import static java.lang.System.*;

public class Laptop extends Computers implements TestDrive {
    @Override
    public void filterPC(Set<Laptop> setLT1, int parameter1) {
        Scanner scanner = new Scanner(in);
        Map<Integer, Laptop> result = new HashMap<>();
        Integer ID = 0;
        switch (parameter1) {
            case (1):
                out.println("Введите марку ноутбука");
                String brand = scanner.nextLine();
                for (Laptop item : setLT1) {
                    if (item.getBrand().equals(brand)) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            case (2):
                out.println("Введите модель ноутбука");
                String model = scanner.nextLine();
                for (Laptop item : setLT1) {
                    if (item.getModel().equals(model)) {
                        result.put(ID, item);

                        ID++;
                    }

                }
                break;
            case (3):
                out.println("Введите минимальный размер экрана");
                Double minScreenSize = scanner.nextDouble();
                out.println("Введите максимальный размер экрана");
                Double maxScreenSize = scanner.nextDouble();
                for (Laptop item : setLT1) {
                    if (item.getScreenSize() >= minScreenSize && item.getScreenSize() <= maxScreenSize) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            case (4):
                out.println("Введите минимальный размер ПЗУ");
                Double minROM = scanner.nextDouble();
                out.println("Введите максимальный размер ПЗУ");
                Double maxROM = scanner.nextDouble();
                for (Laptop item : setLT1) {
                    if (item.getROM() >= minROM && item.getROM() <= maxROM) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            case (5):
                out.println("Введите минимальную стоимость");
                Double minPrice = scanner.nextDouble();
                out.println("Введите максимальную стоимость");
                Double maxPrice = scanner.nextDouble();
                for (Laptop item : setLT1) {
                    if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            default:
                out.println("Некорректная команда");
                break;
        }
        if (!result.isEmpty()) {
            out.println("Ноутбуки, соответствующие условиям отбора:" );
            for (Map.Entry<Integer, Laptop> entry : result.entrySet()) {
                {
                    out.println("Марка: "+entry.getValue().getBrand()+" Модель: "+entry.getValue().getModel()
                            +" Размер экрана: "+entry.getValue().getScreenSize()+" ПЗУ:"+entry.getValue().getROM()+
                            " Стоимость "+ entry.getValue().getPrice());
                }
            }
        }
        else out.println("Ноутбуки, соответствующие заданным критериям, не обнаружены. Измените параметры поиска");
        out.println();
    }



    @Override
    public void filterPC() {

    }

    public Laptop(String brand, String model, Double screenSize, Double ROM, Double price) {
        super(brand, model, screenSize, ROM, price);
    }

    @Override
    public String toString() {
        return "Laptop{}";
    }

    @Override
    public void TestLoad() {

    }

    @Override
    public void TestLoad(Laptop laptop) {
        out.println("Тест-драйв ноутбука "+laptop.getBrand()+" "+laptop.getModel());
        out.println("Включение питания, запуск BIOS");
        out.println("Запуск операционной системы");
        out.println("Ноутбук готов к работе, объем ОЗУ "+ laptop.getROM());
        out.println("Работа...");
        out.println("Выключение питания");
        out.println("Тест-драйв завершен");
    }
}


