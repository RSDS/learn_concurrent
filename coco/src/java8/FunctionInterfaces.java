package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/9 10:20
 * ModifiedBy:
 * ModifiedTime:
 */
public class FunctionInterfaces {


    static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t: list){
            if (p.test(t)){
                result.add(t);
            }
        }
        return result;
    }



    static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T t: list){
            consumer.accept(t);
        }
    }


    //Function接口
    static <T, R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T t: list){
            result.add(f.apply(t));
        }
        return result;
    }

    //Supplier接口
    static <T> List<T> create(Integer number, Supplier<T> s){
        List<T> result = new ArrayList<>();
        for (int i=0; i<number; ++i){
            result.add(s.get());
        }
        return result;
    }


    public static void main(String[] args) {

        //forEach(Arrays.asList(1,2,3,4,5),
        //        System.out::println);
        //
        //
        //List<Integer> lengthList = map(Arrays.asList("qqqqq","rr","ggggggggggg"), String::length);
        //
        //lengthList.forEach(System.out::println);

        //List<Apple> appleList = create(10, Apple::new);
        //
        //List<String> stringList = Arrays.asList("a","b","c","d","B");

        List<Apple> appleList = Arrays.asList(new Apple("green",20), new Apple("green", 10),
                new Apple("red", 30), new Apple("red", 20), new Apple("black", 2),
                new Apple("ied", 20));


        //appleList.sort(comparing(Apple::getWeight));
        //outList(appleList);
        //System.out.println("------------------------------------------------------------");
        //appleList.sort(comparing(Apple::getColor));
        //outList(appleList);
        //System.out.println("------------------------------------------------------------");
        //appleList.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        //outList(appleList);



        Predicate<Apple> redApple = (Apple a)-> "red".equals(a.getColor());
        outList(filter(appleList, redApple));
        System.out.println("------------------------------------------------------------");
        outList(filter(appleList, redApple.negate()));
        System.out.println("------------------------------------------------------------");
        outList(filter(appleList, redApple.and((a)->a.getWeight()>20)));





        System.out.println("------------------------------------------------------------");

    }


    static void outList(List<Apple> list){
        for (Apple t: list){
            System.out.print("the color of Apple is : "+t.getColor());
            System.out.println("    ,"+"the weight of Apple is : "+t.getWeight());

        }
    }



}
