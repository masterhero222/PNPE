
import java.util.Random;

public class MonsterFactory {

	Random rand = new Random();
	int result;
	int heroHealth = 50;

	public Enemy[] makeEnemy() {
		Enemy[] enemy = new Enemy[5];

		for (int i = 0; i <= 4; i++) {

			int randomMonster = rand.nextInt(1, 5);

			if (randomMonster == 1) {
				System.out.println("Zombie made");
				enemy[i] = new Zombie(5);
			} else if (randomMonster == 2) {
				System.out.println("Vampire made");
				enemy[i] = new Vampire(10);
			} else if (randomMonster == 3) {
				System.out.println("Dragon made");
				enemy[i] = new Dragon(20);
			} else if (randomMonster == 4) {
				System.out.println("Math Teacher made");
				enemy[i] = new Math_Teacher(35);
			}

		}

		for (int i = 0; i < enemy.length; i++) {

			result = (int) (enemy[0].getDmg() + enemy[1].getDmg() + enemy[2].getDmg() + enemy[3].getDmg()
					+ enemy[4].getDmg());
		}

		if (heroHealth <= result) {
			System.out.println("Hero Lose!");
		} else {
			System.out.println("Hero Win!");
		}

		System.out.println(result);

		return enemy;
	}
}
