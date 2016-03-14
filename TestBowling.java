package bowling;
import java.util.Scanner;

public class TestBowling {
	public boolean isValidEntry (Object input) {
		if (input == 1 || input == 2 || input.toLowerCase() == "one" || input.toLowerCase == "two")  {
			return true;
		}
		else {
			"Sorry, that is not a recognized response. Please re-enter."
			return false;
		}

	}
	public static void main(String[] args) {
		Object players;
		String name1, name2;
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("How many players wold you like to play?");
		players = input.next;
		} while (!(isValidEntry(players)));
		System.out.println("Please enter player 1's name: ");
		name1 = input.nextLine();
		if (players == "two" || players == 2) {
			System.out.println("Please enter player 2's name: ");
			name2 = input.nextLine();
			Game bowling = new Game(name1,name2);
		}
		else {
			Game bowling = new Game(name1);
		}
		while (bowling.getFrame() <= 10) {
			bowling.playFrame();
		}
		bowling.displayWinner();



	}
}