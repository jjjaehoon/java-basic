package class1;

public class ClassStart4 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "학생1";
		student1.age = 19;
		student1.grade = 90;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		/**
		 *  대입(=) 시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.
		 */
		Student[] students = new Student[2];
		students[0] = student1;
		students[1] = student2;

		System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 점수:" + students[0].grade);
		System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 점수:" + students[1].grade);

		System.out.println(student1);	//객체 참조값 출력
		System.out.println(student2);
	}
}
