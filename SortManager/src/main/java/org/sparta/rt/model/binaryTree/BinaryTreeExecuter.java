package org.sparta.rt.model.binaryTree;

import org.sparta.rt.view.ViewManager;

public class BinaryTreeExecuter {

    public static void exeBinaryTree() {

        BinaryTree tree = new BinaryTree(10);

        int[] randIntArray = new int[20];
        randIntArray[0] = 65;
        randIntArray[1] = 55;
        randIntArray[2] = 13;
        randIntArray[3] = 5;
        randIntArray[4] = 73;
        randIntArray[5] = 79;
        randIntArray[6] = 38;
        randIntArray[7] = 86;
        randIntArray[8] = 17;
        randIntArray[9] = 30;
        randIntArray[10] = 93;
        randIntArray[11] = 61;
        randIntArray[12] = 64;
        randIntArray[13] = 23;
        randIntArray[14] = 63;
        randIntArray[15] = 89;
        randIntArray[16] = 75;
        randIntArray[17] = 4;
        randIntArray[18] = 63;
        randIntArray[19] = 1;

        ViewManager.displayArray(randIntArray);

        tree.addElements(randIntArray);
        //System.out.println("");

        //System.out.println(tree.getLeftChild(79));
        //System.out.println(tree.getRightChild(86));
        //System.out.println(tree.getNumberOfElements());

        tree.getSortedTreeAsc(tree.rootNode, 0);
        System.out.println("AfterSorting");
        ViewManager.displayArray(randIntArray);
    }
}
