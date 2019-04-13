package Lessons7;

import java.util.Arrays;

public class Task37 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 11, 3, 4, 5, 6, 7, 8, 9};
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                evenCounter++;
            }
            if (!(arrayA[i] % 2 == 0)) {
                oddCounter++;
            }
        }


        int[] evenArays = new int[evenCounter];
        int evenIndex = 0;
        int oddIndex = 0;
        int[] oddArrays = new int[oddCounter];

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                evenArays[evenIndex] = arrayA[i];
                evenIndex++;
            }
            if (!(arrayA[i] % 2 == 0)) {
                oddArrays[oddIndex] = arrayA[i];
                oddIndex++;
            }
        }
        System.out.println(Arrays.toString(evenArays));
        System.out.println(Arrays.toString(oddArrays));
    }
}
