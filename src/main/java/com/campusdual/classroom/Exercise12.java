package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche1 = new Car();
        coche1.isTachometerEqualToZero();

        coche1.start();
        coche1.isTachometerGreaterThanZero();
        coche1.start();
        coche1.stop();
        coche1.start();
        coche1.accelerate();
        coche1.stop();
        coche1.accelerate();
        coche1.accelerate();
        coche1.accelerate();
        coche1.turnAngleOfWheels(20);
        coche1.turnAngleOfWheels(30);
        System.out.println(coche1.showSteeringWheelDetail());
        coche1.brake();
        coche1.brake();
        coche1.brake();
        coche1.brake();
        coche1.setReverse(true);
        coche1.setReverse(false);
        coche1.accelerate();
        coche1.setReverse(true);









    }

}