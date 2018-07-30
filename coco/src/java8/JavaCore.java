package java8;

import java.util.Objects;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/13 10:21
 * ModifiedBy:
 * ModifiedTime:
 */
public class JavaCore {


    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);
        //Scanner in = new Scanner(System.in);
        //System.out.println("please input your name");
        //String name = in.nextLine();
        //System.out.println("your name is: "+name);
        //NumberFormat

        Apple x = new Apple("red",20);
        Apple y = new Apple("green",30);

        swap(x,y);

        System.out.println("+++++++++++++++++++++++++=");

//        BigApple bigApple = new BigApple();
        if (x instanceof BigApple){
            System.out.println("BigApple is a kind of Apple");
        }



    }

    static void swap(Apple a, Apple b){
        Apple temp = a;
        a = b;
        b = temp;
    }



}
