package Strategy.Ex1;

public abstract class Character {
    public WeaponBehaviour wp;

    public Character(WeaponBehaviour wp){
        this.wp = wp;
    }

    public void setWeaponBehaviour(WeaponBehaviour wp){
        this.wp = wp;
    }

    public void fight(){
        wp.useWeapon();
    }
}
