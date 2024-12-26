package com.java.dsa;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {9,0,-8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    //Selection sort
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

