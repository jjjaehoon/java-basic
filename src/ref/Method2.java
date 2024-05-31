package ref;

public class Method2 {
	public static void main(String[] args) {
		Student student1 = createStudent("학생1", 15, 90);
		System.out.println(student1);	//참조값 확인
		Student student2 = createStudent("학생2", 16, 80);
		System.out.println(student2);

		printStudent(student1);
		printStudent(student2);
	}

	//studen 객체 생성 메서드
	static Student createStudent(String name, int age, int grade) {
		Student student = new Student();
		student.name = name;
		student.age = age;
		student.grade = grade;

		System.out.println(student);	//참조값 확인

		return student;	//만들어진 객체를 밖에서 사용할 수 있게 반환
	}

	//전달한 학생 객체의 멤버 변수 값을 출력
	static void printStudent(Student student) {
		System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
	}
}
