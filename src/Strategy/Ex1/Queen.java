package Strategy.Ex1;

public class Queen extends Character {

    public Queen(WeaponBehaviour wp) {
        super(wp);
    }

    @Override
    public void fight() {
        System.out.println("Queen");
        super.fight();
    }
}
