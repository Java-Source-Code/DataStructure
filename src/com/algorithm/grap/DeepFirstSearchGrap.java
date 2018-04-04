package com.algorithm.grap;

import java.util.Stack;

/**
 * Created by hiemseyha on 4/4/18.
 */

public class DeepFirstSearchGrap {

    int size;
    AdjacencyList[] array;


    public DeepFirstSearchGrap(int size) {
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

    public void DFSExplore(int startVertex) {
        Boolean[] visited = new Boolean[size];
        for(int i = 0; i<size; i++) {
            visited[i] = false;
        }

        Stack<Integer> st = new Stack<Integer>();
        st.push(startVertex);
        while( !st.isEmpty()) {
            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node head = array[n].head;
            Boolean isDone = true;
            while(head != null) {
                if(visited[head.value] == false) {
                    st.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            if(isDone == true) {
                int out = st.pop();
                System.out.println("Visited node: " + out);
            }
        }
    }
}
