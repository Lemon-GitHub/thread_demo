package Thread_Demo;

public class SafeTest {

    private  static  int COUNT = 0;

    public static synchronized void increment() {
        COUNT++;
    }
    public static synchronized void decrement() {
        COUNT--;
    }

    public static void main(String[] args) {
        Object o = new Object();
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0; j < 10000; j++) {
                        increment();
                        decrement();
                    }
                }
            }).start();
        }

        // 使用debug方式启动
        while (Thread.activeCount() > 1) {
            Thread.yield(); // 当前线程让步，运行态转为就绪态
        }
        System.out.println(COUNT);
    }
}
