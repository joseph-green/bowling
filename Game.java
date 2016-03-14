package bowling;
import java.lang.Math;

public class Game {
	private int frame = 1, computerScore = 0;
	private Player player1,player2;
	private boolean twoPlayers;



	public Game(String name) {
		twoPlayers = false;
		player1 = new Player(name);
	}
	public Game(String name, String name2) {
		twoPlayers = true;
		player1 = new Player(name);
		player2 = new (name2);
	}
	public void playFrame() {
		frame++;
		System.out.println(self);
		player1.play;
		if (twoPlayers) {
			player2.play;
			System.out.println(player1);
			System.out.println(player2);
		}
		else {
			playComputer;
			System.out.println(player1);
			System.out.println("COMPUTER: " + computerScore);
		}


	}
	public void playComputer() {
		int pins = 10, knocked_down = (pins - 1) * Math.random() + 1;
		System.out.println("COMPUTER knocked over " + knocked_down + " pin(s)!");
		pins -= knocked_down;
		if (pins == 0) {
			System.out.println("It's a STRIKE! 20 points!");
			computerScore += 20;
		}
		else {
			knocked_down = (pins - 1) * Math.random() + 1;
			System.out.println("COMPUTER knocked over " + knocked_down + " pin(s)!");
			pins -= knocked_down;
			if (pins == 0) {
				System.out.println("It's a SPARE! 15 points!");
				computerScore += 15;
			}
			else {
				int points = 10 - pins;
				System.out.println("COMPUTER scored " + points + " points!");
				computerScore += points;
			}

		}
		System.out.println(computerScore);
		

	}
	public int getFrame() {
		return frame;
	}
	public void displayWinner() {
		if (twoPlayers) {
			if (player1.getScore() > player2.getScore()) {
				System.out.println(player1.getName() + " wins!");
			}
			else {
				System.out.println(player2.getName() + " wins!");
			}
		}
		else {
			if (player1.getScore() > computerScore) {
				System.out.println(player1.getName + " wins!");
			}
			else {
				System.out.println("COMPUTER wins!");
			}
		}
	}
	public String toString(){
		if (twoPlayers) {
			return "FRAME " + getFrame() + "\n" + player1 + "\n" + player2;
		}
		else {
			return "FRAME " + getFrame() + "\n" + player1 + "\nCOMPUTER: " + computerScore;
		}
	}
}