package edu.cse;

import java.util.Arrays;

public class FibNum implements Runnable {

    private int fibNumValue;

    FibNum(int value){
        fibNumValue=value;
    }

    private int fibOf(){
        int[] array = new int [fibNumValue];
        int prevX=0;
        int intX;
        int X=1;
        int Y=0;
        array[Y] = X;
        //System.out.println(X);
        for (int number = fibNumValue-1; number >=1; number--){
            Y++;
            intX=X;
            X=prevX+X;
            prevX=intX;
            //System.out.println(X);
            array[Y] = X;
        }
       // System.out.println(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
        return X;

    }


    private String woo(){
        if(fibNumValue % 10 == 1) {
            return "The " + fibNumValue + "st Fib number is " + fibOf() + ".";
        }else if (fibNumValue % 10 == 2){
            return "The " + fibNumValue + "nd Fib number is " + fibOf() + ".";
        }
        else if (fibNumValue % 10 == 3){
            return "The " + fibNumValue + "rd Fib number is " + fibOf() + ".";
        } else{
            return "The " + fibNumValue + "th Fib number is " + fibOf() + ".";
        }
    }


    public void run(){
        System.out.println(woo());
    }
}
