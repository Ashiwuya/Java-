public class 转换 {
    public static void main(String[] args) {
        //StringBuilder转化String
        StringBuilder sb = new StringBuilder();
        sb.append("abc");

        //String s = sb; 错误

        String s = sb.toString();
        System.out.println("sb:" + sb);
        System.out.println("s:" + s);

        //String 转化 StringBuiler
        String s1 = "abc";
        //StringBuilder sb1 = s1;  错误
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println("sb1:" + sb1);
        System.out.println("s1:" + s1);
    }
}
