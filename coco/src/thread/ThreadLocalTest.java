package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/6/14 11:41
 * ModifiedBy:
 * ModifiedTime:
 */
public class ThreadLocalTest {

    public static void main(String[] args) {

        XAccount xAccount = new XAccount("初始");

        Callable x = ()->{
            for (int i=0; i<10; ++i){
                if (i==6){
                    xAccount.setName(Thread.currentThread().getName());
                }
                System.out.println(xAccount.getName()+ "账号的i值："+i);
            }
            return xAccount;
        };

        FutureTask<XAccount> task1 = new FutureTask<>(x);
        FutureTask<XAccount> task2 = new FutureTask<>(x);

        new Thread(task1, "线程1").start();
        new Thread(task2, "线程2").start();
    }








}
