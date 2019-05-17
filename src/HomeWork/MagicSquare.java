package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        ArrayList<Integer> sums = new ArrayList<>();
        int[][] array = readSquare();

        calculateRaws(array, sums);
        calculateColumns(array, sums);
        calculateDiagonals(array, sums);
        System.out.println(sums);

    }

    private static void calculateColumns(int[][] array, ArrayList<Integer> sums) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
            }
            sums.add(sum);
        }
    }

    private static void calculateDiagonals(int[][] array, ArrayList<Integer> sums) {
        int sumOfDiagonal1 = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfDiagonal1 += array[i][i];
        }
        sums.add(sumOfDiagonal1);

        int sumOfDiagonal2 = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfDiagonal2 += array[i][array.length - 1 - i];
        }
        sums.add(sumOfDiagonal2);
    }

    private static void calculateRaws(int[][] array, ArrayList<Integer> result) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }
            result.add(sum);
        }
    }

    private static int[][] readSquare() {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();

        String[] firstNumbers = firstLine.split("(\t| )");
        int[][] array = new int[firstNumbers.length][firstNumbers.length];
        int raw = 0;

        for (int i = 0; i < firstNumbers.length; i++) {
            array[raw][i] = Integer.parseInt(firstNumbers[i]);
        }
        raw++;
        while (raw < firstNumbers.length) {
            String nextLine = scanner.nextLine();
            String[] numbers = nextLine.split("(\t| )");
            for (int i = 0; i < numbers.length; i++) {
                array[raw][i] = Integer.parseInt(numbers[i]);
            }
            raw++;
        }
        return array;
    }
}
