package com.company;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean isManuel;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear():" + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }



}
