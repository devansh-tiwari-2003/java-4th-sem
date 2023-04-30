public class ThreadDemo implements Runnable {
    private Thread thread;
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public static void main(String args[]) {
        ThreadDemo td1 = new ThreadDemo("Riya");
        td1.start();
        ThreadDemo td2 = new ThreadDemo("Aggarwal");
        td2.start();
    }
}
