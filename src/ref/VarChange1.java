package ref;

public class VarChange1 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println("a = " + a);	//10
		System.out.println("b = " + b);	//10

		//a 변경
		a = 20;
		System.out.println("변경 a = 20");
		System.out.println("a = " + a);	//20

		//a의 값 10을 복사해서 b에 넣었기 때문에 10이 나온다.
		System.out.println("b = " + b);	//10

		//b 변경
		b = 30;
		System.out.println("변경 b = 30");
		System.out.println("a = " + a);	//20
		System.out.println("b = " + b);	//30
	}
}
