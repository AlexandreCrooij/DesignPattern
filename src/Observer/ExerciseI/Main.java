package Observer.ExerciseI;

public class Main {
    public static void main(String[] args) {
        PatientMonitoring pm = new PatientMonitoring(1, 10,10,10);
        MedicalEmployee jean = new MedicalEmployee("Jean    ", pm);
        MedicalEmployee pauline = new MedicalEmployee("Pauline ", pm);
        MedicalEmployee matthieu = new MedicalEmployee("Matthieu", pm);
        MedicalEmployee symon = new MedicalEmployee("Symon  ", pm);
        pm.setBloodPressure(7);
        pm.setElectroCardioGram(12);
        pm.setPosition(3);
        pm.setPosition(7);
        pm.setPulseOximetry(13);
        pm.setPulseOximetry(7);
        pm.setBloodPressure(22);
        pm.removeObserver(matthieu);
        pm.setPosition(9);
        pm.setElectroCardioGram(14);
    }
}

