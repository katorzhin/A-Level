package homeWork.praciceGenerics;

public class AvgAggregator implements Aggregator<Integer, Integer> {

    @Override
    public Integer aggregate(Integer[] items) {
        int sum = 0;
        int arithmetic = 0;
        for (Integer item : items) {
            sum += items[item];
            arithmetic = sum / items.length;
        }
        return arithmetic;
    }
}
