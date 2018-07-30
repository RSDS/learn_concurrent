package java_core.clone;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 13:34
 * ModifiedBy:
 * ModifiedTime:
 */
public class TestClone {


    public static void main(String[] args) {

        Fresh fresh = new Fresh(3);
        Orange orange1 = new Orange("green", 3, fresh);
        try {
            Orange orange2 = orange1.Clone();

            orange2.setColor("red");
            System.out.println(orange1.getColor());


            orange2.setPrice(50);
            System.out.println(orange1.getPrice());

            fresh.setTime(50);
            //orange2.setFresh();
            System.out.println(orange1.getFresh().getTime());


        }catch (Exception e){
            System.out.println("error::::::::::::::");
            e.printStackTrace();
            e.getStackTrace();
        }




    }


}
