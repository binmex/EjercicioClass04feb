package run;

import logic.numbersPerfect;
import logic.thredFriends;

public class Runner {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        thredFriends frOne = new thredFriends(100,5000);
        thredFriends frTwo = new thredFriends(5000,10000);

        Thread thOne = new Thread(frOne);
        Thread thtwo = new Thread(frTwo);

        thOne.start();
        //new Thread(frOne).start();
        try {
            thOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thtwo.start();
        //new Thread(frTwo).start();
        try {
            thtwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(frOne.getFirends());
        System.out.println(frTwo.getFirends());

        //System.out.println(numbersPerfect.finPerfects(200,10000));
        System.out.println((double) (System.currentTimeMillis()-timeBegin)/1000+ "seg");
    }
}
