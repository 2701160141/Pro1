package Exercise;

public class Demo5 {
    static class threadDemo implements Runnable {
        private Thread beforeThread;

        public threadDemo(Thread beforeThread) {
            this.beforeThread = beforeThread;
        }

        @Override
        public void run() {
            if (beforeThread != null) {
                try {
                    beforeThread.join();
                    System.out.println("thread start:" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("thread start:" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        Thread T1 = new Thread(new threadDemo(null));
        Thread T2 = new Thread(new threadDemo(T1));
        Thread T3 = new Thread(new threadDemo(T2));
        T1.start();
        T2.start();
        T3.start();
    }
}
