package lesson2;

public class Lesson2 {
//	問１）
//	コンソールに以下のような自己紹介を自分の情報で出力してください。
//	※但し、「名前、性別、年齢、身長」は変数に代入して、出力するようにしてください。
//	※性別は「男」か「女」の一文字、身長は小数点第一位までのかたちで表示されるようにして下さい。
//	
//	例）
//	私の自己紹介をします。
//	名前は山田太郎です。
//	性別は男です。
//	年齢は19歳です。
//	身長は174.2㎝です。
//	よろしくお願いします。
	public static void main(String[] args) {
	String name = "上原愛未";
	String gender = "女";
	short age = 24;
	double height = 158.5;
	System.out.print("私の自己紹介をします。");
	System.out.print("名前は" + name + "です。");
	System.out.print("性別は" + gender + "です。");
	System.out.print("身長は" + height + "です。" );
	System.out.print("よろしくお願いします。" );
	}
}
