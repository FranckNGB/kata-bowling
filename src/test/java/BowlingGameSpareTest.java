import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameSpareTest {
    @Test
    public void WhenAPlayerKnocksTenPins_ThenItShouldBeASpare() {
        // Given
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(3);
        existingBowlingGame.roll(7);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(10);
        assertThat(existingBowlingGame.isASpare).isEqualTo(true);
    }
}