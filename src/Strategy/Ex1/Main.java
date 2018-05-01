package Strategy.Ex1;

public class Main {
    public static void main(String[] args) {
        KnifeBehaviour kb = new KnifeBehaviour();
        SwordBehaviour sb = new SwordBehaviour();
        BowAndArrowBehaviour ba = new BowAndArrowBehaviour();
        AxeBehaviour ab = new AxeBehaviour();

        King king = new King(kb);
        Troll troll = new Troll(sb);
        Queen queen = new Queen(ba);
        Knight knight = new Knight(ab);

        king.fight();
        king.setWeaponBehaviour(sb);
        king.fight();
        troll.fight();
        queen.fight();
        knight.fight();
    }
}