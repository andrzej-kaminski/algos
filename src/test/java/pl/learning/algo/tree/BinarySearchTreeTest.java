package pl.learning.algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void shouldAddItems() {
        Tree<Integer> tree = new BinarySearchTree<Integer>();
        tree.add(10);
        tree.add(6);
        tree.add(11);
        tree.add(5);
    }

}