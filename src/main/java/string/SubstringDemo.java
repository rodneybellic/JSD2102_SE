package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围的字符串.start,end是开始与结束位置的下标.
 * 注意:在java API中通常使用两个数字表示范围时,都是含头不含尾的.
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //           01234567890
        String str= "www.tedu.cn";
        //截取域名部分
        String sub = str.substring(4,8);
        System.out.println(sub);
        //重载的substring方法可以从指定位置截取到字符串末尾
        sub = str.substring(4);
        System.out.println(sub);
    }
}
