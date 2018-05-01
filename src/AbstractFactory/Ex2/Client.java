package AbstractFactory.Ex2;

import Decorator.Ex1.Car;

public class Client {
    public static void main(String[] args) {
        CarFactory lowBudgetCarsFactory = new LowBudgetCarsFactory();
        CarFactory luxuryCarsFactory = new LuxuryCarsFactory();
        Coupe coupeLuxury;
        Coupe coupeNormal;
        Minivan minivanLuxury;
        Minivan minivanNormal;
        coupeLuxury = luxuryCarsFactory.createCoupe();
        coupeNormal = lowBudgetCarsFactory.createCoupe();
        minivanLuxury = luxuryCarsFactory.createMinivan();
        minivanNormal =  lowBudgetCarsFactory.createMinivan();
        System.out.println(coupeLuxury.getName());
        System.out.println(coupeNormal.getName());
        System.out.println(minivanLuxury.getName());
        System.out.println(minivanNormal.getName());
    }
}
