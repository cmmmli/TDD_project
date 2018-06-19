package money;

class Dollar extends Money {
	Dollar(int amount) {
		this.amount = amount;
	}
	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
}
