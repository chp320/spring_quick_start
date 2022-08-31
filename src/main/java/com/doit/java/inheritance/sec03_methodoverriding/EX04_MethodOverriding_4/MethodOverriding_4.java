package com.doit.java.inheritance.sec03_methodoverriding.EX04_MethodOverriding_4;

class A {
    protected void abc() {}
}

class B1 extends A {
    public void abc() {}
}

class B2 extends A {
    protected void abc() {}
}

class B3 extends A {
//    void abc() {}   // default 접근 지정자 사용 불가 : 범위 좁아짐
}

class B4 extends A {
//    private abc() {}    // private 접근 지정자 사용 불가 : 범위 좁아짐
}

public class MethodOverriding_4 {
    public static void main(String[] args) {
    }
}
