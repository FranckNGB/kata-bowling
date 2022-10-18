import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class BowlingGameScoreTest {
    @Test
    public void WhenAPlayerKnocksZeroPins_ThenTheScoreMustBeZero() {
        // Given
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(0);
        existingBowlingGame.roll(0);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(0);
    }

    @Test
    public void WhenAPlayerKnocksOnePin_ThenTheScoreMustBeOne() {
        // Given
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(1);
        existingBowlingGame.roll(0);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(1);
    }

    @Test
    public void WhenAPlayerKnocksSixPins_ThenTheScoreMustBeSix() {
        // Given
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(4);
        existingBowlingGame.roll(2);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(6);
    }

    @Test
    public void WhenAPlayerKnocksNinePins_ThenTheScoreMustBeNine() {
        // Given
        Game existingBowlingGame = new Game();

        // When
        existingBowlingGame.roll(5);
        existingBowlingGame.roll(4);

        // Then
        assertThat(existingBowlingGame.score()).isEqualTo(9);
    }
}
