package com.springbook.biz.common;

/**
 * After 어드바이스
 * - try-catch-finally 구문에서 finally 블록과 같이 예외 발생 여부에 상관없이 무조건 수행되는 어드바이스 등록 시 사용
 * - after 어드바이스는 <aop:after> 엘리먼트를 이용하여 설정. 설정 파일에서 예외 처리 설정 밑에 after 애스팩트를 추가
 */
public class AfterAdvice {
    public void finallyLog() {
        System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
    }
}
