package lesson1_19;
// Q1：フィールドに動物の名前の変数を定義してください。

// Q2：フィールドに動物の数の変数を定義してください。

// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

public class Lesson1_19dog {

	String name; // Q1フィールドに動物の名前の変数を定義
	int animalCount;   // Q2フィールドに動物の数の変数を定義
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成
	public Lesson1_19dog() { 		
		this.name = "犬";
	}
	
	// Q4 Q2で作成した変数に引数を代入するコンストラクタを作成
	public Lesson1_19dog( int animalCount) { 		
		this.animalCount = animalCount;
	}
}