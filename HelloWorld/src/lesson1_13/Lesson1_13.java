package lesson1_13;

public class Lesson1_13 {
	public static void main(String[] args) {
		/* practice1
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5*/
		int[] a = {1, 2, 3, 4, 5};

		for (int i = 0; i < a.length; i++) {
		    System.out.println(a[i]);
		}
	}			  
		
	
}

