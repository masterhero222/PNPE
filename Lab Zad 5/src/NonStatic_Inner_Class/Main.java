package NonStatic_Inner_Class;

public class Main {
	public int numberOfDoors;
	public String brand;
	public String model;

	public Main(int numberOfDoors, String brand, String model) {
		this.numberOfDoors = numberOfDoors;
		this.brand = brand;
		this.model = model;
	}

	public class MobileEngine {
		private float power;
		private String brand;

		public MobileEngine(float power, String brand) {
			this.power = power;
			this.brand = brand;
		}

		public float getPower() {
			return power;
		}

		public void setPower(float power) {
			this.power = power;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
	}

	public static void main(String[] args) {
		Main mob = new Main(5, "Audi", "A1");
		Main.MobileEngine engine = mob.new MobileEngine(2500, "Audi");
	}
}
