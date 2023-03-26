package thread;

public class MyRunnable implements Runnable{
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
}
