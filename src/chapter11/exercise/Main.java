package chapter11.exercise;

public class Main {
	public static void main(String[] args) {
		Computer c = new Computer("Windows", 80000, "white", "Japan");
		System.out.println("このパソコンは" + c.name + "で" + c.price + "円でした。");
		c.setWeight(5.0);
		System.out.println(c.weight + "kgあります。");
	}
}
