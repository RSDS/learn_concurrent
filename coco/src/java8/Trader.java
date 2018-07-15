package java8;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/11 14:28
 * ModifiedBy:
 * ModifiedTime:
 */
public class Trader {

    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }


}
