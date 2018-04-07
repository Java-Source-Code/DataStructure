package com.algorithm.grap;

/**
 * Created by hiemseyha on 4/4/18.
 */
public class DFSDemo {

    public static void main(String[] args) {

        DeepFirstSearchGrap grap = new DeepFirstSearchGrap(6);

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


        grap.DFSExplore(3);

    }
}
