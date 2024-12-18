package com.java.basic.basicPro;

public class Prime {
    public static void main(String[] args) {
      //System.out.println(  isPrime(4));
        printPrimes(100);
    }

    static boolean isPrime(int target){
        if(target == 0) return false;
        if(target < 0) target = target * -1;
        boolean flag = true;
        for(int i = 2; i <= target/2; i++){
            if(target%i == 0) flag = false;
        }
        return flag;
    }

    static void printPrimes(int target){
        for (int i = 2; i < target; i++) {
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
