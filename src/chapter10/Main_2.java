package chapter10;

public class Main_2 {
	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		pm.attack(h);
		System.out.println(h.name + "の体力：" +h.hp);
	}
}
