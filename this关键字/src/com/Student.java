package com;
//学生类
public class Student {
    //定义类的属性
    private String name;
    private int age;
    //姓名
//    public void setName(String n){
//        name = n;
//    }
    //name = naem输出结果是null
//    public void setName(String name){
//        name = name;
//    }
    public void setName(String name){
        //this.name说明这个name是全局中的name
        //区分 全局中的name 和 方法中的name
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //年龄
//    public void setAge(int a){
//        if (a<0 || a>120){
//            System.out.println("你输入的年龄有误");
//        } else {
//            age = a;
//        }
//    }
    public void setAge(int age){
        if (age<0 || age>120){
            System.out.println("你输入的年龄有误");
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + "--"+ age);
    }
}
