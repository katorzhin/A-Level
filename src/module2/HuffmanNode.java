package module2;

public class HuffmanNode {
    public final HuffmanTree left,right;

    public HuffmanNode(HuffmanTree l,HuffmanTree r){
        super(l.frequency+r.frequency);
        left=l;
        right=r;
    }
}
