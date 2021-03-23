package integer;

/**
 * 包装类
 * java定义了8个包装类,目的是为了解决基本类型不能直接参与面向对象开发的问题,
 * 使得基本类型可以通过包装类的实例以对象形式存在.
 * 其中数字类型的包装类都继承自java.lang.Number ,
 * 而char和boolean的包装类直接继承自ObjecNumber是一个抽象类,
 * 定义了一些方法,目的是让包装类可以将其表示的基本类型转换为其他数字类型.
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        //基本类型转换为包装类int i = 123;
        int i = 123;
        //java推荐我们使用包装类的静态方法valueOf将基本类型转换为包装类,而不是直接new
       //Integer i1 = new Integer(i);
       // Integer i2 = new Integer(i);
        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf(i);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));


        double dou = 123.123;
        Double dou1 = Double.valueOf(dou);
        Double dou2 = Double.valueOf(dou);
        System.out.println(dou1==dou2);
        System.out.println(dou1.equals(dou2));

        //包装类装换为基本类型
        int in = i1.intValue();//获取包装类对象中表示的基本值类型
        double doub = i1.doubleValue();
        System.out.println(in);//123
        System.out.println(doub);//123.0

        in = dou1.intValue();//大类型转小类型可能存在丢精度!
        doub = dou1.doubleValue();
        System.out.println(in);//123
        System.out.println(doub);//123.123

    }

}
