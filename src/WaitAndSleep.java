import static java.lang.Thread.sleep;

public class WaitAndSleep {
    synchronized void mySleep() {
        System.out.println("Sleep start at: " + System.currentTimeMillis());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep end__ at: " + System.currentTimeMillis());
    }

    synchronized void myWait(){
        System.out.println("Wait_ start at: " + System.currentTimeMillis());
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wait_ end__ at: " + System.currentTimeMillis());
    }

    void myWaitWithoutSynchronized(){
        System.out.println("Wait_ end__ at: " + System.currentTimeMillis());
    }
}
