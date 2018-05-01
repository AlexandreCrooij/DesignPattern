package Strategy.Ex3;

public class Main {
    public static void main(String[] args) {
        AccelerateOne accelerateOne = new AccelerateOne();
        AccelerateTwo accelerateTwo = new AccelerateTwo();
        BreakOne breakOne = new BreakOne();
        BreakTwo breakTwo = new BreakTwo();
        BreakThree breakThree = new BreakThree();

        Car car1 = new Car(breakOne, accelerateOne);
        Car car2 = new Car(breakTwo, accelerateTwo);
        Car car3 = new Car(breakThree, accelerateTwo);

        System.out.println("AutoEins");
        car1.accelerate();
        car1.breaks();
        System.out.println("AutoZwei");
        car2.accelerate();
        car2.breaks();
        System.out.println("AutoDrei");
        car3.accelerate();
        car3.breaks();

        System.out.println("Auto3NeuesVerhalten");
        car3.setAcceleratingBehaviour(accelerateOne);
        car3.setBreakingBehaviour(breakOne);
        car3.accelerate();
        car3.breaks();


    }
}
