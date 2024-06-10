package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        /**
         * Ctrl + P 파라미터 정보 확인
         *
         * 생성자 호출 안할 시 컴파일 오류가 나서 알 수 있다.
         */
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}

