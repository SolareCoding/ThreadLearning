public class ExecuteSleepThread extends Thread {
    WaitAndSleep waitAndSleep;
    ExecuteSleepThread(WaitAndSleep waitAndSleep){
        this.waitAndSleep = waitAndSleep;
    }
    @Override
    public void run() {
        waitAndSleep.mySleep();
    }
}
