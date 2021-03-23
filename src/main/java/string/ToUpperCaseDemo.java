package string;

/**
 * boolean toUpperCase()
 * boolean toLowerCase()
 * 将当前字符串中的英文部分转换为全大写或全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        System.out.println(str);

        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);




    }
}
