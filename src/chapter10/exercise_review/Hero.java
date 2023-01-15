package chapter10.exercise_review;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("10ポイントのダメージをあたえた！");
	}
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
