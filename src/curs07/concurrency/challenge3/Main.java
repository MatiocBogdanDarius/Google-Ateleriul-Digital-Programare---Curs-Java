package curs07.concurrency.challenge3;

public class Main {
    public static void main(String[] args) {
        RockPaperScissorsThread player1 = new RockPaperScissorsThread();
        RockPaperScissorsThread player2 = new RockPaperScissorsThread();
        play(player1, player2);
        play(player1, player2);
    }

    public static void play(RockPaperScissorsThread player1, RockPaperScissorsThread player2) {
        try {
            System.out.println("Start Game!");
            player1.join();
            player1.run();
            player2.join();
            player2.run();
            if(player1.getSelected() == player2.getSelected()){
                System.out.println("Equal!");
                player1.join();
                player1.run();
                player2.join();
                player2.run();
            }
            if(player1.selected - player2.selected == 1 || player1.selected - player2.selected == -2){
                System.out.println("Player 1 win!");
            }
            else {
                System.out.println("Player 2 win!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
