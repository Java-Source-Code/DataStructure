package com.algorithm.grap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hiemseyha on 4/7/18.
 */


public class BreadthFirstSearch {

    int size;
    AdjacencyList[] array;


    public BreadthFirstSearch(int size) {
        this.size  = size;
        this.array = new AdjacencyList[this.size];
        for(int i = 0; i < size; i++) {
            this.array[i] = new AdjacencyList();
            this.array[i].head = null;
        }
    }

    public void add(int src, int dest) {
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }

    public void BSFExplore(int startVertex) {
        Boolean[] visited = new Boolean[size];
        for(int i = 0; i<size; i++) {
            visited[i] = false;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startVertex);

        while(!queue.isEmpty()) {
            int n = queue.poll();
            System.out.println("Visited node: " + n);
            visited[n] = true;
            Node head = array[n].head;
            while(head != null) {
                if (visited[head.value] == false) {
                    queue.add(head.value);
                    visited[head.value] = true;
                } else {
                    head = head.next;
                }
            }
        }
    }
}
