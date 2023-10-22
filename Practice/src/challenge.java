public class challenge {

    public static void displayHighScorePosition(String name, int position, int score) {
        System.out.println(name + " managerd to get into position " + position + 
        " on the highscore list with a score of " + score);
    }

    public static int calculateHighScore(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void main(String[] args) {
        String playerName = "tim";
        int[] playerScores = { 1500, 1000, 800, 550, 400, 200, 100 };
        for (int i = 0; i < playerScores.length; i++) {
            int playerPosition = calculateHighScore(playerScores[i]);
            displayHighScorePosition(playerName, playerPosition, playerScores[i]);
        }

    }
}
