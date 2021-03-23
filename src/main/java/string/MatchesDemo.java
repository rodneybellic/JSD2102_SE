package string;

/**
 * String支持正则表达式的方法之一:
 * Boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求
 * 满足则返回true.否则返回false
 */
public class MatchesDemo {
    public static void main(String[] args) {
        /*
            邮箱的正则表达式
            用户名@域名
            fancq@tedu.cn
            [a-zA-Z0-9_]-@[z-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String mail = "fancq@tedu.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = mail.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }

}
