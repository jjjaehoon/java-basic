package ref;

public class NullMain4 {
	public static void main(String[] args) {
		BigData bigData = new BigData();
		bigData.data = new Data();
		System.out.println("bigData.count = " + bigData.count);	//초기값 0 출력
		System.out.println("bigData.data = " + bigData.data);	//Data 인스턴스를 만들었기 때문에 참조값 출력

		//Data 인스턴스를 만들어 초기화가 되었기 때문에 0 출력
		System.out.println("bigData.data.value = " + bigData.data.value);
	}
}
