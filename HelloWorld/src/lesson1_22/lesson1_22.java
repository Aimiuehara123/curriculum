package lesson1_22;

import lesson1_22_a.lesson1_22_a;

public class lesson1_22 {
	public static void main(String[] args) {
		lesson1_22_a consoleOutput = new lesson1_22_a();
		// ConsoleOutput`クラスのインスタンスを生成しメソッドの呼び出し
		consoleOutput.greet();  // こんにちは！ここは日本です！
		consoleOutput.tellTaste();  // この寿司はうまい
		consoleOutput.tellFoodType();  // 寿司は和食です
		consoleOutput.tellCurrentTime();  // 今の現在日時はxxxx/xx/xx xx:xx:xxです
	}
}