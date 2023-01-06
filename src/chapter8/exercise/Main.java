package chapter8.exercise;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "タケシ";
		c.selfAid();
		c.selfAid();
		c.pray(5);
		c.pray(8);
	}
}
