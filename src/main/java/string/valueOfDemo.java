package string;

/**
 * String 提供了一组重载的valueOf方法,
 * 作用是将其他类型转换为String
 *
 */
public class valueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String str = String.valueOf(a);

        double dou = 123.123;
        String str2 = String.valueOf(dou);

        System.out.println(str);
        System.out.println(str2);

        String str3 = a+"";
        System.out.println(str3);
    }
}
