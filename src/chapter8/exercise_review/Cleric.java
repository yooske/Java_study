package chapter8.exercise_review;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	public void selfAid() {
		System.out.println(this.name + "は、リンクエイドを唱えた！");
		this.hp = MAXHP;
		this.mp -= 5;
		System.out.println("体力が全快した");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は天に" + sec +"秒間祈った！");
		int mpAid = sec + new java.util.Random().nextInt(3);
		int mpAidActual = Math.min(this.MAXMP - this.mp, mpAid);
		this.mp += mpAidActual;
		System.out.println("mpが" + mpAidActual + "ポイント回復した");
		return mpAidActual;

	}
}
