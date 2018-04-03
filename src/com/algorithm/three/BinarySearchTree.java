package com.algorithm.three;

/**
 * Created by hiemseyha on 4/3/18.
 */
public class BinarySearchTree {

    Node root;
    Node left;
    Node right;


    public BinarySearchTree() {
        root = null;
    }

    public void add(Node start, Node newNode) {
        if(root == null) {
            root = newNode;
            return;
        }

        if(newNode.value > start.value) {
            if(start.right == null) {
               start.right = newNode;
            }
            add(start.right, newNode);
        }

        if(newNode.value < start.value) {
            if(start.left == null) {
                start.left = newNode;
            }
            add(start.left, newNode);
        }

    }

    public Node NodeCreate(int value) {
        return new Node(value, null, null);
    }

    public void Search(int value, Node start) {

        if(start == null) {
            System.out.println("Node is not found");
            return;
        }

        if(start.value == value ) {
            System.out.println("found value is " + value);
            return;
        }

        if( value > start.value ) {
            Search(value, start.right);
        }

        if(value < start.value) {
            Search(value, start.left);
        }
    }
}
