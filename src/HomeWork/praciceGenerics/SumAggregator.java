package homeWork.praciceGenerics;

public class SumAggregator implements Aggregator<Integer,Integer> {
    @Override
    public Integer aggregate(Integer[] items) {
        int sum = 0;
        for (Integer item : items) {
            sum += item;
        }
        return sum;
    }
}
