package lesson1_10;

public class Lesson1_10 {
	public static void main(String[] args) {
		
//問題.1 for文を使用し、以下のプログラムを作成してください。
//①変数iに1を代入
     int i = 1;   // 変数iに1を代入
		  
 
//②変数iに2ずつ足す処理を10回繰り返す。
//				出力結果：  3
//							5
//							7
//							9
//							・
//							・
//							・
//							21
     for (int j = 1; j <= 10; j++) {   // 10回繰り返す
		      i += 2;   // 2ずつ加算する
		      System.out.print(i + "、");  // 結果を出力							
     }
	  
	/*	
	問題.2 for文を使用して九九の計算を出力してください。
		※出力例 	1×1=1 1×2=2…1×9=9
					2×1=2 2×2=4…2×9=18
							・
							・
							・
					9×1=9 9×2=18…9×9=81
					*/
     for(int x=1; x<=9; x++){
         for(int y=1; y<=9; y++){
             System.out.print(x + "×" + y + "=" + x*y + " ");
         }
         System.out.println();
     }
 }
}

