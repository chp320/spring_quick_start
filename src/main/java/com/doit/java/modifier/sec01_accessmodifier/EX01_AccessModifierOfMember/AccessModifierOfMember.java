package com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember;

import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;
import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.B;
import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.C;
import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {
    public static void main(String[] args) {
        // 클래스의 객체 생성
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
