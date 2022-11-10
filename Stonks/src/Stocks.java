
public abstract class Stocks {

	private double price = 0;
	private int number = 0;

	public Stocks(double price, int number) {
		super();
		this.price = price;
		this.number = number;
	}
	
	public abstract double checkPromo();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
