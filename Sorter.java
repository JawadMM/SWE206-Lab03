

public class Sorter {
    public static void main(String[] args) {
        
    }

    public static void selectionSort(Double[] array) {
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

}