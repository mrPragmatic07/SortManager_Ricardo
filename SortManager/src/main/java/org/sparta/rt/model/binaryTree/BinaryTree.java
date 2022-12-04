package org.sparta.rt.model.binaryTree;

public class BinaryTree implements BinaryTreeInterface {

    // Inner Class Node
    public static class Node {

        // Fields
        private final int value;
        private Node leftChild;
        private Node rightChild;

        // Getters
        public int  getValue()      {return value;}
        public Node getLeftChild()  {return leftChild;}
        public Node getRightChild() {return rightChild;}

        // Setters
        public void setLeftChild  (Node leftChild)  {this.leftChild = leftChild;}
        public void setRightChild (Node rightChild) {this.rightChild = rightChild;}

        // Constructors
        public Node(int value) {

            this.value = value;
        }


        // Methods
        public boolean isLeftChildEmpty() {

            return leftChild == null;
        }

        public boolean isRightChildEmpty() {

            return rightChild == null;
        }
    }

    // Fields
    private final Node rootNode;
    private int numOfElements;

    // Constructor
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

    // Methods
    public static void executeBinaryTree(int[] array) {

        BinaryTree tree = new BinaryTree(array);
        System.out.println("Sorted Array:");
        tree.getSortedTreeAsc(tree.rootNode);
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
        return node != null;
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

        if(node == null) return;
        getSortedTreeAsc(node.getLeftChild());
        System.out.println(node.getValue());
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

