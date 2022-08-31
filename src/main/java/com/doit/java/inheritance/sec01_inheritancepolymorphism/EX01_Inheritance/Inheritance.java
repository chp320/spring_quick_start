package com.doit.java.inheritance.sec01_inheritancepolymorphism.EX01_Inheritance;

/* 클래스의 상속과 사용할 수 있는 멤버 */

class Human {
    // 필드
    String name;
    int age;
    // 메서드
    void eat(){}
    void sleep(){}
}

class Student extends Human {
    int studentID;
    void goToSchool(){}
}

class Worker extends Human {
    int workerID;
    void goToWork(){}
}

public class Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human human = new Human();
        human.name = "김현지";
        human.age = 11;
        human.eat();
        human.sleep();

        // Student 객체 생성
        Student student = new Student();
        student.name = "김민성";
        student.age = 16;
        student.studentID = 128;
        student.eat();
        student.sleep();
        student.goToSchool();

        // Worker 객체 생성
        Worker worker = new Worker();
        worker.name = "봉윤정";
        worker.age = 45;
        worker.workerID = 128;
        worker.eat();
        worker.sleep();
        worker.goToWork();
    }
}
