package string;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:"+s1);
        //由于s1使用该字面量创建过字符串对象,因此s2会用这个对象
        String s2 = "123abc";
        System.out.println("s2:"+s2);

        System.out.println(s1==s2);//true,地址相同

        String s3 = "123zbc";
        System.out.println(s1==s3);//true

        s2 = s2+"!";//创建新对象
        System.out.println("s2:"+s2);//123abc!
        System.out.println("s1:"+s1);//123abc
        System.out.println(s1 == s2);//false

        String s4 = new String("123abc");
        System.out.println("s4:"+s4);
        System.out.println(s1 == s4);//false,地址不同
        //实际开发中比较字符串的需求都是比较内容,都应当使用equals进行比较
        System.out.println(s1.equals(s4));//true,字符串内容相同

        /*
            这里触发了编译器的一个特点:
            编译器在编译源代码时,只要一个计算表达式可以在编译期间确定结果的,
            编译器一定进行计算,并将结果编译到字节码文件中,因此下面的代码会被编译器
            改为 String s5 = "123abc";
            因此s5在JVM进行执行时会重用s1对象.
         */
        String s5 = "123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s1 == s5);//true

        String s = "123";
        String s6 = s +"abc";//修改内容创建新对象
        System.out.println(s1 == s6);

    }
}
