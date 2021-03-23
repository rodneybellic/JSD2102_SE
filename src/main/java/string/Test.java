package string;

public class Test {
    public static void main(String[] args) {
        String name1 = getHostName("www.tedu.cn");
        String name2 = getHostName("http://doc.canglaoshi.org");
        String name3 = getHostName("www.tarena.com.cn");
        System.out.println(name1);//tedu
        System.out.println(name2);//canglaoshi
        System.out.println(name3);//tarena


    }

    private static String getHostName(String line) {
            int start = line.indexOf(".")+1;//找到第一个"."之后第一个字符串的位置
            int end = line.indexOf(".",start);//找到第二个"."的位置
        return line.substring(start,end);//提示:结合indexOf和substring方法实现
    }

}
