package chapter9;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は、" + this.sword.name + "で攻撃した！");
		System.out.println("敵に" + this.sword.damage + "のダメージをあたえた！");
	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this("ダミー");
	}
}
