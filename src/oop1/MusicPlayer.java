package oop1;

public class MusicPlayer {
    /**
     * 클래스 안에 데이터와 기능을 하나로 묶어서
     * 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화
     *
     * 변경 사항이 생기면 이 클래스만 변경하면 된다. 외부는 변경할 것이 하나도 없다.
     */
    int volume = 0;
    boolean isOn = false;

    //음악 플레이어 켜기
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    //음악 플레이어 끄기
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    //볼륨 증가
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    //볼륨 감소
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    //음악 플레이어 상태
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
