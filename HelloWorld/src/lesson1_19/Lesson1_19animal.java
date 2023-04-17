package lesson1_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

public class Lesson1_19animal {
	public static void main(String[] args) {
		// Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Lesson1_19dog dog = new Lesson1_19dog();
		System.out.println(dog.name);
		
		// Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
		Lesson1_19dog dog1 = new Lesson1_19dog(10);
		System.out.println(dog1.animalCount);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		// 現在時刻を取得
		LocalDateTime now = LocalDateTime.now();

		// フォーマッターを作成
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

		// フォーマッターで整形してコンソールに出力
		System.out.println(now.format(formatter));
	}
}
