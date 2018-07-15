package java8;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/2 15:45
 * ModifiedBy:
 * ModifiedTime:
 */

public class Apple {

    private String color;
    private Integer weight;

    public Apple(){

    }


    public Apple(String color, Integer weight){
        this.color = color;
        this.weight = weight;
    }


    public Integer getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public static boolean isGreen(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isWeight(Apple apple){
        return apple.getWeight()>50;
    }

    public interface Predicate<T>{
        boolean test(T t);
    }













}
