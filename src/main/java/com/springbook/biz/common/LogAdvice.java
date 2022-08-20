package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

/**
 * 모든 비즈니스 메서드가 실행되기 직전에 공통으로 처리할 로직
 */
public class LogAdvice {
    // (22.08.20) JoinPoint 객체 사용 -> JoinPoint 어드바이스 메서드 매개변수 선언
    // JoinPoint를 사용하는 이유 : 호출된 메서드 시그니처 (리턴타입, 이름, 매개변수) 정보를 얻을 수 있어 세부적인 로직 처리 가능하다.
//    public void printLog() {
    public void printLog(JoinPoint jp) {
        System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
    }
}
