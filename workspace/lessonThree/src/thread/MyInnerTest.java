package thread;

public class MyInnerTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                work();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        exexute();
    }

    private static void exexute(){
        while (true) {
            try {
                System.out.println("Sürüyor....");
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void work(){
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
