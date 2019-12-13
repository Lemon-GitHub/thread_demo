package Thread_Demo;
// 创建线程
// 方法一：定义线程的子类、继承线程Thread  复写run方法

// 使用start 不用run

public class CreateThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread("我的线程");
        //thread.run(); // 一直在run中循环 没有退出
        thread.start(); // 启动的子线程和主线程是同时执行的  调用main...

        // main （Java级别 主线程结束 子线程进行
        while (true) {

        }
    }
}


class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        //System.out.println();
        while (true) {

        }
    }


}