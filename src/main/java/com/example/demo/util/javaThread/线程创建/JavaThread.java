package com.example.demo.util.javaThread.线程创建;

public class JavaThread {
    public static void main(String[] args) {
        // 继承Thread类
//        MyThread myThread = new MyThread();
//        myThread.start();

        // 实现Runnable接口
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        // 事实上，当传入一个Runnable target参数给Thread后，Thread的run（）方法就会调用target.run()
//        public void run(){
//            if(target!=null){
//                target.run();
//            }
//        }

    }
}
