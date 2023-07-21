package bowling;

public class Game {

    private int[] rolls = new int[21];
    private int currentRollIndex = 0;

    public void roll(int pins) {
        rolls[currentRollIndex] = pins;
        currentRollIndex++;
    }

    public int score() {
        int totalScore = 0;
        int firstInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(firstInFrame)) {
                totalScore += 10 + nextTwoBallsForStrike(firstInFrame);
                firstInFrame++;

            } else if (isSpare(firstInFrame)) {
                totalScore += 10 + firstInNextFrame(firstInFrame);
                firstInFrame += 2;
            } else {
                totalScore += twoBallsInAFrame(firstInFrame);
                firstInFrame += 2;
            }

        }
        return totalScore;
    }

    private int twoBallsInAFrame(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private int nextTwoBallsForStrike(int firstInFrame) {
        return rolls[firstInFrame + 1] + rolls[firstInFrame + 2]
                ;
    }

    private boolean isStrike(int firstInFrame) {
        return rolls[firstInFrame] == 10;
    }

    private int firstInNextFrame(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private boolean isSpare(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1] == 10;
    }
}

