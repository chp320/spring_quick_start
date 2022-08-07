package polymorphism;

import org.springframework.stereotype.Component;

/**
 * Speaker 인터페이스를 구현한 구체 클래스
 */
//@Component("apple")
public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("===> AppleSpeaker 객체 생성");
    }

    @Override
    public void volumeUp() {
        System.out.println("AppleSpeaker---소리 울린다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("AppleSpeaker---소리 내린다.");
    }
}
