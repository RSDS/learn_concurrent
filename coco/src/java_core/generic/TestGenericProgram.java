package java_core.generic;

import java.time.LocalDate;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/18 9:43
 * ModifiedBy:
 * ModifiedTime:
 */
public class TestGenericProgram {


    public static void main(String[] args) {


        Orange orange = new Orange("anhui", "red");

        LocalDate localDate = LocalDate.of(1992,8,13);


        LocalDate localDate2 = Fruit.getInstance(localDate);

        System.out.println("++++++++++++++++++++++++");



    }


}
