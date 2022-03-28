import java.util.Scanner;

public class 字符串反转升级版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //调用超级牛逼的方法
        String fanz1 = fanz(line);

        //输出结果
        System.out.println(fanz1);
    }
    //定义一个方法
    //明确 返回值类型： String  参数 Sreing s
    public static String fanz(String s){
        //在方法中用StringBuilder实现字符串反转，并把结果转化成为String
        //String --- StringBuilder--- reverse()---String

//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String ss = sb.toString();
//        return ss;
        //超级简化法如下

        //输出 StringBuilder(s)的反转方法的转化成String的方法
        return new StringBuilder(s).reverse().toString();
    }
}
