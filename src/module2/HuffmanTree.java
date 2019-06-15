package module2;

public class HuffmanTree implements Comparable<HuffmanTree> {
    public final int frequency;

    public HuffmanTree(int freq) {
        frequency = freq;
    }

    @Override
    public int compareTo(HuffmanTree o) {
        return 0;
    }
}
