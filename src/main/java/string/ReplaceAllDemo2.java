package string;

/**
 * 和谐用语
 */
public class ReplaceAllDemo2 {
    public static void main(String[] args) {
        String regex = "(wqnmlgb|dsb|cnm|nc|fw|wrsndm|nmsl|djb)";
        String message = "wqnmlgb!你个dsb,你怎么这么的nc!你就是一个djb!";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
