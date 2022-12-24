package com.mycompany.algorithms;

import static com.mycompany.algorithms.InsertionSort.printArray;

public class Main {

    public static void main(String[] args) {
        //MERGE SORT
        int arr1[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        MergeSort.printArray(arr1);

        MergeSort ob1 = new MergeSort();
        ob1.sort(arr1, 0, arr1.length - 1);

        System.out.println("\nSorted array");
        MergeSort.printArray(arr1);

        System.out.println("\n----------------------------------\n");
        //INCERTION SORT
        int arr2[] = {12, 11, 13, 5, 6};
        InsertionSort ob2 = new InsertionSort();
        ob2.sort(arr2);

        printArray(arr2);

        System.out.println("\n----------------------------------\n");
        //KRUSKAL ALGORITHM
        int V = 4;
        int E = 5;
        KurskalAlgorithm graph = new KurskalAlgorithm(V, E);

        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;

        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;

        graph.KruskalMST();

    }

}
