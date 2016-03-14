package bowling;

public class Player {
	private String playerName;
	private int playerScore = 0;

	public Player (String name) {
		playerName = name;

	}
	public void play () {
		int pins = 10, knocked_down = (pins - 1) * Math.random() + 1;
		System.out.println(playerName + " knocked over " + knocked_down + " pin(s)!");
		pins -= knocked_down;
		if (pins == 0) {
			System.out.println("It's a STRIKE! 20 points!");
			playerScore += 20;
		}
		else {
			knocked_down = (pins - 1) * Math.random() + 1;
			System.out.println(playerName + " knocked over " + knocked_down + " pin(s)!");
			pins -= knocked_down;

			if (pins == 0) {
				System.out.println("It's a SPARE! 15 points!");
				playerScore += 15;
			}
			else {
				int points = 10 - pins;
				System.out.println( playerName + " scored " + points + " points!");
				playerScore += points;
			}

		}
		System.out.println(playerScore);
	}
	public int getScore() {
		return playerScore;
	}
	public void assignName(String name) {
		playerName = name;
	}
	public String getName () {
		return playerName;
	}
	public String toString () {
		return playerName + ": " + playerScore;
	}
}