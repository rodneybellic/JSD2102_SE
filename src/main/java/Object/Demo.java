package Object;

/**
 * Object是所有类的顶级类.里面有几个经常被子类重写的方法,
 * 其中包括toString和equals
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /*
            Object已经实现了toString方法,直接继承下来是返回的字符串内容
            为当前对象的地址信息.格式为:类名@地址
            toString方法实际开发中很少直接写代码去调用它,都是在不经意
            被自动执行的,例如在使用System.out.println输出时.与字符串连接
            操作时.
         */

        //System.out.println(Object obj)输出给定对象toString返回的字符串到控制台
       System.out.println(p);

       //字符串连接操作时,会将非String类型的对象调用toString转换为字符串后拼接
        String line = "这是一个Point:"+p;
        System.out.println(line);

        Point p2 = new Point(1,2);
        System.out.println("p2:"+p2);
        /*
            对于引用类型而言,变量保存的值是对象的地址
            ==比较是比较两个变量的值是否相等,因此对于引用类型而言
            就是比较地址是否相等,那么意思就是比较是否为同一个对象.

            equals是Object定义的另一个方法,意图是比较两个对象的内容是否相同.
            子类不重写这个方法,则没有实际意义,因为Object实现时内部仍然是用==比较的
         */

        System.out.println(p == p2);//false
        System.out.println(p.equals(p2));//true

    }
}
