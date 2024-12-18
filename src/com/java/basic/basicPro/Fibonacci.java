package com.java.basic.basicPro;

public class Fibonacci {
    public static void main(String[] args) {
        fiboBasic(100);
    }
    static void fiboBasic(int target){
        int number1 = 0;
        int number2 = 1;
        int result = 0;

        while(result < target){
            result = number1 + number2;
            System.out.println(result);

            number1 = number2;
            number2 = result;
        }
    }

}


