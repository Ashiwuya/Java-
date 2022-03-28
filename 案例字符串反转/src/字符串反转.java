import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //调用方法 用一个变量接收
        String s = fanz(line);
        //输出结果
        System.out.println("s:" + s);
    }
    // 明确返回值类型 String  参数 String
    public static String fanz(String s){
        //在方法中倒着遍历字符串，然后吧得到的字符拼接成一个数组
        String ss = "";

        for (int i=s.length()-1;i>=0; i--){
            ss += s.charAt(i);
        }

        return  ss;
    }
}
