package chapter3;

public class Exercise3_1 {
	public static void main(String[] args) {
		String name = "湊";
		int weight = 60;
		int age1 = 27;
		int age2 = 29;
		if (weight == 60) {
			System.out.println("体重は60キロです。");
		}
		if ((age1 + age2) * 2 > 60) {
			System.out.println("age1 + age2 ×2は、60以上です。");
		}
		if (age1 % 2 != 0) {
			System.out.println("age1は奇数です。");
		}
		if (name.equals("湊")) {
			System.out.println("名前は湊です。");
		}
	}
}
