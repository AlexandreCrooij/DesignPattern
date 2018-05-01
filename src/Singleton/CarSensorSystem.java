package Singleton;

public class CarSensorSystem {
    RoadConditionSingleton roadConditionSingleton;
    RoadConditionSingleton roadConditionSingleton1;
    SpeedSingleton speedSingleton;
    TemperatureSingleton temperatureSingleton;

    public CarSensorSystem(){
        System.out.println(roadConditionSingleton.getInstance());
        speedSingleton.getInstance().warning();
        temperatureSingleton.getInstance().warning();
        System.out.println(roadConditionSingleton1.getInstance());
    }

    public static void main(String[] args) {
        CarSensorSystem carSensorSystem = new CarSensorSystem();
    }
}
