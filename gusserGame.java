package Strings;

import java.util.*;

class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player's! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        // (g=guessingNumber)
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayers() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("sab ne shi answer diya! sab winner hai");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and player 2 dono jeet gaye h");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and player 3 dono jeet gaye h");
            } else {
                System.out.println("Player1 Won the game");
            }

        }

        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("print 2 aur player 3 jeet gaye ");
            } else {
                System.out.println("Player2 Won the ganme");
            }

        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player3 Won the game");
        } else {
            System.out.println("sab ka sab galat hain, aap game haar gaye h janab!!54");
        }
    }

}

public class gusserGame {
    public static void main(String[] args) {
        System.out.println("***Game Started***");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
