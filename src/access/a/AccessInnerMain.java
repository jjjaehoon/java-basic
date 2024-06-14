package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가능
        //data.privateFiled = 3;  //컴파일 오류 발생
        //data.privateMethod();

        /**
         * innerAccess는 public이라 외부에서 호출이 가능하다.
         * 또한 innderAccess는 AccessData 클래스 내부에 포함되어 있기 때문에
         * private 필드에 접근이 가능하다.
         */
        data.innerAccess();
    }
}
