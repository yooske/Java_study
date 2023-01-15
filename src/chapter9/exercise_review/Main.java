package chapter9.exercise_review;

public class Main {
	public static void main(String[] args) {
		Thief t1 = new Thief("アサカ", 50, 10);
		System.out.println(t1.name + "HP:" + t1.hp + "MP:" + t1.mp);
		Thief t2 = new Thief("アサカ", 50);
		System.out.println(t2.name + "HP:" + t2.hp + "MP:" + t2.mp);
		Thief t3 = new Thief("アサカ");
		System.out.println(t3.name + "HP:" + t3.hp + "MP:" + t3.mp);
	}
}
