package Singleton;

public class RoadConditionSingleton {
    private static RoadConditionSingleton uniqueRoadConditionSingleton;
    private RoadConditionSingleton(){};

    public static synchronized RoadConditionSingleton getInstance(){
        if(uniqueRoadConditionSingleton == null){
            uniqueRoadConditionSingleton = new RoadConditionSingleton();
        }
        return uniqueRoadConditionSingleton;
    }

    public void warning(){
        System.out.println("Achtung Straßenverhältnisse");
    }

}
