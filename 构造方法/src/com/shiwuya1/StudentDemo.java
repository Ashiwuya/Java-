package com.shiwuya1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.show();
        Student s2 = new Student("马梓恩");
        s2.show();
        Student s3 = new Student(30);
        s3.show();
        Student s4 = new Student("马梓恩",30);
        s4.show();

    }

}
