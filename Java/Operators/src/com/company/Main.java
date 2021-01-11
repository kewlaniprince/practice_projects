package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 100 + 50;
        System.out.println(result);

        result = result - 148;
        System.out.println(result);

        int newResult = result *10 + result;
        System.out.println(newResult);

        newResult = newResult/ 11;
        System.out.println(newResult);

        newResult = ((newResult % 1) + 1 ) ;
        System.out.println(newResult);

        //Abbreviation
        newResult++;// 1+1 =2

        System.out.println("2 = " + newResult );

        newResult--; // 2-1 =1

        System.out.println("2 != " + newResult);

        newResult += 9; // 1+9 =10

        System.out.println("2 != " + newResult);

        newResult -= 10; // 10 -10=0
        System.out.println(newResult);

        newResult +=9;
        newResult %= 2.5;
        System.out.println(newResult); // value= 3

        boolean isAlien = true;
        { if
            (isAlien == false) {
            System.out.println("It is not an alien");}

        else
            System.out.println("It is a alien");
        }

        int topscore =101;
        if (topscore >=100) {
            System.out.println("You are a high scorer");

            boolean topscore100 = true;
            if (topscore100 == true)
                System.out.println("you scored a century");
            int secondtopscore = 80;
            if ((topscore < secondtopscore) && (topscore100 != true))
                System.out.println("you couldn't partner 100");
            int A =9;
            int B =1;
            if ((A>=10) || (B>=100))
            System.out.println("good run");


            boolean isCar = false;
            if (!isCar) System.out.println("This is not supposed to happen");

            boolean isCat = false;
            if (isCat ? true : false) System.out.println("isCat is true");


            boolean isCart = true;
            if (isCart ? true : false) System.out.println("ok true");


            //challenge

            double a = 20.00;
            double b = 80.00;
            double c = ((a+b)*100.00);
            double d = c %40.00;
            System.out.println(c/40);

            boolean isTrue = true;
            if ( d == 0)
                System.out.println(isTrue);
                if (isTrue = false) {
                    System.out.println("Got some remainder");
                }












        }


    }
}
