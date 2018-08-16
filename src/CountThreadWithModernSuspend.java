public class CountThreadWithModernSuspend extends Thread {

    private String name;
    private boolean suspendFlag = false;
    private boolean stopFlag = false;

    CountThreadWithModernSuspend(String name){
        this.name = name;
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify(); // 一定记得要唤醒
    }

    synchronized void myStop() {
        stopFlag = true;
        suspendFlag = false;
        notify();
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                    if(stopFlag){
                        break;
                    }
                }
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }


            System.out.println(name + " " + i);

            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "is ready to stop");
    }
}
