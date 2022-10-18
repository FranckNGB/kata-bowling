import java.util.HashMap;
import java.util.Map;

class Game {
    public boolean isASpare = false;
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

    static int CURRENT_FRAME_SELECTED = 0;
    static int CURRENT_ROLL_SELECTED = 0;

    void roll(int nbrPins) {
        if (CURRENT_ROLL_SELECTED % 2 == 0) {
            CURRENT_FRAME_SELECTED++;
        }
        CURRENT_ROLL_SELECTED++;
        framesScores.put(CURRENT_FRAME_SELECTED, framesScores.get(CURRENT_FRAME_SELECTED) + nbrPins);
    }

    public int score() {
        var totalScore = 0;
        for (Map.Entry<Integer, Integer> frameScore : framesScores.entrySet()) {
            totalScore = totalScore + frameScore.getValue();
            if (frameScore.getValue() == 10) {
                isASpare = true;
            }
        }
        System.out.println(framesScores);
        return totalScore;
    }
}
