import java.util.HashMap;
import java.util.Map;

class Game {
    public boolean isASpare = false;
    public boolean isAStrike = false;
    Map<Integer, Integer> framesScores  = new HashMap<>() {{
        put(1, 0);
        put(2, 0);
        put(3, 0);
        put(4, 0);
        put(5, 0);
        put(6, 0);
        put(7, 0);
        put(8, 0);
        put(9, 0);
        put(10, 0);
    }};

    static int CURRENT_FRAME_SELECTED = 1;
    static int CURRENT_ROLL_SELECTED = 0;

    void roll(int nbrPinsKnocked) {
        if (CURRENT_ROLL_SELECTED % 2 == 0 && !isAStrike) {
            checkIfIsASpare();
            CURRENT_FRAME_SELECTED++;
        }
        CURRENT_ROLL_SELECTED++;
        framesScores.put(CURRENT_FRAME_SELECTED, framesScores.get(CURRENT_FRAME_SELECTED) + nbrPinsKnocked);
        checkIfIsAStrike(nbrPinsKnocked);
    }

    private void checkIfIsAStrike(int nbrPins) {
        if (nbrPins == 10) {
            isAStrike = true;
            CURRENT_FRAME_SELECTED++;
        }
    }

    private void checkIfIsASpare() {
        if (framesScores.get(CURRENT_FRAME_SELECTED) == 10) {
            isASpare = true;
        }
    }

    public int score() {
        var totalScore = 0;
        for (Map.Entry<Integer, Integer> frameScore : framesScores.entrySet()) {
            totalScore = totalScore + frameScore.getValue();
        }
        System.out.println(framesScores);
        return totalScore;
    }
}
