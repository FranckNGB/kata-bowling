import java.util.ArrayList;
import java.util.Arrays;

class Game {
    ArrayList<GameFrame> framesScores = new ArrayList<>(Arrays.asList(
            new GameFrame(0, 0, FrameAction.NONE),
            new GameFrame(1, 0, FrameAction.NONE),
            new GameFrame(2, 0, FrameAction.NONE),
            new GameFrame(3, 0, FrameAction.NONE),
            new GameFrame(4, 0, FrameAction.NONE),
            new GameFrame(5, 0, FrameAction.NONE),
            new GameFrame(6, 0, FrameAction.NONE),
            new GameFrame(7, 0, FrameAction.NONE),
            new GameFrame(8, 0, FrameAction.NONE),
            new GameFrame(9, 0, FrameAction.NONE)

    ));

    static int CURRENT_FRAME_SELECTED = 0;
    static int CURRENT_ROLL_SELECTED = 0;
    static int bonusScore = 0;

    void roll(int nbrPinsKnocked) {
        if (CURRENT_ROLL_SELECTED != 0 && CURRENT_ROLL_SELECTED % 2 == 0 && framesScores.get(CURRENT_FRAME_SELECTED).action() != FrameAction.STRIKE) {
            CURRENT_FRAME_SELECTED++;
        }
        CURRENT_ROLL_SELECTED++;
        var scoreOfTheFrame = framesScores.get(CURRENT_FRAME_SELECTED).score() + nbrPinsKnocked;
        framesScores.set(CURRENT_FRAME_SELECTED, new GameFrame(CURRENT_FRAME_SELECTED, scoreOfTheFrame, FrameAction.NONE));
        setActionOnFrame(CURRENT_ROLL_SELECTED);
    }

    private void setActionOnFrame(int rollIndex) {
        if (framesScores.get(CURRENT_FRAME_SELECTED).score() == 10 && rollIndex % 2 == 0) {
            framesScores.set(CURRENT_FRAME_SELECTED, new GameFrame(CURRENT_FRAME_SELECTED, framesScores.get(CURRENT_FRAME_SELECTED).score(), FrameAction.SPARE));
        }
        else if (framesScores.get(CURRENT_FRAME_SELECTED).score() == 10 && rollIndex == 1) {
            framesScores.set(CURRENT_FRAME_SELECTED, new GameFrame(CURRENT_FRAME_SELECTED, framesScores.get(CURRENT_FRAME_SELECTED).score(), FrameAction.STRIKE));
            CURRENT_FRAME_SELECTED++;
        }
    }

    public int score() {
        var totalScore = 0;
        for (GameFrame frame: framesScores) {
            totalScore = totalScore + frame.score();
        }
        System.out.println(framesScores);
        return totalScore + bonusScore;
    }
}
