package org.buding;

/**
 * @program: ThreadDemo
 * @author: miaochen
 * @create: 2019-06-28 17:00
 * @description:
 **/
public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1=new RunnableDemo("Thread-1");
        r1.strt();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.strt();
    }
}
