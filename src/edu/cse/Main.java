package edu.cse;

public class Main {

    public static void main(String[] args) {
        boolean sequential = true;
        if (sequential) {
            for (int i = 1; i <= 10; i++) {
                FibNum yeahBoi = new FibNum((i + (int)(Math.random() * 20)));
                yeahBoi.run();
            }
            System.out.println("This ran sequentially.");
        }
        if(!sequential){
                for (int i = 1; i <= 10; i++) {
                    Runnable yeet = new FibNum((i + (int)(Math.random() * 20)));
                    Thread letsGo = new Thread(yeet);
                    letsGo.start();
                }
                System.out.println("This ran concurrently.");
            }
        }

    }
