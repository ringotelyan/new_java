
// 課題1-1）1から100までの整数をすべて足す計算プログラムを作成
public class kadai11 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1から100までの整数をすべて足した和は" + sum);
	}

}
