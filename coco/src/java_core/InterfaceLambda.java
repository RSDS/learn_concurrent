package java_core;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 10:05
 * ModifiedBy:
 * ModifiedTime:
 */
public class InterfaceLambda {


    public static void main(String[] args) {
        //RedApple x = new RedApple();
        //
        //if (x.isWeight()){
        //    System.out.println("++++++++++++++++++");
        //}
        //
        //if (x.isGreen()){
        //    System.out.println("---------------------");
        //}



        InheritApple inheritApple =  new InheritApple();
        if (inheritApple.isGreen()){
            System.out.println("the apple is green");
        }






    }




}
