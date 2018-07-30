package java_core.clone;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 13:31
 * ModifiedBy:
 * ModifiedTime:
 */

public class Orange implements Cloneable{


    public Orange(String color, int price, Fresh fresh){
        this.color = color;
        this.price = price;
        this.fresh = fresh;
    }

    public Orange Clone() throws CloneNotSupportedException{
        return new Orange(this.color, this.price, new Fresh(this.fresh.getTime()));


        //return (Orange)super.clone();
    }


    private String color;

    private int price ;

    private Fresh fresh;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fresh getFresh() {
        return fresh;
    }

    public void setFresh(Fresh fresh) {
        this.fresh = fresh;
    }
}
