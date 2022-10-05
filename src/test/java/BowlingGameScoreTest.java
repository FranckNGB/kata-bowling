import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class BowlingGameScoreTest {
    @Test
    public void WhenAPlayerKnocksZeroPins_ThenTheScoreMustBeZero() {
        // Given
        Game newBowlingGame = new Game();

        // When
        newBowlingGame.roll(0);

        // Then
        assertThat(newBowlingGame.score()).isEqualTo(0);
    }

    @Test
    public void WhenAPlayerKnocksOnePin_ThenTheScoreMustBeOne() {
        // Given
        Game newBowlingGame = new Game();

        // When
        newBowlingGame.roll(1);

        // Then
        assertThat(newBowlingGame.score()).isEqualTo(1);
    }

    @Test
    public void WhenAPlayerKnocksSixPins_ThenTheScoreMustBeSix() {
        // Given
        Game newBowlingGame = new Game();

        // When
        newBowlingGame.roll(6);

        // Then
        assertThat(newBowlingGame.score()).isEqualTo(6);
    }
}
