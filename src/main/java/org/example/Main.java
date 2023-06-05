package org.example;

import car.Car;
import car.CarListCreate;
import method.Method;
import method.PrintList;
import method.Sort;
import method.WriteRead;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WriteRead.writeCarList(CarListCreate.createCarList().getCarList(), "carlist");//создание листа и запись в "carlist.bin"

        List<Car> list = WriteRead.readCarList("carlist"); //чтение листа из "carlist.bin" для дальнейших операций

        System.out.println("Cars list: ");
        PrintList.printCarList(list); //вывод листа
        System.out.println();

        System.out.println("Biggest price is: " + Method.findMaxPrice(list)); //самая большая цена
        System.out.println("Most expensive cars: ");
        PrintList.printCarList(Method.createCarMaxPriceList(list, Method.findMaxPrice(list))); // список самых дорогих
        System.out.println();

        System.out.println("Minimum price: " + Method.findMinPrice(list));//минимальная ценв
        System.out.println("Cheapest cars: ");
        PrintList.printCarList(Method.createCarMinPriceList(list, Method.findMinPrice(list)));//список самых дешевых
        System.out.println();

        System.out.println("List by brand: ");
        PrintList.printCarList(Method.createCarListByBrand(list, "ToYota"));// список отсортированный по бренду (Toyota)
        System.out.println();

        System.out.println("List by model: ");
        PrintList.printCarList(Method.createCarListByModel(list, "CAMRY")); // список отсортированный по марке (Camry)
        System.out.println();

        System.out.println("List of cars in price diapason: ");
        PrintList.printCarList(Method.createCarListInPriceDiapason(list, 5000, 15000)); //список по диапазону цен
        System.out.println();

        System.out.println("Sorted by price:");
        PrintList.printCarList(Sort.sortPrice(list));//сортировка по цене
        System.out.println();

        System.out.println("Sorted by brand:");
        PrintList.printCarList(Sort.sortBrand(list));//сортировка по бренду
        System.out.println();

    }
}