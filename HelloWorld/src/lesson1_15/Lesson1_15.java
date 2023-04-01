/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/package lesson1_15;

public class Lesson1_15 {
public static void main(String[] args) {
//	①配列int test[][]に以下の成績を格納し、表示してください。
	  int score[][] = {
              {64, 73, 69},
              {58, 81, 75},
              {86, 68, 79},
              {72, 55, 80}
      };
      for(int i = 0; i < score.length; i++) {
          System.out.println("生徒" + (i+1) + "：" + "国語" + score[i][0] + "点、" + "数学" + score[i][1] + "点、" + "英語" + score[i][2] + "点");
      }
      // 平均点の計算
      double avg1 = 0.0, avg2 = 0.0, avg3 = 0.0;
      for (int i = 0; i < score.length; i++) {
          avg1 += score[i][0];
          avg2 += score[i][1];
          avg3 += score[i][2];
      }
      avg1 /= score.length;
      avg2 /= score.length;
      avg3 /= score.length;
   // 平均点の表示
      System.out.println("国語の平均点は" + avg1 + "点です。");
      System.out.println("数学の平均点は" + avg2 + "点です。");
      System.out.println("英語の平均点は" + avg3 + "点です。");
	}

}
