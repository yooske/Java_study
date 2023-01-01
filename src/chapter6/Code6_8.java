package chapter6;
import chapter6.logic.Code6_6;

public class Code6_8 extends Code6_1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Code6_6.tasu(a, b);
		int delta = chapter6.logic.Code6_6.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
