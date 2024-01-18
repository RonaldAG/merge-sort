package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      Integer[] numbers = new Integer[] { 1, 3, 3, 4, 2, 7, 6, 8, 9};
      System.out.println(Arrays.toString(numbers));

      Merge.mergeSort(numbers);
      System.out.println(Arrays.toString(numbers));
    }
}