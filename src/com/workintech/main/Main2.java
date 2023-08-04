package com.workintech.main;

import com.workintech.model.Car;
import com.workintech.skeleton.CarSkeleton;
import com.workintech.skeleton.ElectricCar;

public class Main2 {
    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("tesla","tesla deneme",0.05, 10);
        car1.drive();
    }
}
