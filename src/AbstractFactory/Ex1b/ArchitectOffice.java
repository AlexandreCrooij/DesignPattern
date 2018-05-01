package AbstractFactory.Ex1b;


public class ArchitectOffice {
    public static void main(String[] args) {
        HouseFactory germanHouseFactory = new GermanHouseFactory();
        House germanHouse = germanHouseFactory.createHouse();
        System.out.println("German House");
        System.out.println(germanHouse.getPrice());

        HouseFactory swissHouseFactory = new SwissHouseFactory();
        House swissHouse = swissHouseFactory.createHouse();
        System.out.println("Swiss House");
        System.out.println(swissHouse.getPrice());

        HouseFactory dutchHouseFactory = new DutchHouseFactory();
        House dutchHouse = dutchHouseFactory.createHouse();
        System.out.println("Dutch House");
        System.out.println(dutchHouse.getPrice());
    }
}