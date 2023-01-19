package chapter11;

public class Main_2 {
	public static void main(String[] args) {
		Fool f = new Fool();
		f.name = "ミナト";
		Matango m = new Matango();
		f.attack(m);
		f.run();
		f.watch();
	}
}
