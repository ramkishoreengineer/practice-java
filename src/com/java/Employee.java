package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public static void main(String[] args) {

        int[] arr = {1,0,0,1,1};
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }



}
