package com.springbook.biz.common;

/**
 * After Returning : 포인트컷으로 지정된 메서드가 정상적으로 실행되고 나서, 메서드 수행 결과로 생성된 데이터를 리턴하는 시점에 동작한다.
 * -> 비즈니스 메서드 수행 결과로 얻은 결과 데이터를 이용하여 사후 처리 로직을 추가할 때 사용
 * -> after returning 어드바이스 지정을 위해서는 <aop:after-returning> 엘리먼트 사용!
 */
public class AfterReturningAdvice {
    public void afterLog() {
        System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
    }
}
