import java.util.HashMap;
import java.util.Map;

class Game {
    Map<Integer, Integer> framesScores = new HashMap<>(10);
    int CURRENT_FRAME_SELECTED = 0;

    void roll(int nbrPins) {
        framesScores.put(CURRENT_FRAME_SELECTED, nbrPins);
        CURRENT_FRAME_SELECTED++;
    }

    public int score() {
        var totalScore = 0;
        for (Map.Entry<Integer, Integer> frameScore : framesScores.entrySet()) {
            totalScore = totalScore + frameScore.getValue();
        }
        return totalScore;
    }
}
