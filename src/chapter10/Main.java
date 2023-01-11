package chapter10;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		sh.fly();
		sh.run();
		sh.slip();
		sh.attack(m);
		Weapon w = new Weapon();
		System.out.println("武器の名前は" + w.name + "です");
		System.out.println("価格：" + w.price);
	}
}
