package chapter4;

public class Code4_14 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int value : scores) {
			System.out.println(value);
			sum += value;
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
