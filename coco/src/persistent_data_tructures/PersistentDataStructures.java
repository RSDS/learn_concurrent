package persistent_data_tructures;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Description:        可持久化数据结构
 * Author:             徐少斌
 * CreateTime:	       2018/6/27 14:45
 * ModifiedBy:
 * ModifiedTime:
 */
public class PersistentDataStructures {

    public static void main(String[] args) {


        //编译时可确定的进入常量池，运行时需要分配堆内存


        //test1 直接指向常量
        String s1 = "a";
        String s2 = "a";
        System.out.println("-----------------------------test1----------------------");
        System.out.println(s1==s2);

        //test2 创建新对象，间接指向常量
        String s3 = new String("a");
        String s4 = new String("a");
        System.out.println("-----------------------------test2----------------------");
        System.out.println(s3==s4);

        //test3 s5、s6、s7在栈中， "ab"、"cd"、"abcd"在常量池中，运行时s7计算出为"abcd"在堆中分配内存
        String s5 = "ab";
        String s6 = "cd";
        String s7 = s5+s6;
        System.out.println("-----------------------------test3----------------------");
        System.out.println(s7=="abcd");

        //test4 总结来说就是：字面量"+"拼接是在编译期间进行的，拼接后的字符串存放在字符串池中；
        // 而字符串引用的"+"拼接运算实在运行时进行的，新创建的字符串存放在堆中；
        // 对于直接相加字符串，效率很高，因为在编译器便确定了它的值，也就是说形如"I"+"love"+"java"; 的字符串相加，在编译期间便被优化成了"Ilovejava"。
        // 对于间接相加（即包含字符串引用），形如s1+s2+s3; 效率要比直接相加低，因为在编译器不会对引用变量进行优化
        String s8 = "abcd";
        System.out.println("-----------------------------test4----------------------");
        System.out.println(s8=="ab"+"cd");
        System.out.println(s8==s5+s6);




        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

    }




}
