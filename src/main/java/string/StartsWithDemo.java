package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否已给定内容开始或结尾
 */

public class StartsWithDemo {
    public static void main(String[] args) {
        String str= "www.tedu.com";
        //查看str是否以"www."开始
        boolean starts = str.startsWith("wwW.");
        System.out.println(starts);

        boolean ends = str.endsWith(".cn");
        System.out.println(ends);//flase
        ends = str.endsWith(".com");
        System.out.println(ends);//true


    }
}
