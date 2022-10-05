class Game {
    private int[] rolls = new int[21];


    void roll(int pins) {
        rolls[1] = pins;
    }

    public int score() {
        int totalScore = 0;
        for (var i = 0; i < 10; i++) {
            totalScore = totalScore + (rolls[i] = rolls[i + 1]);
        }
        return totalScore;
    }
}
