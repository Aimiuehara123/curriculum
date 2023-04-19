package lesson1_22_a;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// 処理用パッケージ

public class lesson1_22_a {
	// それぞれメソッドの実装　
    private final String greeting = "こんにちは！ここは日本です！";
    private final String sushiTaste = "この寿司はうまい";
    private final String sushiFoodType = "寿司は和食です";
    
    // それぞれのメソッドをコンソールに出力
    public void greet() {
        System.out.println(greeting);
    }
    
    public void tellTaste() {
        System.out.println(sushiTaste);
    }
    
    public void tellFoodType() {
        System.out.println(sushiFoodType);
    }
    
    // 現在の日時を取得し、フォーマットしてコンソールに出力
    public void tellCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("今の現在日時は" + formattedDateTime + "です");
    }
}