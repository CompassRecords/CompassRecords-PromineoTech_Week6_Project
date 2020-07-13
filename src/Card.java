public class Card {

// Card details
	private int value;
	private String name;

// Getter
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
// Setter
	public void setValue(int value) {
		this.value = value;
	}
	public void setName(String name) {
		this.name = name;
	}

// "Describe" prints information card details
	public void describe() {
		System.out.println(name + " - " + value);
	}
}