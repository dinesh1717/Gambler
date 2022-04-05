package Gambler;
import java.util.Scanner;

public class Gambling {
    public static final int Stake = 100;
    public static final int BET = 1;


    private static int checkWin (){
        return (int) Math.floor(Math.random() * 10) % 2;
    }



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

        System.out.println("Set Limit till you want to win for 4th Use Case ");
        int winLimit2 = scanner.nextInt();
        System.out.println("Set Limit till you can afford Lose for 4th Use Case ");
        int loseLimit2 = scanner.nextInt();
        gambler.totalAmountCalFor20Days(winLimit2, loseLimit2);
        System.out.println("Use Case 4 Finished");
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

    //UC4 Calcutating total amount won or lose for 20 days
    public void totalAmountCalFor20Days(int winLimit, int loseLimit) {
        int checkWin = winLimit;
        int checkLose = loseLimit;
        int days = 20;
        int countWin = 0;
        int countLose = 0;
        for (int index = 1; index <= days; index++) {
            int resultOfDay = gamePLay(winLimit, loseLimit);
            if (resultOfDay == checkWin) {
                countWin++;
            } else if (resultOfDay == checkLose) {
                countLose++;
            }
        }
        System.out.println("Total 20 Days Result");
        System.out.println("In 20 Days Total Wins" + countWin);
        System.out.println("In 20 Days Total Loses" + countLose);
    }
    //UC5

    public void monthlyCalculate(int winLimit, int loseLimit) {
        int checkWin = winLimit;
        int checkLose = loseLimit;
        int days = 30;
        int countWin = 0;
        int countLose = 0;
        int wonByHowMuch = 0;
        int loseByHowMuch = 0;
        for (int index = 0; index < days; index++) {

            int resultOfDay = gamePLay(winLimit, loseLimit);
            if (resultOfDay == checkWin) {
                wonByHowMuch = wonByHowMuch + resultOfDay;
                countWin++;
            } else if (resultOfDay == checkLose) {
                loseByHowMuch = loseByHowMuch + resultOfDay;
                countLose++;
            }
        }
        System.out.println("Monthly Result");
        System.out.println("In Month Total Wins " + countWin);
        System.out.println("In Month Total Loses" + countLose);
        System.out.println(" Won By :- " + wonByHowMuch);
        System.out.println(" Lose By :- " + loseByHowMuch);
    }
    //UC6
    public void checkLuckyOrUnluckyDay(int winLimit, int loseLimit) {
        int checkWin = winLimit;
        int checkLose = loseLimit;
        int days = 30;
        int countWin = 0;
        int countLose = 0;
        int day = 0;
        int luckiestDay = 0;
        int unLuckiestDay = 0;

        for (int index = 0; index < days; index++, day++) {

            int resultOfDay = gamePLay(winLimit, loseLimit);
            if (resultOfDay == checkWin) {
                countWin++;
                luckiestDay = day;
                System.out.println("Luckyiest Day " + luckiestDay + "");

            } else if (resultOfDay == checkLose) {
                countLose++;
                unLuckiestDay = day;
                System.out.println(" Unluckyiest Day " + unLuckiestDay);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Monthly How Many Luckiest Days And Unluckiest Days");
        System.out.println("In Month Luckiest Days" + countWin);
        System.out.println("In Month Unluckiest Days" + countLose);
    }

}









