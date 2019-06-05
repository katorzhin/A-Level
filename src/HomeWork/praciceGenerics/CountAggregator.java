package homeWork.praciceGenerics;

public class CountAggregator<T1> implements Aggregator<T1, Integer> {

    @Override
    public Integer aggregate(T1[] items) {
        return items.length;
    }
}
