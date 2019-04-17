package Module1;

import java.util.Arrays;

public class DifferentElements {
    public static void main(String[] args) {
        int[] array = {1, 4,5,1,1,3};
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!contains(newArray, array[i])) {
                newArray[i] = array[i];
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean contains(int a[], int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }
}