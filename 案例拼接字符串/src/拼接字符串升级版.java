public class 拼接字符串升级版 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        String s = arrToString(arr);

        System.out.println("S:" + s);
    }

    //定义一个方法
    //明确返回值类型 String 参数 int[] arr
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        //用循环语句做遍历
        for (int i = 0; i<arr.length;i++){
            if ( i == arr.length - 1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        String s = sb.toString();

        return s;
    }
}
