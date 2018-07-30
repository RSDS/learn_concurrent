package java_core.generic;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/18 9:40
 * ModifiedBy:
 * ModifiedTime:
 */
public class Fruit {

    public static <T extends Comparable> T getInstance(T... a){
        return a[0];
    }




}
