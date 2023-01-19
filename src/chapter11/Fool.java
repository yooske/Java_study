package chapter11;

public class Fool extends Character implements Human {
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	public void talk() {
		System.out.println(this.name + "は話をした");
	}
	public void watch() {
		System.out.println(this.name + "は敵を見つめた");
	}
	public void hear() {
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
