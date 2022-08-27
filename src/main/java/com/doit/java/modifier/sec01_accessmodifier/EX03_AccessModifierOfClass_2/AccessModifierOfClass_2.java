package com.doit.java.modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import com.doit.java.modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import com.doit.java.modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB;
import com.doit.java.modifier.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;

public class AccessModifierOfClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        AA a = new AA();    // 클래스 AA는 public 이므로 다른 패키지에서 객체 선언(AA a)과 생성자 호출(new AA()) 가능!
//        BB b = new BB();    // 클래스 BB는 default 이므로 다른 패키지에서 import 불가, 객체 선언/생성자 호출 불가!
//        CC c = new CC();    // 클래스 CC는 public 이므로 다른 패키지에서 import 가능, 그러나 default 생성자이므로 객체 선언(CC c) 가능, 생성자 호출(new CC()) 불가!
    }
}
