package pl.learning.algo.tree;

public class BinarySearchTree<T extends Comparable<? super T>> implements Tree<T> {

    private Node<T> root;

    public void add(T item) {
        if (root == null) {
            root = new Node<T>(item);
        } else {
            add(root, item);
        }
    }

    private void add(Node<T> node, T item) {
        if (node.item.compareTo(item) > 0) {
            if (node.getLeft() == null) {
                node.left = new Node<T>(item);
            } else {
                add(node.getLeft(), item);
            }
        } else {
            if (node.getRight() == null) {
                node.right = new Node<T>(item);
            } else {
                add(node.getRight(), item);
            }
        }
    }

    private class Node<T> {
        private T item;
        private Node<T> left;
        private Node<T> right;

        public Node(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public Node<T> getLeft() {
            return left;
        }

        public Node<T> getRight() {
            return right;
        }
    }
}
