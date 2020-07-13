import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
		
// Creates a player with specified name
	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
	}
		
// Print all information about player
	public void describe() {

// Print name and score
		System.out.println("Name: " + name + ", Score: " + score);
			
// Print cards
		System.out.println("Cards: ");
		for (Card card : hand) {
			card.describe();
	}
	}
		
// Remove the last card in the deck
	public Card flip() {
		return hand.remove(hand.size() - 1);
	}
		
// Draw from deck and add at end of list
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
		
// Increment score by 1
	public void incrementScore() {
		score++;
	}
		
// Get score
	public int getScore() {
		return score;
	}
}	
	
	

