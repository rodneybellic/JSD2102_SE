package integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //1可以通过包装类获取其表示的基本类型的取值范围
        //获取int的最大值和最小值
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        /*
            字符串转换为基本类型的前提是该字符串正确描述了基本类型
            可以保存的值，否则会抛出异常:NumberFormatException

         */
        String str = "123";
              // String str = "123.123" 这个字符串不能解析为int值!
        int d = Integer.parseInt(str);
        System.out.println(d);//123
        double dou = Double.parseDouble(str);
        System.out.println(dou);//123.123



    }
}
