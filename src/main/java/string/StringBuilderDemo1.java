package string;

/**
 *
 * java.lang.StringBuilder
 * 专门用来修改String的一个API,内部维护一个可以改变char 数组,修改都是
 * 在这个数组上进行的,内部会自动扩容.修改速度和性能开销优异.并且提供了修改字符串的常见操作
 * 对应的方法:正删改插
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String str = "好好学习java";

        //内部默认表示一个空字符串
        //StringBuilder builder = new StringBuilder();

        //复制给定字符串到StringBuilder内部
       // StringBuilder builder = new StringBuilder(str);//不是线程安全的
        StringBuffer builder = new StringBuffer(str);//是线程安全的
        /**
         * 好好学习java,为了找个好工作
         * append:追加内容
         */
        builder.append(",为了找个好工作!");
        System.out.println(builder);//输出Stringbuilder的内容

        //通过调用toString方法将StringBuilder内容以字符串形式返回
        str = builder.toString();
        System.out.println(str);


        /*
            好好学习java,为了摘个好工作!
            好好学习java,就是为了改变世界!
            replace:替换部分内容
         */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /*
               好好学习java,就是为了改变世界!
               ,就是为了改变世界
               delete:删除部分内容
         */
        builder.delete(0,8);
        System.out.println(builder);


        /*
            ,就是为了改变世界!
            活着,就是为了改变世界!
            insert:插入操作
         */

        builder.insert(0,"活着");
        System.out.println(builder);

        //翻转字符串
        builder.reverse();
        System.out.println(builder);

    }
}
