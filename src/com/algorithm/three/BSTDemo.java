package com.algorithm.three;

/**
 * Created by hiemseyha on 1/4/18.
 */

public class BSTDemo {

    public static  void main(String[] arg) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.add(bst.root, bst.NodeCreate(10));
        bst.add(bst.root, bst.NodeCreate(12));
        bst.add(bst.root, bst.NodeCreate(11));
        bst.add(bst.root, bst.NodeCreate(13));
        bst.add(bst.root, bst.NodeCreate(6));

        bst.Search(130, bst.root);

    }
}
