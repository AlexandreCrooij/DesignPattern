package Singleton;

public class SpeedSingleton {
    private static SpeedSingleton uniqueSpeedSingleton=new SpeedSingleton();
    private SpeedSingleton(){};

    public static SpeedSingleton getInstance(){
        return uniqueSpeedSingleton;
    }

    public void warning(){
        System.out.println("Achtung Geschwindigkeit");
    }
}
