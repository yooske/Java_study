package chapter11;

public class Main {
	public static void main(String[] args) {
		Dancer d = new Dancer();
		d.name = "アサカ";
		Matango m = new Matango();
		d.attack(m);
		d.dance();
	}
}
