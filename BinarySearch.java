
package HomeWork;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

        public static void main(String[] args) {
            int[] array = new int[100];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }

            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            int a = 3;
            int middle = array.length / 2;
            int start = 0;
            int end = array.length - 1;
            boolean isInArray = false;

            while (start <= end) {
                if (array[middle] == a) {
                    isInArray = true;
                    break;
                }
                if (array[middle] < a) {
                    start = middle+1;
                }
                if (array[middle] > a) {
                    end = middle-1;
                }
                middle = (start + end) / 2;
            }
            System.out.println(isInArray);
        }

    }


