package homeWork.praciceGenerics;

public class MaxAggregator<T1 extends Comparable> implements Aggregator<T1, T1> {
    @Override
    public T1 aggregate(T1[] items) {
        T1 max = items[0];
        for (int i = 0; i < items.length; i++) {
            if (max.compareTo(items[i]) < 0) {
                max = items[i];
            }
        }
        return max;
    }
}