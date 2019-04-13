package Lessons7;

import java.util.Arrays;

public class AddBinaryTask67 {
    public static void main(String[] args) {
        String a = "101010";
        String b = "1011";

    }

    public static String addBinary(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        String result = "";
        int len = (a.length() > b.length() ? a.length() : b.length());


        return null;

    }

    public static char[] scaleArrayNecessaryLength(char[] arr, int length) {
        char[] res = new char[length];
        Arrays.fill(res, '0');
        System.out.println(Arrays.toString(res));
        for (int i = arr.length - length, j = 0; i < res.length; i++, j++) {
            res[i] = arr[j];
        }
        return res;
    }

}
