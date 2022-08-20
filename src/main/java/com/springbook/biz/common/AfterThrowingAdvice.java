package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

/**
 * After Throwing 어드바이스
 * - 포인트컷으로 지정한 메서드가 실행되다가 예외가 발생하는 시점에 동작 -> 예외 처리 어드바이스 설정 시 사용
 * -> after throwing 어드바이스는 <aop:after-throwing> 엘리먼트를 이용하여 설정
 */
public class AfterThrowingAdvice {
    // (22.08.20) JoinPoint 객체 사용 -> JoinPoint 어드바이스 메서드 매개변수 선언
//    public void exceptionLog() {
//        System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
//    }
    // (22.08.20) JoinPoint 테스트 위해 JoinPoint 및 바인딩 변수 추가
    public void exceptionLog(JoinPoint jp, Exception exceptionObj) {
        String method = jp.getSignature().getName();

        System.out.println("[예외 처리] " + method + "() 메서드 수행 중 발생된 예외 메시지 : " + exceptionObj.getMessage());
    }
}
