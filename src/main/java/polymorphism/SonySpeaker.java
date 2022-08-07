package polymorphism;

/* 의존관계 테스트를 위한 클래스. SamsungTV 클래스가 SonySpeaker 클래스를 사용한다. */
public class SonySpeaker {
    public SonySpeaker() {
        System.out.println("===> SonySpeaker 객체 생성");
    }

    public void volumeUp() {
        System.out.println("SonySpeaker---소리 울린다.");
    }

    public void volumeDown() {
        System.out.println("SonySpeaker---소리 내린다.");
    }
}
