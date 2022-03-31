package Gambler;

public class Gambling {
    public static final int Stake = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
        Gambling gambler = new Gambling();
        System.out.println("Welcome to Gambling Game");
        gambler.checkWinOrLose();
        System.out.println("Game Over");
    }
        //UC2
    public void checkWinOrLose() {
        boolean randomCheck = (Math.random() < 0.5);

        if (randomCheck) {
            System.out.println(" Congrats Player Win 1$ ");
        } else {
            System.out.println(" Player Lose 1$ ");


        }
    }
}
