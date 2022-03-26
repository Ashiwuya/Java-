public class Student {
    public static void main(String[] args) {
        //构造方法得到对象
            char[] chs = {'a','b','c'};
            String s1 = new String(chs);
            String s2 = new String(chs);

            //直接赋值得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串地址值
        System.out.println( s1 == s2);
        System.out.println( s1 == s3);
        System.out.println( s3 == s4);
        System.out.println("------");

        //比较字符串内容是否相同
        System.out.println( s1.equals(s2));
        System.out.println( s1.equals(s3));
        System.out.println( s3.equals(s4));
    }
}
