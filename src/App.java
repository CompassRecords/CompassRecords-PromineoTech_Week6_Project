public class App {

public static void main(String[] args) {

//Create deck and shuffle
	Deck deck = new Deck();
	deck.shuffle();
		
//Create players
	Player player1 = new Player("Player 1");
	Player player2 = new Player("Player 2");
		
//Deal 52 cards
	Player next = player1;
	for (int i = 0; i < 52; i++) {
//Deal card
		next.draw(deck);
			
//Change next to other player
	if(next == player1)
		next = player2;
	else
		next = player1;
	}
		
//Describe both players
	player1.describe();
		System.out.println();
	player2.describe();
		
//Flip cards and compare
	for (int i = 0; i < 26; i++) {

//Flip two cards
		Card card1 = player1.flip();
		Card card2 = player2.flip();
			
//Compare cards
	if(card1.getValue() > card2.getValue())
		player1.incrementScore();
	else if(card1.getValue() < card2.getValue())
		player2.incrementScore();
	}
		
//Print winner based on score
		System.out.println("\nWinner:");
		
	if(player1.getScore() > player2.getScore())
		System.out.println("Player 1");
	
	else if(player2.getScore() > player1.getScore())
		System.out.println("Player 2");
	
	else
		System.out.println("Draw");
	}
}