package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        /**
         * static은 클래스 로딩 시 바로 메모리에 올라가지만
         * 인스턴스는 인스턴스가 생성되어야지 메모리에 올라가기 때문에 static에서는 접근할 수가 없다
         */
        //instanceValue++;    //인스턴스 변수 접근, 컴파일 에러
        //instanceMethod();   //인스턴스 메서드 접근, 컴파일 에러

        staticValue++;  //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;    //인스턴스 변수 접근
        instanceMethod();   //인스턴스 메서드 접근

        staticValue++;  //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }


}
