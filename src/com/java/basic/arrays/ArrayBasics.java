package com.java.basic.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 4, 7, 5};
        printAllElements(arr);
        printAllElementsInReverseOrder(arr);
        maxElementInArray(arr);
        minElementInArray(arr);
        int[] copy = copyArray(arr);
        System.out.println(Arrays.toString(copy));
    }

    static void printAllElements(int[] arr) {
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }

    static void printAllElementsInReverseOrder(int[] arr) {
        System.out.print(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void maxElementInArray(int[] arr){
        System.out.println(Arrays.stream(arr).max());
    }
    static void minElementInArray(int[] arr){
        System.out.println(Arrays.stream(arr).min());
    }

    static int[] copyArray(int[] arr){

       //return Arrays.copyOf(arr,arr.length);
       return Arrays.copyOfRange(arr,0,5);

    }
}
