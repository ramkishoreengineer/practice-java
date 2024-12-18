package com.java.basic.basicPro;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    static boolean isArmstrong(int target) {
        int result = 0;
        int reminder = 0;
        int temp = target;
        while (temp > 0) {
            reminder = temp % 10;
            result = result + reminder * reminder * reminder;
            temp = temp / 10;
        }
        return result == target;
    }


}
