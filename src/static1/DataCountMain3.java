package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count= " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count= " + Data3.count);

        /**
         * 추가
         * 인스턴스를 통한 접근
         *
         * 인스턴스가 저장된 힙영역을 갔다가 count가 있는 메서드 영역으로 다시 보낸다         *
         * 인스턴스를 통한 접근은 추천하지 않는다 왜냐면
         * 코드를 봤을 때 data4 인스턴스 변수인 것처럼 오해할 수가 있기 때문이다.
         */
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        /**
         * 클래스를 통한 접근
         * 코드를 봤을 때 Data3 클래스의 변수인 것을 알 수 있기 때문에
         * 더 명확하다.
         */
        System.out.println(Data3.count);
    }
}
