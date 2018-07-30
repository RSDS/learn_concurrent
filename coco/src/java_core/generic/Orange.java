package java_core.generic;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/18 9:44
 * ModifiedBy:
 * ModifiedTime:
 */
public class Orange {

    private String name;

    private String color;


    public Orange(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
