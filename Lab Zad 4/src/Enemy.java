
public class Enemy implements Monster {

	
	private float dmg = 0;

	public Enemy(float dmg) {
		super();
		this.dmg = dmg;
	}

	public float getDmg() {
		return dmg;
	}

	public void setDmg(float dmg) {
		this.dmg = dmg;
	}

	public float attack(float dmg) {
		setDmg(dmg);
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
}
