public class 添加和反转 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        //public StringBuilder append(任意类型):    添加数据，并返回对象本身
//        StringBuilder sb2 = sb.append("hello");
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);

        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(100);

        System.out.println(sb);

        //链式编程
        sb2.append("hellp").append("world").append("java").append(100);
        System.out.println(sb2);

        //反转这个方法
        sb.reverse();
        System.out.println("反转sb:"+ sb);
    }
}
