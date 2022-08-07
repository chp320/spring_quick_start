package polymorphism;

public class SamsungTV implements TV {
    // 멤버변수와 매개변수 타입을 Speaker 로 변경
    private Speaker speaker;
    private int price;

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
    // Speaker 객체를 매개변수로 받아서 멤버 변수로 선언된 참조변수 speaker를 초기화 한다.
    public SamsungTV(Speaker speaker) {
        System.out.println("===> SamsungTV(2) 객체 생성");
        this.speaker = speaker;
    }

    // 생성자 인젝션에서 초기화할 멤버변수가 여러 개인 경우 값을 한꺼번에 전달하기 위한 테스트
    public SamsungTV(Speaker speaker, int price) {
        System.out.println("===> SamsungTV(3) 객체 생성");
        this.speaker = speaker;
        this.price = price;
    }

    // setter injection 테스트 위함. setter 메서드는 스프링 컨테이너가 자동 호출하며, <bean> 객체 생성 직후 호출됨.
    // setter injection이 동작하려면 setter 메서드뿐만 아니라 기본 생성자도 반드시 필요함!
    public void setSpeaker(Speaker speaker) {
        System.out.println("===> setSpeaker() 호출");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("===> setPrice() 호출");
        this.price = price;
    }

    public void powerOn() {
//        System.out.println("SamsungTV---전원 켠다.");
        System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
    }

    public void powerOff() {
        System.out.println("SamsungTV---전원 끈다.");
    }

    public void volumeUp() {
//        System.out.println("SamsungTV---소리 올린다.");
//        speaker = new Speaker();
        speaker.volumeUp();
    }

    public void volumeDown() {
//        System.out.println("SamsungTV---소리 내린다.");
//        speaker = new Speaker();
        speaker.volumeDown();
    }
}
