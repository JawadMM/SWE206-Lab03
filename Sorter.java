

public class Sorter {
    public static void main(String[] args) {
        
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
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

    public static void Sort(double[] array) {
        selectionSort(array);
    }

}