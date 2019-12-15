package Thread_Demo;

public class UnsafeTest {
    // 1. 初始化变量值
    // 2. 启动20个线程 每个线程对这个值++
    // 执行10000次

    private  static  int COUNT = 0;

    public static void main(String[] args) {
        Object o = new Object();
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        synchronized (o) {
                        COUNT++;
                        }
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
