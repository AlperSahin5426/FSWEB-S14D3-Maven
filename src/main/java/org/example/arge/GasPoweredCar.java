package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "Gas power is starting";
    }

    @Override
    public String drive() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Sürüş sistemi kontrol ediliyor...");
        return runEngine();
    }
    @Override
    protected String runEngine() {
        return "GasPoweredCar: " + cylinders + " silindirle gürleyerek çalışıyor. " + avgKmPerLitre + " km/l";
    }
}
