package Thread_Demo;
// 线程的特点：CPU调度的最小单位
// 创建线程
// 方法二：创建线程实现runnable接口

public class CreateRunnableTest {
    public static void main(String[] args) {
        Thread t = new Thread(
                new MyRunnable(),"我的线程");
        t.start();
        System.out.println("main方法中："+Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable中："+Thread.currentThread().getName());
    }
}