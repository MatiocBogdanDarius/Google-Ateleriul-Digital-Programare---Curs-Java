package curs07.concurrency.challenge3;

import java.util.Random;

public class RockPaperScissorsThread extends Thread {
    int selected; // 0 -> rock, 1 -> paper, 2 -> scissors

    public int getSelected() {
        return selected;
    }

    @Override
    public void run() {
        selected = (new Random()).nextInt(2);
    }
}
