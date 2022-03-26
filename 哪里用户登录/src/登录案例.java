import java.util.Scanner;

public class 登录案例 {
    public static void main(String[] args) {
        String Uname = "AShiwuya";
        String pwd = "ywmcc99";
        //使用循环的方法，给出次数的明确   用for方法实现，并且在登录成功的时候结束循环
        for (int i = 0; i<3; i++) {

            //键盘录入登陆的用户和密码 ，用Scanner实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String psd = sc.nextLine();

            //那键盘录入的用户名和密码作比较 给出相应的 提示 ，
            //字符串内容的比较用equls()方法实现
            if (name.equals(Uname) && pwd.equals(psd)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账户被锁定 ，请与管理员联系");
                } else {
                    System.out.println("登录失败你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
