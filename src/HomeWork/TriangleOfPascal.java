package HomeWork;

public class TriangleOfPascal {
    public static void main(String[] args) {
        String initial = "010101001110";
        System.out.println(initial);

        StringBuilder previousLine = new StringBuilder(initial);

        while (true) {
            StringBuilder nextLine = new StringBuilder();
            for (int i = 0; i < previousLine.length() - 1; i++) {
                int first = Integer.parseInt(previousLine.charAt(i) + "");
                int second = Integer.parseInt(previousLine.charAt(i + 1) + "");
                int result = first ^ second;
                nextLine.append(result);
            }
            System.out.println(nextLine);
            previousLine = nextLine;
            if (previousLine.length() == 1) {
                break;
            }
        }
    }
}
