package Decorator.Ex2;

import java.lang.invoke.SerializedLambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic Package-----------------");
        Service service = new BasicPackage();
        service = new HotelRoomDecorator(service);
        service = new SaunaFullInclusiveDecorator(service);

        System.out.println(service.getDescription());
        System.out.println(service.getPrice());

        System.out.println("Advanced Package-----------------");
        Service service1 = new AdvancedPackage();
        service1 = new HotelRoomDecorator(service1);
        service1 = new SaunaFullInclusiveDecorator(service1);

        System.out.println(service1.getDescription());
        System.out.println(service1.getPrice());

        System.out.println("Professional Package-----------------");
        Service service2 = new ProfessionalPackage();
        service2 = new HotelRoomDecorator(service2);
        service2 = new SaunaFullInclusiveDecorator(service2);

        System.out.println(service2.getDescription());
        System.out.println(service2.getPrice());

        System.out.println("Professional Package Extra Services-----------------");
        Service service3 = new ProfessionalPackage();
        service3 = new HotelRoomDecorator(service3);
        service3 = new SaunaFullInclusiveDecorator(service3);
        service3 = new SkiPassDecorator(service3);

        System.out.println(service3.getDescription());
        System.out.println(service3.getPrice());
    }
}
