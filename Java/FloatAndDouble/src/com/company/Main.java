package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Float min = " + myMinFloatValue);
        System.out.println("Float max = " + myMaxFloatValue);
        System.out.println("Double min = " + myMinDoubleValue);
        System.out.println("Double max = " + myMaxDoubleValue);

        int myIntValue = 10;
        float myFloatValue = (float) 10/3.9f;
        double mydoubleValue = (double) (myIntValue /3.9d);

        System.out.println(mydoubleValue);
        System.out.println(myFloatValue);

    }
}
