package com.algorithm.grap;

/**
 * Created by hiemseyha on 4/7/18.
 */
public class BFSDemo {

    public static void main(String[] args) {

        BreadthFirstSearch grap = new BreadthFirstSearch(6);

        grap.add(0, 2);
        grap.add(0,1);

        grap.add(1, 4);
        grap.add(1,3);
        grap.add(1, 0);

        grap.add(3,1);
        grap.add(4, 1);
        grap.add(2,5);

        grap.add(2, 0);
        grap.add(5,5);


        grap.BSFExplore(0);

    }
}
