package com.OptimalStructures.example.OptimalStructures.SampleClasses;


/**
 * 3 ways to instantiate a thread
 *  1.Anonymous thread
 *  2.Extending Thread Class
 *  3.Implementing Runnable
 *------------------------------------
 *
 * Multitasking - Executing several tasks simultaneously
 *      1.Process based
 *          Executing several tasks simultaneously where each is an independent process(OS Level).
 *              Eg - Doing all things at a time(listening to songs, browsing etc).
 *
 *      2.Thread based
 *          Executing several tasks simultaneously where each is separate part of a program.And each independent part is a Thread.
 *              Eg - Programatic level - video games, animations, software.
 *
 *-----------------------------------
 * Thread Scheduler - When multiple threads are waiting for their execution, which thread will get chance first is decided.
 *                    Behaviour is decided by JVM, hence we can't decide execution order, hence o/p(not guaranteed).
 *
 *-----------------------------------
 * Lifecycle of a thread -
 *
 *                    t.start()             Thread schedular allocates memory                   run() completes
 *      New             ->           Ready               ->                      Running               ->      Dead State
 *  (t = new Thread())                  ^                                            |
 *                                      |--------------------------------------------|
 *                                                       yield()
 *                                                       join()
 *                                                       sleep()
 *
 * start() - creates a new thread and that thread will call run method
 *           Can't start the thread 2 times without stopping it
 *              t.start()
 *              ...
 *              ...
 *              t.start() - runtime exception
 *
 * run()   - no new thread is created
 *
 * stop()  - killing a thread(Depreciated, therefore not recommended to use)
 *------------------------------------
 * Properties of a thread -
 *      1.Name - setName() & getName()
 *              eg = Thread.currentThread().getName() & Thread.currentThread().setName()
 *
 *      2.Priority(1(Min)-10(Max)) -
 *              default priority - 5, while inheritance  priority same
 *              Thread.MIN_PRIORITY(1), Thread.MAX_PRIORITY(10), Thread.NORM_PRIORITY(5)
 *
 *--------------------------------------
 * Preventing thread from execution -
 *      1.yield()    - pauses current thread and gives other threads of same priority for execution, if no threads awaiting then same thread will resume
 *      2.join()     - if we want our thread to wait till other thread completes it's execution
 *      3.sleep()    - Wait for a specified interval of time
 *      4.interupt() - Whenever a thread goes into sleeping/waiting state, this method is called.
 *
 *--------------------------------------
 * Inter Thread Communication - wait(), notify and notifyAll()
 *      TODO - Producer Consumer
 *
 * DeadLock - 2 Threads waiting for each other indefinately
 *          Synchronized keyword is the only reason for deadlock.
 * Starvation - Long waiting of a thread that ends at a certain time
 *
 * -------------------------------------
 * Thread Safety
 *      1.Synchronized - If a  method/block is synchronized, then only 1 thread can access it at a time
 *                       Performance barrier fo never use it
 *                       Implemented using lock mechanism
 *                       Same object but multiple threads
 *
 *          1.1 Synchronized method - public synchronized method(){}
 *          1.2 Synchronized block  - synchronized(this)
 *                  Only for objects and classes
 *
 * */

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Start thread..");
    }
}

class Mythread implements Runnable{

    @Override
    public void run() {

    }
}

public class Multithreading {
    public static void main(String[] args) {
        //Main thread

        //Child Thread
        MyThread thread1 = new MyThread();
        thread1.run();
        thread1.setPriority(Thread.MAX_PRIORITY);

        Mythread thread2 = new Mythread();
        thread2.run();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread");
            }
        });

        //Getting name
        Thread.currentThread().getName();

        //Setting Name
        Thread.currentThread().setName("Shantanu");
    }
}
