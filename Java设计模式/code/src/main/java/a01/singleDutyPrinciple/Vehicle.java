package a01.singleDutyPrinciple;

//定义一个抽象类
abstract class Vehicle{
    public abstract void run(String vehicle);
}


class AirVehicle extends Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空运行");
    }
}

class LandVehicle extends Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在陆地运行");
    }
}