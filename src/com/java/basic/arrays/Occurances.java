package com.java.basic.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Occurances
{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }
            else{
                map.put(element,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = Integer.parseInt(entry.getValue().toString());
            if(count>1) System.out.println(entry.getKey() + "----" + entry.getValue());
        }
    }
}
