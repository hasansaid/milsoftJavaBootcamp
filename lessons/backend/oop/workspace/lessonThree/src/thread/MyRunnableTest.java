package thread;

public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println("Koşuyor....");
                        Thread.sleep(500);
                    } catch (InterruptedException exception){
                        exception.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        while (true) {
            try {
                System.out.println("Sürüyor....");
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
