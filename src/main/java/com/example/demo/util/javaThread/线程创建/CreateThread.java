package com.example.demo.util.javaThread.线程创建;

public class CreateThread {
    /**
     * Java线程实现/创建方式
     *
     * 1.继承Thread类
     *
     * Thread类本质上是实现了Runnable接口的一个实例，代表一个线程的示例。
     * 启动线程的唯一方法就是通过Thread类的start（）实例方法。
     * start（）方法是一个native方法，它将启动一个新线程并执行run（）方法
     *
     * 2.实现Runnable接口
     * 如果当前类已经继承了别的类，不能再继承 Thread ，这时可以实现Runnable接口
     *
     * 3.基于线程池的方式
     * 线程和数据库连接这些资源都是非常宝贵的资源。每次需要的时候创建，不需要的时候销毁，是非常浪费资源的。
     * 可以使用缓存的策略，也就是使用线程池
     */

    /**
     * 有返回值的任务必须实现Callable接口
     * 无返回值的任务必须实现Runnable接口
     *
     * 执行Callable任务后，可以获取一个Future的对象，在该对象上调用get就可以获取到Callable任务返回的Object，再结合线程池接口ExectorService就可以实现有返回结果的多线程
     */
}
