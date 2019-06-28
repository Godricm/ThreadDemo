package org.buding;

/**
 * @program: ThreadDemo
 * @author: miaochen
 * @create: 2019-06-28 17:05
 * @description:
 **/
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("Thread-1");
        t1.start();

        ThreadDemo t2=new ThreadDemo("Thread-2");
        t2.start();
    }
}
