package curs07.concurrency.challenge1;

public class RabbitThread extends Thread {
    private int id;

    public RabbitThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("RabbitThread " + id + " is running");
    }
}
