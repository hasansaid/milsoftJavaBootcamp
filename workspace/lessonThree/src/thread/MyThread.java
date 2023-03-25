package thread;

public class MyThread extends Thread {
    @Override
    public void run(){

        while (true){
           try {
               System.out.println("Koşuyor....");
               Thread.sleep(750);
           } catch (InterruptedException exception){
               exception.printStackTrace();
           }

        }
    }
}
