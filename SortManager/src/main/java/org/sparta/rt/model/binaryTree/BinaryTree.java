package org.sparta.rt.model.binaryTree;

public class BinaryTree implements BinaryTreeInterface{

    public final Node rootNode;
    private int numOfElements;

    public BinaryTree(int element) {

        this.rootNode = new Node(element);
        numOfElements++;
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
        node = node.getLeftChild();
        return node.getValue();
    }

    @Override
    public int getRightChild(int element) {

        Node node = findNode(element);
        node = node.getRightChild();
        return node.getValue();
    }

    //@Override
    public void getSortedTreeAsc(Node node, int i) {

        //int[] result = new int[numOfElements];

        // Stop printing if no node found
        if(node == null) return;

        // Get the smallest key first
        // which is in the left subtree
        getSortedTreeAsc(node.getLeftChild(), i+1);

        // Print value

        int value = node.getValue();
        System.out.println(value);

        // Continue to the greatest key
        // which is in the right subtree
        getSortedTreeAsc(node.getRightChild(), i+1);
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

