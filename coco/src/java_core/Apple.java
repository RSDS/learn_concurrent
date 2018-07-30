package java_core;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 10:08
 * ModifiedBy:
 * ModifiedTime:
 */
public interface Apple {


    boolean isWeight();

    default boolean isGreen(){
        return false;
    }


}
