//string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j
package lesson1_14;

public class Lesson1_14 {


public static void main(String[] args) {
	   String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

       // a～dを表示
       for (int i = 0; i < alphabets.length; i++) {
           if (alphabets[i].equals("e")) {
               break;
           }
           System.out.println(alphabets[i]);
       }

       // i以外を表示
       for (int i = 0; i < alphabets.length; i++) {
           if (alphabets[i].equals("i")) {
               continue;
           }
           System.out.println(alphabets[i]);
       }
   }

	}





