package com.company;
public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value =" + myMinIntValue );
        System.out.println("Integer Max Value =" + myMaxIntValue );
        System.out.println("Busted MAX Value =" + (myMaxIntValue + 1) );
        System.out.println("Busted MIN Value =" + (myMinIntValue - 1) );

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Min Value =" + myMinshortValue );
        System.out.println("short Max Value =" + myMaxshortValue );

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value =" + myMinLongValue );
        System.out.println("Long Max Value =" + myMaxLongValue );

        short bigShortLiteralValue = (355/2) ;
        long biglongLiteralValue = (long) ((355/2)+1000000000000L);
        System.out.println(biglongLiteralValue);


        byte x = 100;
        short y = 1000;
        int z = 100000;

        long a = 50000L + (long) (10*(x+y+z));

        System.out.println(a);


    }
}
