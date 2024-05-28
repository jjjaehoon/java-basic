package class1;

public class ClassStart2 {
	//psvm 을 입력하면 아래 양식이 나옴
	public static void main(String[] args) {
		String[] studentNames = {"학생1", "학생2", "학생3"};
		int[] studentAges = {15, 16, 17};
		int[] studentGrades = {90, 88, 85};

		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 점수: " + studentGrades[i]);
		}
	}
}
