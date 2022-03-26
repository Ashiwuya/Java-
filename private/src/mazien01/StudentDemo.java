package mazien01;

public class StudentDemo {
    public static void main(String[] args) {

    Student s = new Student();

    //输出
        s.setName("马梓恩");
        s.setAge(20);
        //输出
        s.show();
        //使用get方法获取成员的值
        System.out.println(s.getName()+"----"+s.getAge());
    }
}
