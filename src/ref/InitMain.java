package ref;

public class InitMain {
	public static void main(String[] args) {
		InitData data = new InitData();

		//value1은 초기화를 하지 않았지만 멤버변수는 자동으로 초기화 되기 때문에 0으로 출력됨
		System.out.println("valud1 = " + data.value1);
		System.out.println("valud2 = " + data.value2);
	}
}
