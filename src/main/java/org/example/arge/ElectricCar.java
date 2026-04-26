package org.example.arge;

import org.example.company.Car;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize){
        super(name,description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }
    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
    @Override
    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "Electric motor is starting";
    }

    @Override
    public String drive() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Sürüş sistemi kontrol ediliyor...");
        return runEngine();
    }
    @Override
    protected String runEngine() {
        return "Electric motor is running silently with " + batterySize + " kWh battery. Efficiency: " + avgKmPerCharge + " km/charge";
    }
}
