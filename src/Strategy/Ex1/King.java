package Strategy.Ex1;

public class King extends Character {

    public King(WeaponBehaviour wp) {
        super(wp);
    }

    @Override
    public void fight() {
        System.out.println("King");
        super.fight();
    }
}
