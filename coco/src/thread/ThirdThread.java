package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/6/14 9:59
 * ModifiedBy:
 * ModifiedTime:
 */
public class ThirdThread {

    public static void main(String[] args) {
        //ThirdThread thirdThread = new ThirdThread();

        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for (; i<10000; i++){
                System.out.println(Thread.currentThread().getName()+ " 的循环变量i的值： "+i);
            }
            return i;
        });

        //for (int i=0; i<100; i++){
        //    System.out.println(Thread.currentThread().getName()+ " 的循环变量i的值："+i);
        //    if (i==20){
        //        new Thread(task, "有返回值的线程1").start();
        //        new Thread(task, "有返回值的线程2").start();
        //    }
        //}
        //
        //try{
        //    System.out.println("子线程的返回值："+task.get());
        //}catch (Exception e){
        //    e.printStackTrace();
        //}


        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int j=0; j<5; ++j){
            pool.submit(new Thread(task, "线程池1"));
            pool.submit(new Thread(task, "线程池2"));
        }
        pool.shutdown();

    }


}
