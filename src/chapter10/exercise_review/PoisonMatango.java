package chapter10.exercise_review;

public class PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	int poison = 5;
	public void attack(Hero h) {
		super.attack(h);
		if (this.poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int poisonDamage = h.hp /= 5;
			h.hp -= poisonDamage;
			System.out.println(h.name + "は" + poisonDamage + "のダメージ！");
			this.poison -= 1;
		}

	}
}
