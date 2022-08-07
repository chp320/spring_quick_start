package polymorphism;

public class SamsungTV implements TV {
    // SonySpeaker 클래스를 사용하기 위한 객체 참조 변수 선언
    private SonySpeaker speaker;

    // 초기화 작업 처리를 위한 init-method
    public void initMethod() {
        System.out.println("객체 초기화 작업 처리..");
    }

    // 객체 삭제하기 직전에 호출될 임의의 메소드
    public void destroyMethod() {
        System.out.println("객체 삭제 전에 처리할 로직 처리...");
    }

    // 기본 생성자
    public SamsungTV() {
        System.out.println("===> SamsungTV(1) 객체 생성");
    }

    // '생성자 인젝션' 테스트를 위해 '매개변수 가지는 생성자' 생성
    // SonySpeaker 객체를 매개변수로 받아서 멤버 변수로 선언된 참조변수 speaker를 초기화 한다.
    public SamsungTV(SonySpeaker speaker) {
        System.out.println("===> SamsungTV(2) 객체 생성");
        this.speaker = speaker;
    }

    public void powerOn() {
        System.out.println("SamsungTV---전원 켠다.");
    }

    public void powerOff() {
        System.out.println("SamsungTV---전원 끈다.");
    }

    public void volumeUp() {
//        System.out.println("SamsungTV---소리 올린다.");
//        speaker = new SonySpeaker();
        speaker.volumeUp();
    }

    public void volumeDown() {
//        System.out.println("SamsungTV---소리 내린다.");
//        speaker = new SonySpeaker();
        speaker.volumeDown();
    }
}
