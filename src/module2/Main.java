package module2;

public class Main {
    public static void main(String[] args) {
        String test = "Hello World";

        HuffmanCode newCode = new HuffmanCode();

        int[] charFreqs = new int[256];
        for (char c : test.toCharArray()) {
            charFreqs[c]++;
        }
        HuffmanTree tree = newCode.buildTree(charFreqs);

    }
}
