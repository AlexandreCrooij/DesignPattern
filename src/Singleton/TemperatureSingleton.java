package Singleton;

public class TemperatureSingleton {
    private volatile static TemperatureSingleton uniqueTemperatureSingleton;
    private TemperatureSingleton(){};

    public static TemperatureSingleton getInstance(){
        if(uniqueTemperatureSingleton==null){
            synchronized (TemperatureSingleton.class){
                if(uniqueTemperatureSingleton==null){
                    uniqueTemperatureSingleton=new TemperatureSingleton();
                }
            }
        }
        return uniqueTemperatureSingleton;
    }

    public void warning(){
        System.out.println("Achtung Temperatur");
    }
}
