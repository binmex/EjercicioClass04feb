package logic;

import java.util.HashMap;

public class thredFriends implements Runnable{

    private int begin;
    private int end;
    private HashMap firends;

    public thredFriends(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        firends =  numbersPerfect.finPerfects(begin,end);
    }

    public HashMap getFirends() {
        return firends;
    }
}
