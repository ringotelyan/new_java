
// 課題1-2）2から100までの偶数のみを全て足す計算プログラムを作成
public class kadai12 {
	public static void main(String[] args) {
		int number = 100;
		int sum = 0;
		
		for (int i = 2; i <= number; i++) {
			if (number[i] % 2 == 0) {
				sum = sum + i;
			}
		}
	}

}
