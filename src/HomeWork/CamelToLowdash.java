package HomeWork;

public class CamelToLowdash {

        public static void main (String[]args){
            String a = "HelloWorld";
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                char letter = a.charAt(i);
                if (i == 0) {
                    final char lowerLetter = Character.toLowerCase(letter);
                    builder.append(lowerLetter);
                } else {
                    if (Character.isLowerCase(letter)) {
                        builder.append(letter);
                    } else {
                        builder.append('_');
                        letter = Character.toLowerCase(letter);
                        builder.append(letter);
                    }
                }
            }
            System.out.println(builder);
        }
    }
