

public class Sorter {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(double[] array) {
        
        for (int i = 0; i < array.length; i++) {

            double currentElement = array[i];
            int k;

            for (k = i - 1; k >= 0 && currentElement < array[k]; k--) {
                array[k+1] = array[k];
            }

            array[k + 1] = currentElement;
        }
    }

}