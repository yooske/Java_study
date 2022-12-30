package chapter6;

public class Code6_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Code6_1Logic.tasu(a, b);
		int delta = Code6_1Logic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
