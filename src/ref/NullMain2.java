package ref;

public class NullMain2 {
	public static void main(String[] args) {
		Data data = null;
		data.value = 10;	//NullPointerException 발생 null.value가 되기 때문에 예외 발생
		System.out.println("data = " + data.value);
	}
}
