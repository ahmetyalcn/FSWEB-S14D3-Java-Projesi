package com.workintech.skeleton;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        //avgKmPerLitre: double ve cylinders: int
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

}
