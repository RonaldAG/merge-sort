package org.example;

public class Merge {

    public static boolean less(Comparable a, Comparable b) {
        int aux = a.compareTo(b);
        if (aux <= 0) return true;
        return false;
    }

    public static void merge(Comparable[] a, Comparable[] aux, int low, int middle, int high) {
        // Preencher o array auxiliar
        for (int i = low; i <= high; i++) {
            aux[i] = a[i];
        }

        int left = low;
        int right = middle + 1;
        // Merge
        for (int i = low; i <= high; i++) {
            if (left > middle) a[i] = aux[right++];
            else if (right > high) a[i] = aux[left++];
            else if (less(aux[left], aux[right])) a[i] = aux[left++];
            else a[i] = aux[right++];
        }
    }

    public static void mergeSort(Comparable[] a, Comparable[] aux, int low, int high) {
        if (low >= high) return;
        int middle = (low + high) / 2;
        mergeSort(a, aux, low, middle);
        mergeSort(a, aux, middle + 1, high);
        merge(a, aux, low, middle, high);
    }

    public static void mergeSort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        mergeSort(a, aux, 0, a.length - 1);
    }
}
