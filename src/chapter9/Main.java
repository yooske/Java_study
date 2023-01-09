package chapter9;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero("ミナト");
		h.sword = s;
		System.out.println(h.hp);
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();

	}
}
