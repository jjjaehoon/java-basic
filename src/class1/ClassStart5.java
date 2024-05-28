package class1;

public class ClassStart5 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "학생1";
		student1.age = 19;
		student1.grade = 90;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		Student[] students = {student1, student2};

		for (int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 점수:" + students[i].grade);
		}

		/**
		 * for문 최적화
		 */
		for (Student s : students) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 점수:" + s.grade);
		}

		/**
		 * iter 입력 시 아래 양식 자동 완성
		 */
		// for (Student student : students) {
		//
		// }
	}
}
