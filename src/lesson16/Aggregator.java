package lesson16;

public interface Aggregator<T1, T2> {
    T2 aggregate(T1[] items);
}
