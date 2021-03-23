package string;

/**
 * StringBuilder修改字符串的性能
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("a");
        for(int i=0;i<1000000;i++){
            builder.append("a");
        }
        System.out.println("执行完毕!");
    }
}
