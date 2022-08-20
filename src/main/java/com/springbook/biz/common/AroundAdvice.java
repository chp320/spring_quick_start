package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * Around 어드바이스
 * - 비즈니스 메서드 실행 전(before), 실행 후(after*)에 수행되는 어드바이스 외에 실행 전/후 모두 동작이 필요한 경우에 사용
 */
public class AroundAdvice {
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        // (22.08.20) JoinPoint/바인드변수 테스트
        /*
        System.out.println("[BEFORE]: 비즈니스 메서드 수행 전에 처리할 내용...");
        Object returnObj = pjp.proceed();   // proceed() 메서드를 통해서 비즈니스 메서드 호출 가능!
        System.out.println("[AFTER]: 비즈니스 메서드 수행 후에 처리할 내용...");

        return returnObj;
        */

        String method = pjp.getSignature().getName();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object obj = pjp.proceed();

        stopWatch.stop();
        System.out.println(method + "() 메서드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");

        return obj;
    }
}
