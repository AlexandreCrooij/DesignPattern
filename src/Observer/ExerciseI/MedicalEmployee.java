package Observer.ExerciseI;

public class MedicalEmployee implements Observer{

    private String name;
    private PatientMonitoring pm;

    public MedicalEmployee(String name, PatientMonitoring pm){
        this.name = name;
        this.pm = pm;
        pm.addObserver(this);
    }

    @Override
    public void update() {
        boolean noProblem=true;
        System.out.println("MedicalEmployee "+name);
        if(pm.bloodPressure>pm.maxBloodPressure){
            System.out.println("Patient "+pm.position+" has "+Problem.bloodPressure.toString()+": "+pm.bloodPressure);
            noProblem=false;
        }
        if(pm.electroCardioGram>pm.maxElectroCardioGram){
            System.out.println("Patient "+pm.position+" has "+Problem.ECG.toString()+": "+pm.electroCardioGram);
            noProblem=false;
        }
        if(pm.pulseOximetry>pm.maxPulseOximetry){
            System.out.println("Patient "+pm.position+" has "+Problem.oximetry.toString()+": "+pm.pulseOximetry);
            noProblem=false;
        }
        if(noProblem==true) System.out.println("Patient " + pm.position + " has " + Problem.noProblem.toString());
        System.out.println("------------------------");
    }
}
