package org.example;

import car.CarListCreate;
import car.CarsOperation;
import method.PrintList;
import method.json.JsonOutInPut;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //самые дорогие машины
        System.out.println("Most expensive cars:");
        PrintList.printCarList(CarsOperation.findCarMaxPrice(CarListCreate.createCarList()));

        //самые дешевые машины
        System.out.println("Most cheapest cars:");
        PrintList.printCarList(CarsOperation.findCarMinPrice(CarListCreate.createCarList()));

//        JSON запись списка отсортированного по бренду
        JsonOutInPut.jsonWriteCarList(CarsOperation.createCarListByBrand(JsonOutInPut.jsonReadCarList("cars"),"toyota"), "toyota");
        System.out.println();
//        Чтение из файла toyota.json
        System.out.println("Read List<Car> \"toyota\" from JSON file: ");
         PrintList.printCarList(JsonOutInPut.jsonReadCarList("toyota"));
    }
}