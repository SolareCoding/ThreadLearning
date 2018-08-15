public class PrintClass {
    boolean thread1Printed = false;
    synchronized void thread1Print(int number){
        while(thread1Printed){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        thread1Printed = true;
        notify();
    }

    synchronized void thread2Print(int number){
        while(!thread1Printed){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(number + " ");
        thread1Printed = false;
        notify();
    }
}
