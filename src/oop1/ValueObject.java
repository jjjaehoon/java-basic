package oop1;

public class ValueObject {

    /**
     * 데이터
     *
     * 클래스는 속성(데이터, 멤버변수)과 기능(메서드)를 정의 가능
     * 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
     *  - 객체 메서드 내부에서 접근하는 멤버 변수는 자신의 멤버 변수다.
     */
    int value;

    /**
     * 기능
     *
     * 메서드는 객체를 생성해야 호출할 수 있다.
     * static이 붙으면 객체를 생성하지 않아도 호출할 수 있다.
     */
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
