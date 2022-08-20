package com.springbook.biz.common;

/**
 * 정의 : 포인트컷으로 지정된 메서드 호출 시, 메서드가 실행되기 전에 처리될 내용들을 기술하기 위해 사용
 */
public class BeforeAdvice {
    public void beforeLog() {
        System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
    }
}
