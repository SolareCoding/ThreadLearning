public class PrintThread2 extends Thread {

    PrintClass printClass;

    PrintThread2(PrintClass printClass){
        this.printClass = printClass;
    }

    @Override
    public void run() {
        for(int i = 2; i <= 1000; i = i + 2){
            printClass.thread2Print(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
