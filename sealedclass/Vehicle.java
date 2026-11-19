package sealedclass;

public sealed class Vehicle permits Car,Bike {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();

    }



}
