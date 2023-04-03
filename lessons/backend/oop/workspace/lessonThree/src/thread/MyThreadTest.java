package thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        // run fonksiyonunu arka tarafta çalıştırır.
        thread.start();
        System.out.println("Sürüyor...");

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
