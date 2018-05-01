package Strategy.Ex1;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shot an arrow");
    }
}
