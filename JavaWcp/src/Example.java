import inner_class_sample.Outer;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer(); // クラスOuterをインスタンス化
		Outer.Inner inner = new Outer.Inner(); // クラスOuterの内部クラスInnerをインスタンス化
	} 

}
