package module2;

public class HuffmanTree implements Comparable<HuffmanTree> {
    public final int frequency;

    public HuffmanTree(int freq) {
        this.frequency = freq;
    }

    @Override
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}
