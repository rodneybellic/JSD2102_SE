package string;

import java.util.Arrays;

/**
 * String支持正则表达式的方法二
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分,
 * 将拆分够的每部分以数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        //按照数字部分拆分,获取其中每部分字母
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        str = "123,456,789,023";
        //拆分出所有的数字部分
        arr = str.split(",");
        System.out.println(Arrays.toString(arr));
        //如果连续遇到拆分项,则会拆分出一个空字符串.但是在字符串末尾连续遇到则忽略
        str = ",,,123,,,456,789,023,,,,";
        //拆分出所有的数字部分
        arr = str.split(",");
        System.out.println(Arrays.toString(arr));

        str = "123.456.789.023";
        //拆分出所有的数字部分
        arr = str.split("\\.");// .在正则表达式中表示任意字符,要注意转意!
        System.out.println(Arrays.toString(arr));

    }
}
