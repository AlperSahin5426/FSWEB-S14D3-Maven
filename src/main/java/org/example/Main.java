package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(car.startEngine());
        System.out.println(mitsubishi.startEngine());
        System.out.println(ford.accelerate());

        System.out.println("------------------------------------");

        CarSkeleton gasCar = new GasPoweredCar("Tofaş", "Şahin", 10.5, 4);
        CarSkeleton electricCar = new ElectricCar("Tesla", "Model S", 500, 100);

        System.out.println(gasCar.drive());
        System.out.println(electricCar.drive());
    }
}