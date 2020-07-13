import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Represent a deck of cards
public class Deck {

// Ranks and suits
	private static final String[] RANKS = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	"Jack", "Queen", "King", "Ace" };
	
	private static final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs"};

// List to store cards
	private List<Card> cards = new ArrayList<>();

	public Deck() {

// For each rank
	for (int i = 0; i < RANKS.length; i++) {

// For each suit
	for (int j = 0; j < SUITS.length; j++) {

// Create card
	Card card = new Card();
		card.setValue(i + 2);
		card.setName(RANKS[i] + " of " + SUITS[j]);
	
// Add card to list
		cards.add(card);
	}
	}
	}
// Shuffle cards
	public void shuffle() {
		Random random = new Random();
			
// For each card
	for (int i = 0; i < cards.size(); i++) {

// Generate random index of card to shuffle card with
	int j = random.nextInt(cards.size());
				
// Swap cards at index i and j
		Card temp = cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, temp);
	}
	}

// Draw the last card from the deck
	public Card draw() {
		return cards.remove(cards.size() - 1);
	}
}