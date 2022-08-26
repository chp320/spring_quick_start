package com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {
    public void print() {
        // 멤버 활용
        System.out.print(a + " ");    // 자식 클래스는 다른 패키지에 있어도 객체의 생성없이 protected 접근 지정자 필드까지 접근 가능
        System.out.print(b + " ");
//        System.out.print(c + " ");    // default는 동일 패키지 내에서만 접근 가능함
//        System.out.print(d + " ");    // private는 동일 클래스 내에서만 접근 가능함
        System.out.println();
    }
}
