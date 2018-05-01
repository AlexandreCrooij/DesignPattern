package ChainOfResponsibility.Ex1;

public class DayRequest {

    private int numberDays;

    public DayRequest(int numberDays){
        this.numberDays=numberDays;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }
}
