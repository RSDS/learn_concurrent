package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Description:        流式处理
 * Author:             徐少斌
 * CreateTime:	       2018/7/10 15:21
 * ModifiedBy:
 * ModifiedTime:
 */
public class StreamIntroduce {

    public static void main(String[] args) {

        List<Apple> appleList = Arrays.asList(
                new Apple("red", 10),
                new Apple("red",20),
                new Apple("red",40),
                new Apple("red",30),
                new Apple("red",50),
                new Apple("green",50),
                new Apple("green",30),
                new Apple("green",40),
                new Apple("green",20),
                new Apple("green",10),
                new Apple("pure",20),
                new Apple("pure",40),
                new Apple("pure",50),
                new Apple("pure",30),
                new Apple("pure",10)
                );
        //
        //outList(appleList.stream().filter((a)->a.getWeight()>10).collect(toList()));
        //System.out.println("------------------------------------------------------------");



        //Map<String, List<Apple>> aa = appleList.stream().collect(groupingBy(Apple::getColor));


        //Stream<Apple> appleStream = appleList.stream();
        //outList(appleStream.filter((a)->a.getWeight()>10).collect(toList()));


        //List<Integer> aa = appleList.stream().filter((a)->a.getWeight()>10).map(Apple::getWeight).collect(Collectors.toList());
        //System.out.println("------------------------------------------------------------");
        //outList(appleStream.filter((a)->a.getWeight()>10).collect(toList()));

        //System.out.print(appleList.stream().filter((a)->a.getWeight()>10).count());

        //appleList.stream().forEach(System.out::println);

        //System.out.print(appleList.stream().limit(1).count());

        //skip 跳过元素
        //appleList.stream().forEach(System.out::println);
        //System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        //appleList.stream().skip(10).forEach(System.out::println);

        //map 映射
        //appleList.stream().map(Apple::getColor).forEach(System.out::println);
        //appleList.stream().map(Apple::getColor).map(String::length).forEach(System.out::println);


        //扁平化 flatMap
        //List<String> hello = Arrays.asList("Hello", "World");
        //hello.stream().forEach(System.out::println);
        //System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        //hello.stream().map(w->w.split("")).forEach(System.out::println);
        //System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        //hello.stream().map(w -> w.split("")).flatMap(Arrays::stream).forEach(System.out::println);

        //映射
        //List<Integer> numbers1 = Arrays.asList(1,2,3);
        //List<Integer> numbers2 = Arrays.asList(3,4,5);
        //List<Integer[]> a = numbers1.stream().flatMap(i-> numbers2.stream().filter(j->(i+j)%3==0).map(j ->  new Integer[]{i,j})).collect(toList());

        //匹配  allMatch anyMatch noneMatch
        //System.out.println(appleList.stream().allMatch(a-> a.getWeight()<200));


        //optional 为了解决流中没有元素的情况。
        //Optional<Apple> a = appleList.stream().filter(b->b.getWeight()>10).findAny();
        //a.ifPresent(b->System.out.println(b.getWeight()));


        //归约
        //List<Integer> integerList = Arrays.asList(1,2,3,5,8);
        //System.out.println(integerList.stream().reduce(0, (a,b)->a+b));
        //integerList.stream().reduce(Integer::sum).ifPresent(System.out::println);


        //流实战 fuck stream
        //Trader raoul = new Trader("Raoul", "Cambridge");
        //Trader mario = new Trader("Mario","Milan");
        //Trader alan = new Trader("Alan","Cambridge");
        //Trader brian = new Trader("Brian","Cambridge");
        //List<Transaction> transactions = Arrays.asList(
        //        new Transaction(brian, 2011, 300),
        //        new Transaction(raoul, 2012, 1000),
        //        new Transaction(raoul, 2011, 400),
        //        new Transaction(mario, 2012, 710),
        //        new Transaction(mario, 2012, 700),
        //        new Transaction(alan, 2012, 950)
        //);
        //
        ////(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        //List<Transaction> result1 = transactions.stream().filter(a->a.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        //
        ////(2) 交易员都在哪些不同的城市工作过？
        //List<String> result2 = transactions.stream().map(a->a.getTrader().getCity()).distinct().collect(Collectors.toList());
        //
        ////(3) 查找所有来自于剑桥的交易员，并按姓名排序。
        //List<Trader> result3 = transactions.stream().filter(a->a.getTrader().getCity()=="Cambridge").map(Transaction::getTrader).distinct().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        //
        ////(4) 返回所有交易员的姓名字符串，按字母顺序排序。
        //List<String> result4 = transactions.stream().map(a-> a.getTrader().getName()).distinct().sorted().collect(Collectors.toList());
        //
        ////(5) 有没有交易员是在米兰工作的？
        //Boolean result5 = transactions.stream().filter(a->a.getTrader().getCity()=="Milan").findAny().isPresent();
        //
        ////(6) 打印生活在剑桥的交易员的所有交易额。
        ////transactions.stream().collect(groupingBy(Transaction::getTrader))
        //
        ////(7) 所有交易中，最高的交易额是多少？
        ////Optional<Transaction> result7 = transactions.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).findFirst();
        //Optional<Integer> result7 = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        //
        ////(8) 找到交易额最小的交易。
        //Optional<Transaction> result8 = transactions.stream().sorted(Comparator.comparing(Transaction::getValue)).findFirst();
        //
        //
        //int j = transactions.stream().map(Transaction::getValue).reduce(Integer::sum).get();
        //int k = transactions.stream().mapToInt(Transaction::getValue).sum();
        //OptionalInt m = transactions.stream().mapToInt(Transaction::getValue).max();
        //m.orElse(5);

        //List<int[]> re = IntStream.rangeClosed(1,100).boxed()
        //        .flatMap(a-> IntStream.rangeClosed(a,100)
        //                .filter(b -> Math.sqrt(a*a+b*b) % 1==0)
        //                .mapToObj(b-> new int[]{a,b,(int)Math.sqrt(a*a+b*b)})).collect(Collectors.toList());

        //无限流
        Stream.generate(()->1).forEach(System.out::println);


        System.out.println("+======================================");


    }


    static void outList(List<Apple> list){
        for (Apple t: list){
            System.out.print("the color of Apple is : "+t.getColor());
            System.out.println("    ,"+"the weight of Apple is : "+t.getWeight());

        }
    }
    static void stringOutList(List<String> list){

    }




}
