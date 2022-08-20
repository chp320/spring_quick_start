package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

/**
 * 정의 : 포인트컷으로 지정된 메서드 호출 시, 메서드가 실행되기 전에 처리될 내용들을 기술하기 위해 사용
 */
public class BeforeAdvice {
    // (22.08.20) JoinPoint 객체 사용 -> JoinPoint 어드바이스 메서드 매개변수 선언
//    public void beforeLog() {
    public void beforeLog(JoinPoint jp) {
        String method = jp.getSignature().getName();
        Object[] args = jp.getArgs();

//        System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
        System.out.println("[사전 처리] " + method + "() 메서드 ARGS 정보 : " + args[0].toString());
    }
}
