package inner_class_sample;

public class Outer {
	// 外部クラスに定義したフィールドgreeting
	// staticなフィールドgreeting
	private static String greeting = "こんにちは";
	// staticな内部クラスInner
	public class static Inner {
		public String hello() {
			// 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
			// 外部クラスOuterのフィールドgreetingはstaticなので、参照可能
			return greeting;
		}
	}

}
