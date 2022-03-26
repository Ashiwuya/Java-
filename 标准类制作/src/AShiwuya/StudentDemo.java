package AShiwuya;
/*
学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
    //创建对象
    Student s1 = new Student();
    s1.setName("马梓恩");
    s1.setAge(20);
    s1.show();
    Student s2 = new Student("马梓恩", 20);
    s2.show();
    }
}
