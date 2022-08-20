package com.springbook.biz.common;

/**
 * After Throwing 어드바이스
 * - 포인트컷으로 지정한 메서드가 실행되다가 예외가 발생하는 시점에 동작 -> 예외 처리 어드바이스 설정 시 사용
 * -> after throwing 어드바이스는 <aop:after-throwing> 엘리먼트를 이용하여 설정
 */
public class AfterThrowingAdvice {
    public void exceptionLog() {
        System.out.println("[예외 처리] 비즈니스 로직 수행 중 예외 발생");
    }
}
