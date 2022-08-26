import inner_class_sample.Outer;
import inner_class_sample.Outer.Inner;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer(); // クラスOuterをインスタンス化
		Outer.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化
	} 

}
