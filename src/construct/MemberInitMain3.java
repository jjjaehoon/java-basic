package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {
        /**
         * 객체를 생성하면 name, age 같은 변수의 초기값을 설정해야한다.
         * 이 코드는 초기값을 설정하는 부분이 반복된다.
         */
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
