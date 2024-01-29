package org.example;

public class BottomUpMergeSort {

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) <= 0;
    }
    private static void merge(Comparable[] a, Comparable[] aux, int lower, int middle, int higher){
            for (int i = 0; i < higher; i++){
                aux[i] = a[i];
            }

            int left = lower;
            int right = middle + 1;

            for (int i = 0; i < higher; i++){
                if (left > higher) a[i] = a[right++];
                else if (right > higher) a[i] = a[left++];
                else if (less(aux[left], aux[right])) a[i] = a[left++];
                else a[i] = a[right++];
            }
    }

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        int N = a.length;

        for (int i = 1; i < N; i = i + i){
            for (int lower = 0; lower < N - i; lower += i + i){
                merge(a, aux, lower, lower+i-1, Math.min(lower+i+i-1, N-1));
            }
        }

    }

}
