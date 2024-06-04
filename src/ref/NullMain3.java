package ref;

public class NullMain3 {
	public static void main(String[] args) {
		BigData bigData = new BigData();	//bigData 인스턴스가 만들어지면서 멤버변수 초기화
		System.out.println("bigData.count = " + bigData.count);	//int라 초기값 0으로
		System.out.println("bigData.data = " + bigData.data);	//참조변수라 초기값 null로 들어감

		//NullPointerException
		System.out.println("bigData.data.value = " + bigData.data.value);
	}
}
