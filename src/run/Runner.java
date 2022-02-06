package run;

import logic.numbersPerfect;
import logic.thredFriends;

public class Runner {
    public static void main(String[] args) {
        long timeBegin = System.currentTimeMillis();

        thredFriends frOne = new thredFriends(100,2500);
        thredFriends frTwo = new thredFriends(2501,5000);
        thredFriends frThree = new thredFriends(5001,7500);
        thredFriends frFour = new thredFriends(7501,10000);

        Thread thOne = new Thread(frOne);
        Thread thtwo = new Thread(frTwo);
        Thread thThree = new Thread(frThree);
        Thread thFour = new Thread(frFour);

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
            thtwo.join();//parecido al stop pero no lo para sino espera
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thThree.start();
        try {
            thThree.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thFour.start();
        try {
            thFour.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(frOne.getFirends());
        System.out.println(frTwo.getFirends());
        System.out.println(frThree.getFirends());
        System.out.println(frFour.getFirends());

        //System.out.println(numbersPerfect.finPerfects(200,10000));
        System.out.println((double) (System.currentTimeMillis()-timeBegin)/1000+ " seg");
        System.out.println((double) ((System.currentTimeMillis()-timeBegin)/1000)/60+ " min");
    }
}
