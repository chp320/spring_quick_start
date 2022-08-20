package com.springbook.biz.common;

import com.springbook.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;

/**
 * After Returning : 포인트컷으로 지정된 메서드가 정상적으로 실행되고 나서, 메서드 수행 결과로 생성된 데이터를 리턴하는 시점에 동작한다.
 * -> 비즈니스 메서드 수행 결과로 얻은 결과 데이터를 이용하여 사후 처리 로직을 추가할 때 사용
 * -> after returning 어드바이스 지정을 위해서는 <aop:after-returning> 엘리먼트 사용!
 */
public class AfterReturningAdvice {
    // (22.08.20) JoinPoint 객체 사용 -> JoinPoint 어드바이스 메서드 매개변수 선언
//    public void afterLog() {
//        System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
//    }

    // (22.08.20) 첫 번째 매개변수: 클라이언트가 호출한 비즈니스 메서드 정보 취득 목적. JoinPoint 객체 지정
    // (22.08.20) 두 번째 매개번수: 비즈니스 메서드가 리턴한 결괏값을 바인딩할 목적으로 사용. '바인드 변수'라 지칭. 어떤 값이 리턴될지 모르기 때문에 Object 타입으로 선언.
    public void afterLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();
        // returnObj 객체가 UserVO 클래스 타입인 경우!
        if (returnObj instanceof UserVO) {
            UserVO user = (UserVO) returnObj;
            if (user.getRole().equals("Admin")) {
                System.out.println(user.getName() + " 로그인(Admin)");
            }
        }

        System.out.println("[사후 처리] " + method + "() 메서드 리턴값 : " + returnObj.toString());
    }
}
