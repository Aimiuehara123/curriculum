package lesson1_17_18;
public class Lesson1_17_18{
	public static void main(String[] args) {
		
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
        helloJava();
        
       //+1するメソッドの呼び出し        
       int add = addOne(999); 
       System.out.println(add);
       
       //Q3呼び出し       
        int add2 = multiply(4, 2);
        System.out.println(add2);
        
       //Q4呼び出し
        double add3 = multiply(0.3,0.3);
        System.out.println(add3);
       //Q5呼び出し       
        int[] nums = generateRandomNumbers(3);
        for (int i : nums) {
            System.out.println(i);
        }
       //Q6呼び出し
        double ave = getAverage(nums);
        System.out.println(ave);
     }
	
    public static void helloJava() {
    System.out.println("Hello Java");
    }
		   
		// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		public static int addOne(int num) {
		
	        return num + 1;
	    }
	
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }
	    
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	    public static double multiply (double num1, double num2) {
	            return num1 * num2;
	    }
	 
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	    public static int[] generateRandomNumbers(int n) {
	        int[] result = new int[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = (int) (Math.random() * 100) + 1;
	        }
	        return result;
	    }

	       
		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	    public static double getAverage(int[] n) {
	        int sum = 0;
	        for (int i = 0; i < n.length; i++) {
	            sum += n[i];
	        }
	        return (double) sum / n.length;
	    }
		}


