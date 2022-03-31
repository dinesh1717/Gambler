package Gambler;
import java.util.Scanner;

public class Gambling {
    public static final int Stake = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
        Gambling gambler = new Gambling();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Gambling Game");
        System.out.println("Set Limit till you want to win UC3");
        int winLimit1 = scanner.nextInt();
        System.out.println("set limit till you can lose");
        int loseLimit1 = scanner.nextInt();
        gambler.gamePLay(winLimit1, loseLimit1);
        System.out.println();
        System.out.println("Use Case 3 Finished");
    }

    //UC2
    public boolean checkWinOrLose() {
        boolean randomCheck = (Math.random() < 0.5);

        if (randomCheck) {
            System.out.println(" Congrats Player Win 1$ ");
        } else {
            System.out.println(" Player Lose 1$ ");
        }
        return randomCheck;
    }
    //UC3

    public int gamePLay(int winLimit, int loseLimit) {
        int stake = 100;

        while (stake < winLimit && stake > loseLimit) {
            if (checkWinOrLose()) {
                stake = stake + 1;
                System.out.println(stake + " ");
            } else {
                stake = stake - 1;
                System.out.println(stake + " ");
            }
        }
        return stake;
    }
}
