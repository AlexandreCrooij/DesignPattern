package Strategy.Ex2;

public class Sorter {

    SortingBehaviour sortingBehaviour;
    int[]vector;

    public Sorter(SortingBehaviour sortingBehaviour, int[]vector){
        this.sortingBehaviour=sortingBehaviour;
        this.vector = vector;
    }

    public void setSortingBehaviour(SortingBehaviour sortingBehaviour) {
        this.sortingBehaviour = sortingBehaviour;
    }

    public void setVector(int[]vector){
        this.vector = vector;
    }

    public void sort() {
        sortingBehaviour.sort(vector);
    }

    public void ausgabe(){
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
}
