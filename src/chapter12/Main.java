package chapter12;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		c.attack(m);
	}
}
