package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User(); //inport 사용으로 패키지 명 생략 가능
        pack.b.User userB = new pack.b.User();  //클래스명이 동일하면 나머지는 모든 경로를 적어야 한다.

    }
}
