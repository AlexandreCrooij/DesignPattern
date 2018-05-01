package Strategy.Ex1;

public class Troll extends Character {
    public Troll(WeaponBehaviour wp) {
        super(wp);
    }

    @Override
    public void fight() {
        System.out.println("Troll");
        super.fight();
    }
}
