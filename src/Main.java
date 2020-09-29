import java.util.Scanner;
/**
 * created by Mimi Santana
 * Date: 2020-09-11
 * Time: 16:47
 * Project: Rock_paper_scissors
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) {

        int keepGoing;
        boolean keepPlaying = true;
        System.out.println("-----Welcome to: Rock Paper & Scissors!-----\n"); // visas bara vid start
        System.out.println("You will play against the computer, good luck!\n");
        while (keepPlaying) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Choose your move by typing PAPER, ROCK, or SCISSORS");
            // välj ditt drag

            Contestant player1; // instansierar utanför try-catch

            try {
                player1 = new Contestant(sc.next()); // försöker läsa in spelarens drag
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("Something went wrong, try again");
                continue; // fortsätt från rad 20 (inte starta om direkt)
            }
            var player2 = new Contestant(); // skapar datorns användare

            System.out.println("You choosed " + player1.getMove() + " Computer choosed: " + player2.getMove());
            //hämtar spelarens drag och datorns drag.
            Game.results(player1.getMove(), player2.getMove());
            // skriver ut vem som vunnit vid anrop av Game.results
            System.out.println("To continue type [1], to quit type [2]");
            keepPlaying = sc.nextInt() == 1;
            //fortsätt om spelaren tryckt 1.
        }
        System.out.println("Thanx for playing! See you soon!");
    }
}
