package model.enums;

public enum CardValue {
	Two(2), Three(3), Four(4), Five(5),
	Six(6), Seven(7),Eight(8), Nine(9),
	Ten(10), Jack(10), Queen(10), King(10), Ace(10);

	private final int value;
	
    private CardValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
