package ref;

public class MethodChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		System.out.println("메서드 호출 전: dataA.value = " + dataA.value);	//10
		System.out.println("dataA = " + dataA);
		changeReference(dataA);
		System.out.println("메서드 호출 후: dataA.value = " + dataA.value);	//20
	}

	private static void changeReference(Data dataX) {
		/**
		 * dataX에 dataA의 주소값이 복사해 들어간다.
		 * dataX의 value를 바꾸면 인스턴스에 접근해 20으로 바뀐다.
		 * 그리고 메서드가 종료되면
		 */
		System.out.println("dataX = " + dataX);
		dataX.value = 20;
	}
}
