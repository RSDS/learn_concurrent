package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/2 15:12
 * ModifiedBy:
 * ModifiedTime:
 */
public class JavaMethod {


    static List<Apple> filterApple(List<Apple> inventory, Apple.Predicate<Apple> p){
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple: inventory){
            if (p.test(apple)){
                appleList.add(apple);
            }
        }
        return appleList;
    }


    public static void main(String[] args) {

        //File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        //
        //System.out.println("-----");
        //
        //
        //filterApple(new ArrayList<>(), (Apple a)->"green".equals(a.getColor()));

        List<Apple> appleList = new ArrayList<>();
        for (int i=1; i<100; ++i){
            appleList.add(new Apple("green", i));
        }

        List<Apple> result = appleList.stream().filter((Apple a)-> a.getWeight()>50).collect(Collectors.toList());


        System.out.println("--------------");
        print(()->System.out.println("++++++++++++"));









    }

    static void print(Runnable r){
        r.run();
    }


}
