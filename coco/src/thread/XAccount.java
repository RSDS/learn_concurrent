package thread;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/6/14 11:42
 * ModifiedBy:
 * ModifiedTime:
 */
public class XAccount {

    //SimpleDateFormat
    //ConcurrentDateFormat

    private ThreadLocal<String>  name = ThreadLocal.withInitial(String::new);


    public XAccount(String str){
        this.name.set(str);
        System.out.println("----------"+ this.name.get());
    }

    public String getName(){
        return name.get();
    }

    public void setName(String str){
        this.name.set(str);
    }



}
