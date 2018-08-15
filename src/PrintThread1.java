
public class PrintThread1 extends Thread {

    PrintClass printClass;

    PrintThread1(PrintClass printClass){
        this.printClass = printClass;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 999; i = i + 2){
            printClass.thread1Print(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
