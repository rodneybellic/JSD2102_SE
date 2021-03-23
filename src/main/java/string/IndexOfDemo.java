package string;

/**
 * int indexOf(String str)
 * 检索当前字符串中给定字符串的位置,
 * 如果当前字符串不包含给定内容时
 * 返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        //查找in在当前字符串中的位置
        int index = str.indexOf("in");
        System.out.println(index);//2
        //从指定位置开始检索第一次 出现给定字符串的位置
        index = str.indexOf("in",3);
        System.out.println(index);//5
        //检索最后一次出现给定字符串的位置
        index = str.lastIndexOf("in");
        System.out.println(index);//9
    }
}
