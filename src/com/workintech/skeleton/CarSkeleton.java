package com.workintech.skeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return getName() + " starting the engine";
    }
    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }
    protected void runEngine(CarSkeleton carSkeleton){
        if (carSkeleton instanceof  GasPoweredCar){
            System.out.println("The Car engine is starting with gas");
        } else if (carSkeleton instanceof ElectricCar) {
            System.out.println("The Car engine is starting with electric");
        }else if (carSkeleton instanceof HybridCar) {
            System.out.println("The Car engine is starting with hybrid");
        }
    }
}
