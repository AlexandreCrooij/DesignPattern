package Composite.Ex1;

public class Starter {
    public static void main(String[] args) {
        Menu team1 = new Menu("Team 1");
        Menu team2 = new Menu("Team 2");
        Menu team3 = new Menu("Team 3");
        Menu team4 = new Menu("Team 4");

        MenuItem player1 = new MenuItem("Raphael");
        MenuItem player2 = new MenuItem("Alex");
        MenuItem player3 = new MenuItem("Danilo");
        MenuItem player4 = new MenuItem("Anthony");
        MenuItem player5 = new MenuItem("Mathis");
        MenuItem player6 = new MenuItem("Jauffrey");
        MenuItem player7 = new MenuItem("Aurelie");
        MenuItem player8 = new MenuItem("Peter");

        team1.add(player1);
        team1.add(player2);

        team2.add(player3);
        team2.add(player4);

        team3.add(player5);
        team3.add(player6);

        team4.add(player7);
        team4.add(player8);

        team1.add(team2);

        team3.add(team4);

        team2.add(team3);

        team1.print();
    }
}
