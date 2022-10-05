package course_algo.homework6;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.function.Consumer;

public class BinaryTreeHW<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void add(T item) {
        Objects.requireNonNull(item);
        root = appendNode(root, item);
    }

    private Node<T> appendNode(Node<T> current, T value) {
        if (current == null) {
            return new Node<T>(value);
        }
        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }
        return current;
    }

    @Override
    public boolean contains(T item) {
        return Objects.nonNull(findNode(root, item));
    }

    private Node<T> findNode(Node<T> current, T value) {
        if (Objects.isNull(current)) {
            return null;
        }
        int compare = value.compareTo(current.value);
        if (compare < 0) {
            return findNode(current.left, value);
        } else if (compare > 0) {
            return findNode(current.right, value);
        }

        return current;
    }

    @Override
    public void remove(T item) {
        root = remove(root, item);
    }

    private Node<T> remove(Node<T> current, T value) {
        if (Objects.isNull(current)) {
            return null;
        }
        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = remove(current.left, value);
            return current;
        } else if (compare > 0) {
            current.right = remove(current.right, value);
            return current;
        }
        if (current.left == null && current.right == null) {
            return null;
        }
        if (current.left == null) {
            return current.right;
        }
        if (current.right == null) {
            return current.left;
        }
        Node<T> minOnTheRight = findMin(current.right);
        current.value = minOnTheRight.value;
        current.right = remove(current.right, minOnTheRight.value);
        return current;
    }

    private Node<T> findMin(Node<T> current) {
        Node<T> left = current.left;
        return Objects.isNull(left) ? current : findMin(left);
    }

    public void dfs(Consumer<T> visitor) {
        dfs(root, visitor);
    }

    private void dfs(Node<T> current, Consumer<T> visitor) {
        if (current != null) {
            dfs(current.left, visitor);
            visitor.accept(current.value);
            dfs(current.right, visitor);
        }
    }

    @Override
    public void bfs(Consumer<T> visitor) {
        if (root == null) {
            return;
        }
        Queue<Node<T>> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node<T> node = nodes.poll();
            visitor.accept(node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }

    }

    public int height(Node<T> node) {
        return node == null ? 0 : 1 + Math.max(height(node.leftChild), height(node.rightChild));

    }

    @Override
    public boolean isBalanced() {
        return isBalanced(root);

    }

    private boolean isBalanced(Node<T> node) {
        return (node == null) ||
                isBalanced(node.leftChild) &&
                        isBalanced(node.rightChild) &&
                        Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1;
    }

    private static class Node<T extends Comparable<? super T>> {
        private T value;
        private Node<T> left;
        private Node<T> leftChild;
        private Node<T> rightChild;
        private Node<T> right;

        public Node(T value) {
            this.value = value;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }

    }
}
