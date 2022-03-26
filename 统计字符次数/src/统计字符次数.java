import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //统计三种字符类型的个数 需要定义三个统计变量 ，初始值为0；
        int big = 0;
        int small = 0;
        int nmb = 0;

        //遍历字符串 得到每一个字符
        for (int i = 0; i<line.length(); i++){
            char ch = line.charAt(i);

            //判断该字符属于那种类型 然后对应的字符类型+1;
            if (ch >='A' && ch <= 'Z'){
                big++ ;
            } else if (ch >= 'a' && ch <= 'z'){
                small++;
            } else if (ch >= '0' && ch <= '9'){
                nmb++;
            }
        }
        //输出三个字符类型的个数
        System.out.println("大写字母："+ big + "个");
        System.out.println("小写字母："+ small + "个");
        System.out.println("数字："+ nmb + "个");
    }
}
