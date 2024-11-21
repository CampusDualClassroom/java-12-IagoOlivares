package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer=0;
    public int tachometer =0;
    public String gear = "N";
    public boolean reverse= false;
    public int wheelsAngle =0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){}

    public void start(){
        if(this.tachometer==0){
            this.tachometer=1000;
            System.out.println("Vehiculo acendido");
        }else{
            System.out.println("O vehiculo xa esta acendido");
        }
    }

    public void stop(){
        if(this.speedometer ==0){
            this.tachometer=0;
            System.out.println("Vehiculo apagado");
        }else{
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }

    public void accelerate(){
        if(this.speedometer < MAX_SPEED){
            this.speedometer+= 40;
        }
    }
    public void brake(){
        if(this.speedometer > 0){
            this.speedometer-=40;
        }
        if(this.speedometer < 0){
            this.speedometer=0;
        }

    }
    public void turnAngleOfWheels(int angulo){
        this.wheelsAngle+= angulo;
        if(this.wheelsAngle > 45){
            this.wheelsAngle= 45;
        }

        if(this.wheelsAngle < -45){
            this.wheelsAngle= -45;
        }
    }
    public String showSteeringWheelDetail(){

        return "El angulo de las ruedas es: "+wheelsAngle;
    }
    public boolean isReverse(){
        return reverse;
    }
    public void setReverse(boolean reverse){
        if(this.reverse==false && this.speedometer==0){
            this.reverse=reverse;
            this.gear="R";
        }else if (this.reverse==true && this.speedometer==0){
            this.reverse=reverse;
            this.gear="N";

        }
    }
    public void showDetails(){
    }
    public boolean isTachometerEqualToZero(){
        if(tachometer==0){
            return true;
        }
        return false;
    }
    public boolean isTachometerGreaterThanZero(){
        if(tachometer>0){
            return true;
        }
        return false;
    }
}
