package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		/**
		 * 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
		 */
		Student student1;
		student1 = new Student();	//Student 클래스를 메모리에 등록하고 참조값을 student1 변수에 반환
		student1.name = "학생1";
		student1.age = 19;
		student1.grade = 90;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 점수:" + student1.grade);
		System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 점수:" + student2.grade);

		System.out.println(student1);	//객체 참조값 출력
		System.out.println(student2);
	}
}
