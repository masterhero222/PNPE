
public class TV extends Stocks implements ElectricApplience {

	public TV(double price, int number) {
		super(price, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double checkPromo() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String manifacture;
	private int power;
	private String model;

	public TV(double price, int number, String manifacture, int power, String model) {
		super(price, number);
		this.manifacture = manifacture;
		this.power = power;
		this.model = model;
	}

	public String getManifacture() {
		return manifacture;
	}

	public void setManifacture(String manifacture) {
		this.manifacture = manifacture;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void powerExcetpion(int kwH) {
		getMessage(kwH);
	}

	void getMessage(int kwH) {
		System.out.println(kwH + " kwH");
	}

}
