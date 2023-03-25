package thread;

public class MyLambdaTest {
    public static void main(String[] args) {
        /*Runnable runnable = () -> work();
        Thread thread = new Thread();
        thread.start();*/

        /*Thread thread2 = new Thread(() -> work());
        thread2.start();
        exexute();*/

        new Thread(()->work()).start();
        exexute();

    }

    private static void exexute() {
        while (true) {
            try {
                System.out.println("Sürüyor....");
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void work() {
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
