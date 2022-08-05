package polymorphism;

import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * SamsungTV와 LgTV를 번갈아 사용하는 사용자
 */
public class TVUser {
    public static void main(String[] args) {
        /* 결합도 낮추기 - 다형성 사용 */
//        TV tv = new SamsungTV();
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();

        /* 결합도 낮추기 - 디자인패턴 사용 */
//        BeanFactory factory = new BeanFactory();
//        TV tv = (TV) factory.getBean(args[0]);
//        tv.powerOn();
//        tv.volumeUp();
//        tv.volumeDown();
//        tv.powerOff();

        /* CLASS03. 스프링 컨테이너 구동 및 테스트 */
        // 1. Spring 컨테이너를 구동한다.
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        // 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
        TV tv = (TV) factory.getBean("tv");
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

        // 3. Spring 컨테이너를 종료한다.
        factory.close();
    }
}
