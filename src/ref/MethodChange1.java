package ref;

public class MethodChange1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("메서드 호출 전: a = " + a);	//10
		changePrimitive(a);
		System.out.println("메서드 호출 후: a = " + a);	//10
	}

	private static void changePrimitive(int x) {
		/**
		 * x가 a 값을 복사해 대입하여 x는 10에서 20으로 바뀌지만
		 * a의 값은 그대로 10이다.
		 * 또한 메서드가 종료되면 x가 제거된다.
		 */
		x = 20;
	}
}
