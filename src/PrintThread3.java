public class PrintThread3 extends Thread{
    PrintClass printClass;

    PrintThread3(PrintClass printClass){
        this.printClass = printClass;
    }

    @Override
    public void run() {
        for(int i = 3; i < 1000; i = i + 3){
            printClass.thread3Print(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
