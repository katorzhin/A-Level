package HomeWork;

public class MarkDownParser {
    public static String Emphasi(String oneStar) {
        int index = 0;

        if ((index = oneStar.indexOf('*', index)) != -1 ) {
            oneStar = oneStar.substring(0, index) + "<em>" + oneStar.substring(index + 1);
            index = oneStar.indexOf('*', index);
            oneStar = oneStar.substring(0, index) + "</em>" + oneStar.substring(index + 1);
        }
        return "<p>"+oneStar+"</p>";

    }
    static void Header(String word) {
        String tmp = "<p>" + word + "</p>";
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (word.charAt(i) == '#') {
                word = word.replaceAll("[#]", "");
                word = word.replaceAll("[*]", "");
                System.out.println("<html>\n" + "<body>\n" + "<h2>" + word + "</h2>");
            } else {
                word = word.replaceAll("[,]", "");

            }
        }

    }
    static void SimpleString(String string) {
        System.out.println("<p>" + string + "</p>");
    }

    public static void main(String[] args) {
        Header("#Header line");
        System.out.println(Emphasi("Simple line *with* em"));


    }
}