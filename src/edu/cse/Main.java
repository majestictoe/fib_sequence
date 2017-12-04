package edu.cse;

public class Main {

    public static void main(String[] args) {
        boolean sequential = false;
        if (sequential) {
            for (int i = 1; i <= 10; i++) {
                FibNum yeahBoi = new FibNum((i + (int)(Math.random() * 20)));
                yeahBoi.run();
            }
        }
        if(!sequential){
                for (int i = 1; i <= 10; i++) {
                    Runnable yeet = new FibNum((i + (int)(Math.random() * 20)));
                    Thread letsGo = new Thread(yeet);
                    letsGo.start();
                }
            }
        }

    }
