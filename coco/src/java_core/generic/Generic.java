package java_core.generic;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/25 9:57
 * ModifiedBy:
 * ModifiedTime:
 */
public class Generic {


    public static void main(String[] args) {

        //List<Integer> a = new ArrayList<>();
        //a.add(1);
        //a.add(2);
        //
        //List b = a;
        //
        //List<Integer> c = b;
        //
        //for (Integer x: c){
        //    System.out.println(x);
        //}
        //
        //
        ////允许声明带泛型的数组，但不能创建（除非创建无上限的通配符泛型数组），因为JAVA设计原则就是，将潜在的问题在编译时暴露出来；
        //List<String>[] d = new ArrayList[10];
        //
        //

        int a = 0b0101;
        int b = 0b0011;
        int c = a+b;
        System.out.println(c);




    }



}
