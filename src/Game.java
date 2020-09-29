/**
 * created by Mimi Santana
 * Date: 2020-09-11
 * Time: 16:30
 * Project: Rock_paper_scissors
 * Copyright: MIT
 */
public class Game {
    /**
     * Game är en klass med tre konstanter av typen String. Som beskriver de olika dragen.
     *
     */
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    /**
     *
     * @param move  spelarens drag</br>
     * @param computerMove datorns drag</br>
     *
     * Results är en metod som beräknar och skriver ut vinnaren när den anropas
     */
    public static void results(String move, String computerMove) {
        if (move.equals(computerMove)) // om spelaren och datorn valt samma drag
            System.out.println("Game is tie!"); // ovagjort
        else if (move.equals(Game.PAPER) && computerMove.equals(Game.ROCK))
            System.out.println("you win!"); // spelaren väljer paper och datorn har slumpat fram sten: PAPER vinner över ROCK, meddelande visas osv..
        else if (move.equals(Game.ROCK) && computerMove.equals(Game.SCISSORS))
            System.out.println("you win!");
        else if (move.equals(Game.SCISSORS) && computerMove.equals(Game.PAPER))
            System.out.println("you win!");
        else {
            System.out.println("Computer wins!");
        }
    }
}






