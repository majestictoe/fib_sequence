package edu.cse;

public class FibNum implements Runnable {

    private int fibNumValue;

    FibNum(int value){
        fibNumValue=value;
    }

    private int fibOf(){
        int prevX=0;
        int intX;
        int X=1;
        System.out.println(X);
        for (int number = fibNumValue-1; number >=1; number--){
            intX=X;
            X=prevX+X;
            prevX=intX;
            System.out.println(X);
        }
        return X;
    }


    private String woo(){
        if(fibNumValue==1) {
            return "The " + fibNumValue + "st Fib number is " + fibOf() + ".";
        }else if (fibNumValue==2){
            return "The " + fibNumValue + "nd Fib number is " + fibOf() + ".";
        }
        else if (fibNumValue==3){
            return "The " + fibNumValue + "rd Fib number is " + fibOf() + ".";
        } else{
            return "The " + fibNumValue + "th Fib number is " + fibOf() + ".";
        }
    }


    public void run(){
        System.out.println(woo());
    }
}
