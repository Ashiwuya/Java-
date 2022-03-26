package mazien0;

public class Student {
    //成员变量
    String name;
    //    int age;
    //使用private方法赋值
    private int age;

    public void setAge(int a) {
        //给一个判断语句
        if (a < 0 || a > 120) {
            System.out.println("你输入的年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }


    //get方法
    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}