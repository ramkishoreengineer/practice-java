package com.java.adv_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Random ran = new Random();
        for(int i = 0; i<=10; i++){
            list.add(ran.nextInt(12,100));
        }
        System.out.println(list);

        result  = list.stream().filter(i -> i%2==0).toList();
        System.out.println(result);*/

       /**//* result.stream().map(i -> i*2).filter(i -> i>100).forEach(System.out::println);*/

        int[] arr = {2,4,8,6,0};
        int[] arr1 = {3,1,7,9,5};
        BiFunction<int[],int[],int[]> fun = (a,a1) -> {
            int[] res = new int[a.length+ a1.length];
            Arrays.stream(a).forEach(i -> res[0]=i);
            for (int i = 0; i < a.length; i++) {
                res[i] = a[i];
            }
            return res;
        };
        Arrays.stream(fun.apply(arr,arr1)).sorted().forEach(System.out::print);

    }
}
