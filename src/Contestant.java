import javax.swing.*;
import java.util.Random;

/**
 * created by Mimi Santana
 * Date: 2020-09-11
 * Time: 16:43
 * Project: Rock_paper_scissors
 * Copyright: MIT
 */

public class Contestant {



    private String move; // spelarens drag

    /**
     * <br>Contestant är en konstruktor som har String move som parameter<br>
     * användaren anger PAPER, ROCK eller SCISSORS som move.
     * @param move
     */

    Contestant(String move) { // tar emot sträng
        if (move.toUpperCase().equals(Game.PAPER)) // om användaren skriver in tex "paper" hanterar vi det med toUpper
            this.move = Game.PAPER; // sätter spelarens drag
        else if (move.toUpperCase().equals(Game.ROCK))
            this.move = Game.ROCK;
        else if (move.toUpperCase().equals(Game.SCISSORS))
            this.move = Game.SCISSORS;
        else throw new IllegalArgumentException("Choose PAPER, ROCK or SCISSORS as input"); //hanterar fel om användaren anger något annat än PAPER, ROCK, SCISSORS i små eller stora bokstäver
    }
    Contestant() {
        /**
         * Contestant konstruktor nr 2 - är parameterlös, den använder sig av klassen Random för att slumpa fram ett nummer mellan 0-2, och beroende på utfall sätts konstruktorns drag till antingen ROCK, PAPER,SCISSORS.
         * <br>denna konstruktor ska sedan instansieras och användas som motståndare till den som spelar spelet.<br>
         */
        var generateMove = new Random().nextInt(3);
        if (generateMove == 0)
            this.move = Game.PAPER;
        else if (generateMove == 1)
            this.move = Game.ROCK;
        else
            this.move = Game.SCISSORS;
    }

    /**
     * getMove hämtar spelarens eller datorns aktuella drag vid anrop.
     * @return spelarens drag
     */
    public String getMove() {
        return this.move;

    }
}



