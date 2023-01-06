package chapter9;

public class Wizard {
	String name;
	int hp;
	int mp;

	public void heal(Hero h) {
		System.out.println(this.name + "は、回復魔法を唱えた！");
		h.hp += 10;
		this.mp -= 3;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
