package ref;

public class NullMain1 {
	public static void main(String[] args) {
		Data data = null;	//data 변수에 null 할당
		System.out.println("1. data = " + data);

		data = new Data();	//Data 객체를 생성해서 그 참조값을 data 변수에 할당
		System.out.println("2. data = " + data);

		/**
		 * data에 null을 넣고 앞서 생성한 Data 인스턴스는 아무도 참조하지 않는다.
		 * 그러면 Data 인스턴스는 사용되지 않고 메모리 용량만 차지할 뿐이다.
		 * C와 같은 과거 프로그래밍 언어는 개발자가 직접 메모리에서 제거해야 했다.
		 *
		 * 하지만 Java는 GC이 더 이상 사용하지 않는 인스턴스라 판단해
		 * 해당 인스턴스를 자동으로 메모리에서 제거한다.
		 */
		data = null;
		System.out.println("3. data = " + data);
	}
}
