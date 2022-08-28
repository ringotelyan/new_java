
public enum Dessert {
	APPLE(100) {
		@Override
		void advertise() {
			// リンゴ用のadvertiseの実装
			System.out.println("まっかなりんごが" + getPrice() + "円!");
		}
	},
	ICE_CREAM(200) {
		@Override
		void advertise() {
			// アイスクリーム用のadvertiseの実装
			System.out.println("夏にぴったりのアイスクリームが" + getPrice() + "円!");
		}
	},
	CAKE(300) {
		@Override
		void advertise() {
			// ケーキ用のadvertiseの実装
			System.out.println("皆大好き甘いケーキが" + getPrice() + "円!");
		}
	},
	;
	private int price;
	private Dessert(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	// 宣伝文句を出力する中小メソッド。各インスタンスで実装する
	abstract void advertise();
	
}
