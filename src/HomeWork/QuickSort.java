package HomeWork;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrayOFNumbers = {3, 1, 7, 4, 9, -1, 5, 2};
        sort(arrayOFNumbers, 0, 7);
        System.out.println(Arrays.toString(arrayOFNumbers));
    }

    public static void sort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int theMiddle = array[(leftMarker + rightMarker) / 2];

        do {
            while (array[leftMarker] < theMiddle) {
                leftMarker++;
            }
            while (array[rightMarker] > theMiddle) {
                rightMarker--;
            }
            if (leftMarker <=rightMarker) {

                if (leftMarker < rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            sort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sort(array, leftBorder, rightMarker);
        }
    }
}
