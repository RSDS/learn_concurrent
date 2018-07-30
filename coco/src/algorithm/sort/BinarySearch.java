

import java.util.Arrays;

/**
 * Description:
 * Author:
 * CreateTime:	       2018/7/23 9:49
 * ModifiedBy:
 * ModifiedTime:
 */

//编译命令
//java BinarySort largeW.txt < largeT.txt
//javac -encoding utf-8 BinarySort.java StdIn.java StdOut.java

public class BinarySearch {



    public static int rank(int key, int [] a){
        int head = 0;
        int rear = a.length - 1;


        while (head <= rear){
            int mid = (head+rear)/2;
            if (key < a[mid] ){
                rear = mid-1;
            }else if (key > a[mid]){
                head = mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }










    public static void main(String[] args) {

        //int[] a = {1,3,5,8,4,6,2};
        //
        //int[] b = {1,3,5,8,4,6,2};
        //
        //int[] c = a;
        //
        //System.out.println(rank(5, a));

        //System.out.println(Math.sqrt(5.5));
        //System.out.println(Math.sin(1.55));
        //System.out.println(Math.pow(5,4));
        //System.out.println(Math.exp(12));


        //过滤白名单性能测试
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        long start1 = System.currentTimeMillis();
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, whitelist) <0){
                StdOut.println(key);
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("cost time is: "+(end1-start1) +"ms");




    }



}
