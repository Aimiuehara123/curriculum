package lesson1_6;

import java.util.Random;

public class Lesson1_6 {
 public static void main(String[] args) {
//問１）
//	変数 x を宣言し、「3」を代入して下さい。
//	変数 x に自己代入を使って「20」を掛け算して下さい。
//	その後 x の値をコンソールに表示して下さい。
  int num1 = 3;
  int num2 = 20;
  int num3 = num1*num2;
 System.out.println(num3);
//	問２）
//	以下のプログラムを作成してください。
//	①int 型の変数 i に 100 を代入する。
//	②インクリメント演算子を適用して数値を 1 増やす。
//	③コンソールに変数 i の値を表示する。
//	④デクリメント演算子を適用して数値を 1 減らす。
//	⑤コンソールに変数 i の値を表示する。
  int i = 100;
  i++;
  System.out.println(i);
  i--;
  System.out.println(i);
//	問３）
//	下記の例のような文章をコンソールに出力して下さい。
//	但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
//	※数字は0～100までの間で表示されるようにしてください。
//	例）
//	あなたの年齢を予想します。
//	あなたの年齢はおそらく〇〇歳ですね？
  System.out.println("あなたの年齢を予想します。");
  Random rnd = new Random();
  for(int x = 0; x < 10; x++) {
      int value = rnd.nextInt(101) + 1;
  System.out.println( "あなたの年齢はおそらく" + value + " 歳ですね？");
  		}
	}
}