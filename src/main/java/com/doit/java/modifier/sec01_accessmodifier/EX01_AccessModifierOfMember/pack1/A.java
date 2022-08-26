package com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
    // public ~ private까지 4가지 서로 다른 접근 지정자 포함하는 필드 선언
    public int a = 1 ;
    protected int b = 2 ;
    int c = 3 ;
    private int d = 4 ;

    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d);
        System.out.println();
    }
}
