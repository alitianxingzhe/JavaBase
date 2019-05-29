package com.kevin.thread;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/7
 */
public class Demo {

    /**
     *  核心概念：线程就是独立的执行路径；
     *      在程序运行时，即使没有自己创建线程，后台也会存在多个线程，如gc线程、主线程；main()称之为主线程,为系统的入口点，用于执行整个程序；
     *      在一个进程中，如果开辟了多个线程，线程的运行由调度器安排调度，调度器是与操作系统紧密相关的，先后顺序是不能人为的干预的；
     *      对同一份资源操作时，会存在资源抢夺的问题，需要加入并发控制;
     *      线程会带来额外的开销,如cpu调度时间,并发控制开销每个线程在自己的工作内存交互，加载和存储主内存控制不当会造成数据不一致。
     *
     *  创建线程的方法有三种：
     *      继承Thread
     *      实现Runnable接口
     *      实现Callable接口
     *
     *  线程的五种基本状态：
     *      新建状态（New）：当线程对象对创建后，即进入了新建状态，如：Thread t = new MyThread();
     *      就绪状态（Runnable）：当调用线程对象的start()方法（t.start();），线程即进入就绪状态。处于就绪状态的线程，只是说明此线程已经做好了准备，随时等待CPU调度执行，并不是说执行了t.start()此线程立即就会执行；
     *      运行状态（Running）：当CPU开始调度处于就绪状态的线程时，此时线程才得以真正执行，即进入到运行状态。注：就绪状态是进入到运行状态的唯一入口，也就是说，线程要想进入运行状态执行，首先必须处于就绪状态中；
     *      阻塞状态（Blocked）：处于运行状态中的线程由于某种原因，暂时放弃对CPU的使用权，停止执行，此时进入阻塞状态，直到其进入到就绪状态，才有机会再次被CPU调用以进入到运行状态。根据阻塞产生的原因不同，阻塞状态又可以分为三种：
     *          1.等待阻塞：运行状态中的线程执行wait()方法，使本线程进入到等待阻塞状态；
     *          2.同步阻塞 -- 线程在获取synchronized同步锁失败(因为锁被其它线程所占用)，它会进入同步阻塞状态；
     *          3.其他阻塞 -- 通过调用线程的sleep()或join()或发出了I/O请求时，线程会进入到阻塞状态。当sleep()状态超时、join()等待线程终止或者超时、或者I/O处理完毕时，线程重新转入就绪状态。
     *      死亡状态（Dead）：线程执行完了或者因异常退出了run()方法，该线程结束生命周期。
     *
     *
     *
     *
     */

}