package Strategy.Ex2;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab2 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab3 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("BubbleSort");
        Sorter sorter = new Sorter(bubbleSort, tab1);
        sorter.ausgabe();
        sorter.sort();
        sorter.ausgabe();
        System.out.println("InsertionSort");
        sorter.setSortingBehaviour(insertionSort);
        sorter.setVector(tab2);
        sorter.ausgabe();
        sorter.sort();
        sorter.ausgabe();
        System.out.println("SelectionSort");
        sorter.setSortingBehaviour(selectionSort);
        sorter.setVector(tab3);
        sorter.ausgabe();
        sorter.sort();
        sorter.ausgabe();
    }



}