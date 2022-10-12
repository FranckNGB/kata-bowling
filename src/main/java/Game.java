import java.util.ArrayList;
import java.util.List;

class Game {
    List<Integer> scoreByFrames;
    int pinsKnockedByFrame;

    Game(int nbrPins) {
        this.scoreByFrames = new ArrayList<>(nbrPins);
        this.pinsKnockedByFrame = nbrPins;
    }

    void roll(int pins) {
        scoreByFrames.add(pins);
    }

    public int score() {
        var totalScore = 0;
        for (Integer roll : scoreByFrames) {
            totalScore = totalScore + roll;
        }
        return totalScore;
    }
}
