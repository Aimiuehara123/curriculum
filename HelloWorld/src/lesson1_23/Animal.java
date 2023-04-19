package lesson1_23;
// サブクラス（処理用） 
public class Animal {
	private String name = "ライオン";	// 動物の名前を表すフィールド
	private double length = 2.1;	// 動物の体長を表すフィールド
	private int speed = 80;	// 動物の速度を表すフィールド

	public Animal() {}
	// それぞれの引数コンストラクター
	public Animal(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
	// 動物の名前を設定するメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	// 動物の体長を設定するメソッド
	public void setLength(double length) {
		this.length = length;
	}
	
	// 動物の速度を設定するメソッド
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 動物の名前を取得
	public String getName() {
		return name;
	}
	
	// 動物の体長を取得
	public double getLength() {
		return length;
	}
	
	// 動物の速度を取得
	public int getSpeed() {
		return speed;
	} 
}
