import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameSpareTest {
    @Test
    public void WhenAPlayerKnocksTenPins_ThenItShouldBeASpare() {
        // Given
        var bonusScore = 3;
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(3);
        existingBowlingGame.roll(7);

        existingBowlingGame.roll(bonusScore);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(13);
        assertThat(existingBowlingGame.isAStrike).isEqualTo(false);
        assertThat(existingBowlingGame.isASpare).isEqualTo(true);
    }
}