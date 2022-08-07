package polymorphism;

import org.springframework.stereotype.Component;

/* 의존관계 테스트를 위한 클래스. SamsungTV 클래스가 SonySpeaker 클래스를 사용한다. */
/* (22.08.07) 새로 생성한 Speaker 인터페이스를 구현하도록 implements 추가 */
@Component("sony")
public class SonySpeaker implements Speaker {
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
