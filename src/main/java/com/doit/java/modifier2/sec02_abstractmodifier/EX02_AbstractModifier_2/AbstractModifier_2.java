package com.doit.java.modifier2.sec02_abstractmodifier.EX02_AbstractModifier_2;

/**
 * 추상 클래스를 상속해 오버라이딩 수행
 */

// 추상 메서드를 1개 이상 포함하고 있기 때문에 추상 클래스로 정의
abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier_2 {
    public static void main(String[] args) {
        // 객체 생성
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        // 메서드 호출
        animal1.cry();
        animal2.cry();
    }
}
