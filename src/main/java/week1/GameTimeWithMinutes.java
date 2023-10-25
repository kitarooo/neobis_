package week1;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startGameHour = input.nextInt();
        int startGameMinutes = input.nextInt();
        int finishGameHour = input.nextInt();
        int finishGameMinutes = input.nextInt();

        int hours = 0;
        int minutes = 0;

        //7 50 7 45


        if (startGameHour >= 0 && startGameHour <= 24 && startGameMinutes >= 0 && startGameMinutes <= 60 &&
            finishGameHour >= 0 && finishGameHour <= 24 && finishGameMinutes >= 0 && finishGameMinutes <= 60) {
            if (finishGameHour >= startGameHour) {
                hours = finishGameHour - startGameHour;
            } else if (finishGameHour < startGameHour) {
                hours = 24 - (finishGameHour + startGameHour);
            }

            if (finishGameMinutes >= startGameMinutes) {
                minutes = finishGameMinutes - startGameMinutes;
            } else if (finishGameMinutes < startGameMinutes) {
                minutes = finishGameMinutes - startGameMinutes + 60;
                hours--;
            }

            if (hours == 0 && minutes == 0){
                hours = 24;
            }
        }
        System.out.println(("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)"));
    }
}
