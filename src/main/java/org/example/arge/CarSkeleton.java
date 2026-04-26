package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    public CarSkeleton(){

    }
    public CarSkeleton(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "Engine is starting";
    }

    public String drive() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return runEngine();
    }

    protected String runEngine() {
        return "Engine is running...";
    }
}
