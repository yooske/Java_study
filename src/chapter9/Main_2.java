package chapter9;

public class Main_2 {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 80;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.mp = 10;
		w.heal(h1);
		w.heal(h2);
		System.out.println("ミナトのHPは" + h1.hp + "、アサカのHPは" + h2.hp);
		System.out.println("スガワラのMPは" + w.mp);
	}
}
