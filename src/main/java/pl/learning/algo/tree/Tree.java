package pl.learning.algo.tree;

public interface Tree<T extends Comparable<? super T>> {
    void add(T item);
}
