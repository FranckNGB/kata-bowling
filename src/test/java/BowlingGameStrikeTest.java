import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameStrikeTest {
    @Test
    public void WhenAPlayerKnocksTenPinsInOneRoll_ThenItShouldBeAStrike() {
        // Given
        var bonusScoreFirstNextRoll = 6;
        var bonusScoreSecondNextRoll = 3;

        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(10);

        existingBowlingGame.roll(bonusScoreFirstNextRoll);
        existingBowlingGame.roll(bonusScoreSecondNextRoll);

        // Then
        var updatedFrame = existingBowlingGame.framesScores.get(0);
        assertThat(existingBowlingGame.score()).isEqualTo(19);
        assertThat(updatedFrame.action()).isEqualTo(FrameAction.STRIKE);
    }
}
