package com.doit.java.modifier2.sec01_finalmodifier.EX02_FinalModifier_2;

class A {
    void abc() {}
    final void bcd() {}
}

class B extends A {
    void abc() {}
    // java: bcd() in com.doit.java.modifier2.sec01_finalmodifier.EX02_FinalModifier_2.B cannot override bcd() in com.doit.java.modifier2.sec01_finalmodifier.EX02_FinalModifier_2.A overridden method is final
//    void bcd() {}   // final 메서드는 오버라이딩 불가능!
}

final class C {}

// java: cannot inherit from final com.doit.java.modifier2.sec01_finalmodifier.EX02_FinalModifier_2.C
//class D extends C {}    // final 클래스는 상속 자체가 불가능!

public class FinalModifier_2 {
    public static void main(String[] args) {

    }
}
