/**
 * Demo
 */
public class Demo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");// 在字符串拘留池创建唯一的数据 在内存堆中拷贝一份数据,所以3和4的内存地址不一样
        String str4 = new String("hello");// 这和.NET中的所有字符串都只在字符串拘留池是有区别的

        System.out.println(str1 == str2);// true
        System.out.println(str1 == str3);// false
        System.out.println(str3 == str4);// true
        // equals此处被重写,比较的是文本内容
        System.out.println(str1.equals(str3));// false
        System.out.println(str3.equals(str4));// true
    }
}