package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String name, String description , double avgKmPerLitre, int batterySize, int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "Hybrid system is initializing: Both gas and electric power ready.";
    }

    @Override
    public String drive() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Sürüş sistemi kontrol ediliyor...");
        return runEngine();
    }

    @Override
    protected String runEngine() {
        return "HybridCar: Running with " + cylinders + " cylinders and " + batterySize + " kWh battery. Efficiency: " + avgKmPerLitre + " km/L";
    }
}
