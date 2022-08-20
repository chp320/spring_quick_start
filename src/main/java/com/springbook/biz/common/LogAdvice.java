package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 모든 비즈니스 메서드가 실행되기 직전에 공통으로 처리할 로직
 */
@Service    // AOP 관련 어노테이션 사용 -> 스프링 컨테이너가 자동 검색할 수 있도록 @Service 어노테이션 설정
@Aspect     // Aspect = Pointcut + Advice
public class LogAdvice {
    // (22.08.20) JoinPoint 객체 사용 -> JoinPoint 어드바이스 메서드 매개변수 선언
    // JoinPoint를 사용하는 이유 : 호출된 메서드 시그니처 (리턴타입, 이름, 매개변수) 정보를 얻을 수 있어 세부적인 로직 처리 가능하다.
//    public void printLog() {

    // (22.08.20) AOP 설정 방식 변경으로 인한 주석 처리 (XML -> 어노테이션)
//    public void printLog(JoinPoint jp) {
//        System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
//    }

    /*-------------------------------------------------------------------------------------------------*/
    // 포인트컷 설정
    @Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
    public void allPointcut() {
    }     // 참조 메서드 : 포인트컷 식별하기 위한 식별 용도

    @Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
    public void getPointcut() {
    }

    // 어드바이스 설정
    // 어드바이스 메서드 5가지 동작시점 어노테이션과 포인트컷 참조 메서드 지정 (@Before, @AfterReturning, @AfterThrowing, @After, @Around)
    @Before("allPointcut()")
    public void printLog() {
        System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
    }

    // 애스팩트 설정
    // 포인트컷과 어드바이스를 결합하는 설정 필요! -> @Aspect 어노테이션을 통해서 LogAdvice 클래스를 애스팩트 객체로 인식하게 함!
}
