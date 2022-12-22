package curs07.concurrency.challenge1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if(i % 2 == 1){
                (new RabbitThread(i)).start();
            } else {
                (new RabbitRunnable(i)).run();
            }
        }
    }
}
