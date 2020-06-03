package a01.singleDutyPrinciple;

public class Main {
    public static void main(String[] args) {
        AirVehicle airVehicle=new AirVehicle();
        LandVehicle landVehicle=new LandVehicle();
        airVehicle.run("飞机");
        landVehicle.run("汽车");
    }
}