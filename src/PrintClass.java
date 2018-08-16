public class PrintClass {
    int printedStatus = 1;
    synchronized void thread1Print(int number){
        while(printedStatus != 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        printedStatus = 2;
        notifyAll();
    }

    synchronized void thread2Print(int number){
        while(printedStatus != 2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        printedStatus = 3;
        notifyAll();
    }

    synchronized void thread3Print(int number){
        while(printedStatus != 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        printedStatus = 1;
        notifyAll();
    }
}
