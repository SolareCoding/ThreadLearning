public class ExecuteWaitThread extends Thread {

    WaitAndSleep waitAndSleep;
    ExecuteWaitThread(WaitAndSleep waitAndSleep){
        this.waitAndSleep = waitAndSleep;
    }

    @Override
    public void run() {
        waitAndSleep.myWait();
    }
}
