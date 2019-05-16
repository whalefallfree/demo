package com.example.demo.util.javaThread.线程生命周期;

public class ThreadLifeCycle {
    /**
     * 线程生命周期（状态）
     *
     * 当线程被创建并启动以后，它既不是已启动就进入了执行状态，也不是一直处于执行状态。
     * 在线程的生命周期中，它要经过新建（New）、就绪（Runnable）、运行（Running）、阻塞（Blocked）和死亡（Dead）5种状态。
     * 尤其是当线程启动以后，它不可能一直“霸占”着CPU独自运行，所以CPU需要在多条线程之间切换，于是线程状态也会多次在运行、阻塞之前切换。
     */
}
