import java.util.ArrayList;
import java.util.List;

class Game {
    List<Integer> rolls = new ArrayList<Integer>();


    void roll(int pins) {
        rolls.add(pins);
    }

    public int score() {
        var totalScore = 0;
        for (Integer roll : rolls) {
            totalScore = totalScore + roll;
        }
        return totalScore;
    }
}
