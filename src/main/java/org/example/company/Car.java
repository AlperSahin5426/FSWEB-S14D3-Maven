package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Car{name=" + name + "}";
    }
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return this.cylinders == car.cylinders && this.name.equals(car.name);
    }
    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is braking";
    }
}

