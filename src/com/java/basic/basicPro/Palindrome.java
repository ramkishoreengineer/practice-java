package com.java.basic.basicPro;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalin(12321));
        System.out.println(isPalin("kissik"));

    }
    static boolean isPalin(int target){
        return reverse(target) == target;
    }
    static int reverse(int target){
        int result = 0;
        while(target>0){
            result = result*10 + target%10;
            target = target/10;
        }
        return result;
    }
    static boolean isPalin(String target){
        String result = "";
        StringBuffer sb = new StringBuffer(target);
        result = sb.reverse().toString();
        return target.equals(result);
    }
}
