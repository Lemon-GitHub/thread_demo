package Thread_Demo;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0; i<10; i++) {
                        System.out.println(i);
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        //当前线程（代码行所在线程：main）阻塞等待，
        // 直到t线程执行完毕
//        t.join();
        //当前线程（代码行所在线程：main）阻塞等待，
        // 直到t线程执行完毕，或者给定时间已经到了（两者最小值）
        t.join(300000);
//        t.join(300);
        System.out.println("main");
    }
}
