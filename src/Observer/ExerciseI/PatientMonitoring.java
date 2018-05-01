package Observer.ExerciseI;

import java.util.ArrayList;

public class PatientMonitoring implements Subject{

    ArrayList<Observer> myObservers=new ArrayList<Observer>();

    int position;
    int maxBloodPressure;
    int maxElectroCardioGram;
    int maxPulseOximetry;
    int bloodPressure;
    int electroCardioGram;
    int pulseOximetry;

    public PatientMonitoring(int Position, int maxBloodPressure, int maxElectroCardioGram, int maxPulseOximetry)
    {
        this.position=position;
        this.maxBloodPressure=maxBloodPressure;
        this.maxElectroCardioGram=maxElectroCardioGram;
        this.maxPulseOximetry=maxPulseOximetry;
        bloodPressure=0;
        electroCardioGram=0;
        pulseOximetry=0;
    }
    @Override
    public void addObserver(Observer observer) {
        myObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i=myObservers.indexOf(observer);
        if(i>=0) {
            myObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : myObservers){
            o.update();
        }
    }

    public void valuesChanged(){
        notifyObservers();
    }
    
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        valuesChanged();
    }

    public void setElectroCardioGram(int electroCardioGram) {
        this.electroCardioGram = electroCardioGram;
        valuesChanged();
    }

    public void setPosition(int position) {
        this.position = position;
        valuesChanged();
    }

    public void setPulseOximetry(int pulseOximetry) {
        this.pulseOximetry = pulseOximetry;
        valuesChanged();
    }
}
