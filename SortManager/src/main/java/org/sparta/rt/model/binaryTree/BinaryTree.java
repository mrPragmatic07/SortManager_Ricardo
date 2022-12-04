package org.sparta.rt.model.binaryTree;

public class BinaryTree implements BinaryTreeInterface{

    private final Node rootNode;
    private int numOfElements;

    public static class Node {

        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {

            return leftChild == null;
        }

        public boolean isRightChildEmpty() {

            return rightChild == null;
        }
    }

    public static void executeBinaryTree(int[] array) {

        BinaryTree tree = new BinaryTree(array);
        System.out.println("Sorted Array:");
        tree.getSortedTreeAsc(tree.rootNode);
    }

    public BinaryTree(int element) {

        this.rootNode = new Node(element);
        numOfElements++;
    }

    public BinaryTree(int[] array) {

        this.rootNode = new Node(array[0]);
        numOfElements++;

        for(int i = 1;  i<array.length; i++) {
            addElement(array[i]);
        }
    }

    public Node getRootNode() {
        return rootNode;
    }

    @Override
    public int getRootElement() {

        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {

        return numOfElements;
    }

    @Override
    public void addElement(int element) {

        addNodeToTree(rootNode, element);
        numOfElements++;
    }

    @Override
    public void addElements(int[] elements) {

        for (int element : elements) {

            addElement(element);
        }
    }

    @Override
    public boolean findElement(int element) {

        Node node = findNode(element);
        if(node != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getLeftChild(int element) {

        Node node = findNode(element);
        assert node != null;
        node = node.getLeftChild();
        return node.getValue();
    }

    @Override
    public int getRightChild(int element) {

        Node node = findNode(element);
        assert node != null;
        node = node.getRightChild();
        return node.getValue();
    }

    public void getSortedTreeAsc(Node node) {

        // Stop printing if no node found
        if(node == null) return;

        // Get the smallest key first
        // which is in the left subtree
        getSortedTreeAsc(node.getLeftChild());

        // Print value
        System.out.println(node.getValue());

        // Continue to the greatest key
        // which is in the right subtree
        getSortedTreeAsc(node.getRightChild());
    }

    private void addNodeToTree(Node node, int element) {

        if(element < node.getValue()) {
            if(node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element >= node.getValue()) {
            if(node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private Node findNode(int element) {

        Node node = rootNode;
        while(node != null) {
            if(element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else if (element > node.getValue()) {
                node = node.getRightChild();
            }
        }
        return null;
    }
}

