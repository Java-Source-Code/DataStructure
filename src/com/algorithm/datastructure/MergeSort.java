package com.algorithm.datastructure;

/**
 * Created by hiemseyha on 11/8/17.
 */

public class MergeSort {

    int[] array;
    int[] TempArray;

    public static void main(String[] args) {

        int[] arr = {30,10,2,50,8};

        System.out.println("\n========= Before we sort =========");
        for(int i =0; i< arr.length -1;i++) {
            System.out.print(arr[i] + "\t");
        }

        new MergeSort().prepareForSort(arr);
        System.out.println("\n\n\n========= After we sort =========");
        for(int i =0; i < arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }

    }


    public void prepareForSort(int[] arr) {

        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0, arr.length-1);
    }

    void doMergeSort(int LowerIndex, int HigherIndex) {

        if(LowerIndex < HigherIndex) {
            int middle = LowerIndex + (HigherIndex - LowerIndex) / 2;
            doMergeSort(LowerIndex, middle);
            doMergeSort(middle+1, HigherIndex);
            mergePart(LowerIndex, middle, HigherIndex);
        }
    }

    void mergePart(int LowerIndex, int middle, int HigherIndex) {

        for(int i=LowerIndex;i<=HigherIndex;i++)
            TempArray[i] = array[i];

        int i = LowerIndex;
        int j = middle + 1;
        int k = LowerIndex;

        while (i<=middle && j<= HigherIndex) {
            if(TempArray[i] <= TempArray[j]) {
                array[k] = TempArray[i];
                i++;
            } else {
                array[k] = TempArray[j];
                j++;
            }
            k++;
        }

        while(i<= middle) {
            array[k] = TempArray[i];
            k++;
            i++;
        }

    }


}
