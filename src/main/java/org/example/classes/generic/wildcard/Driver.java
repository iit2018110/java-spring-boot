package org.example.classes.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        List<Bus> busList =  new ArrayList<>();
        List<Car> carList =  new ArrayList<>();

        vehicleList.add(new Bus());
//        vehicleList = busList;   -- wrong


        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        vehicle = bus;

        Print print = new Print();
        print.setPrintValues(vehicleList);

        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();

        PrintNum printNum = new PrintNum();
        printNum.display(integerList, floatList);
//        printNum.display1(integerList, floatList);    : Not supported
        printNum.display1(integerList, integerList);
    }
}
