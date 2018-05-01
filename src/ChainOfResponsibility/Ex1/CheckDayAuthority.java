package ChainOfResponsibility.Ex1;

public class CheckDayAuthority {
    public static void main(String[] args){
        HauptLeuteDPower hauptleutnant = new HauptLeuteDPower();
        HöhereStabsoffieziereDPower höhererStabsoffizier = new HöhereStabsoffieziereDPower();
        OberbefehlshaberDPower oberbefehlshaber = new OberbefehlshaberDPower();
        StabsoffiziereDPower stabsoffizier = new StabsoffiziereDPower();
        hauptleutnant.setSuccessor(stabsoffizier);
        stabsoffizier.setSuccessor(höhererStabsoffizier);
        höhererStabsoffizier.setSuccessor(oberbefehlshaber);

        hauptleutnant.processRequest(new DayRequest(50));
    }
}
