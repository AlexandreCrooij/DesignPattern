package Strategy.Ex1;

public class Knight extends Character {

    public Knight(WeaponBehaviour wp) {
        super(wp);
    }

    @Override
    public void fight() {
        System.out.println("Knight");
        super.fight();
    }
}
