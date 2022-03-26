import java.util.Locale;
import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        /*
        需求 键盘录入一个字符串 实用程序遍历字符串
        思路：见代码注释
         */
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String sc1 = sc.nextLine();
        //遍历字符串 首先获取到字符串每一个字符，
        /*
        System.out.println(sc1.charAt(0));
        System.out.println(sc1.charAt(1));
        System.out.println(sc1.charAt(2));
        使用下方循环改进
         */
//        for (int i = 0; i<3; i++){
//            System.out.println(sc1.charAt(i));
//        }
        //改进上面循环语句 可以使循环语句获取任意长度字符串
//        System.out.println(sc1.length());
        for (int i = 0; i<sc1.length(); i++){
            System.out.println(sc1.charAt(i));
        }
    }
}
