package lesson4_20250703;

import java.util.Arrays;

public class QuickSortMiddleElem {
    public static void main(String[] args) {
        //int[] array = {17,14,15,28,6,8,-6,1,3,18};
        int[] array = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        quickSort (array, 0, array.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // качестве опорного выбирается средний элемент
    public static void quickSort(int[] arr, int low, int max) {
        if (low < max) {
            int pivotIndex = partition(arr, low, max);

            quickSort(arr, low, pivotIndex -1);
            quickSort(arr, pivotIndex+1, max);
        }
    }

    private static int partition (int[] arr, int low, int max) {
        int middle = low + (max - low) / 2;
        int pivot = arr[middle];

        int temp = arr[middle];
        arr[middle] = arr[max];
        arr[max] = temp;

        int i = (low -1);
        for (int j = low; j < max; j++) {
            if (arr[j] < pivot) {
                i++;

                swap(arr, i, j);
            }

        }

        swap(arr, i+1, max);

        return i +1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
