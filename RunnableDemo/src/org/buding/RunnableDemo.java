package org.buding;

/**
 * @program: ThreadDemo
 * @author: miaochen
 * @create: 2019-06-28 16:55
 * @description:
 **/
public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating"+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread: "+threadName+", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
           System.out.println("Thread " +threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+"exiting.");
    }

    public void strt(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
