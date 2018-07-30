package java_core;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 10:46
 * ModifiedBy:
 * ModifiedTime:
 */
public class InterfaceApple implements Apple, GreenApple {


    @Override
    public boolean isWeight(){
        return true;
    }


    public boolean isGreen() {
        return Apple.super.isGreen();
    }
}
