public class 拼接字符串 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //定义一个接受变量
        String s = array(arr);
        //调用方法,输出结果
        System.out.println("s:"+s);
    }
    //定义一个方法 用于把int数组中的数据按照指定格式拼接成一个字符串
    //明确 返回值类型 String  参数： int[] arr

    public static String array(int[] arr) {
        //在方法中遍历数组，按照要求拼接
        String s = "";

        s += "[";

        for (int i = 0; i<arr.length; i++){
            if (i == arr.length - 1){
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }

        s += "]";

        return s;
    }
}
