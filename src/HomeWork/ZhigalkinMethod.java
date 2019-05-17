package HomeWork;

import java.util.ArrayList;

public class ZhigalkinMethod {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        ArrayList<Boolean> results = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            b = false;
            for (int j = 0; j < 2; j++) {
                c = false;
                for (int k = 0; k < 2; k++) {
                    final boolean result = f(a, b, c);
                    results.add(result);
                    c = true;
                }
                b = true;
            }
            a = true;
        }
        System.out.println(results);
        ArrayList<ArrayList<Boolean>> triagle = new ArrayList<>();
        triagle.add(results);
        for (int i = 0; i < results.size() - 1; i++) {
            ArrayList<Boolean> raw = new ArrayList<>();
            fillRaw(raw, triagle.get(triagle.size() - 1));
            triagle.add(raw);
        }
        ArrayList<Boolean> polynomCoeficients = new ArrayList<>();
        for (int i = 0; i < triagle.size(); i++) {
            polynomCoeficients.add(triagle.get(i).get(0));
        }
        System.out.println(polynomCoeficients);
        ArrayList<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < polynomCoeficients.size(); i++) {
            if (polynomCoeficients.get(i) == false) {
                tmp.add(0);
            } else {
                tmp.add(1);
            }
        }
        System.out.println(tmp);
    }

    private static void fillRaw(ArrayList<Boolean> raw, ArrayList<Boolean> results) {
        for (int i = 0; i < results.size() - 1; i++) {
            final Boolean left = results.get(i);
            final Boolean right = results.get(i + 1);
            raw.add(left ^ right);
        }
        System.out.println(raw);
    }

    static boolean f(boolean a, boolean b, boolean c) {
        return a && b || c;
    }
}
