package apidoc;

/**
 * 文档注释功能级注释,只在三个地方使用,分别是类上,方法上和常量上\
 * 文档注释可以通过javadoc命令生成手册
 *
 * 在类上使用时用来说明当前类的设计目的整体的功能介绍
 */
public class ApiDocDemo {
    /**
     * sayHello方法中使用的问候语
     */
    public static final String INFO = "你好!";


    /**
     * 为给定的用户添加问候语
     * @param name 给定的用户的名字
     * @return  含有问候语的字符串.
     */
    public String sayHello(String name){
        return  INFO + name;
    }


}
