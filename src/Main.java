public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyNumber myNumber = new MyNumber();
//        Thread thread1 = new MyThreadEdition2(myNumber);
//        Thread thread2 = new MyThreadEdition2(myNumber);
////        Thread thread1 = new Thread(new MyThread(myNumber));
////        Thread thread2 = new Thread(new MyThread(myNumber));
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
        //System.out.println(myNumber.myNumber);
//        PrintClass printClass = new PrintClass();
//        PrintThread1 thread1  = new PrintThread1(printClass);
//        PrintThread2 thread2 = new PrintThread2(printClass);
//        PrintThread3 thread3 = new PrintThread3(printClass);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        WaitAndSleep waitAndSleep = new WaitAndSleep();
//        ExecuteSleepThread executeSleepThread = new ExecuteSleepThread(waitAndSleep);
//        ExecuteWaitThread executeWaitThread = new ExecuteWaitThread(waitAndSleep);
//        executeWaitThread.start();
//        executeSleepThread.start();

//        CountThread countThread1 = new CountThread("Thread1:");
//        CountThread countThread2 = new CountThread("Thread2:");
//        countThread1.start();
//        countThread2.start();
//        Thread.sleep(1000);
//        countThread1.suspend();
//        Thread.sleep(1000);
//        countThread1.resume();
//        countThread2.suspend();
//        Thread.sleep(1000);
//        countThread2.resume();
//
//        countThread1.join();
//        countThread2.join();
//        System.out.println("All thread ended");

        CountThreadWithModernSuspend countThread1 = new CountThreadWithModernSuspend("Thread1:");
        CountThreadWithModernSuspend countThread2 = new CountThreadWithModernSuspend("Thread2:");
        countThread1.start();
        countThread2.start();
        Thread.sleep(1000);
        countThread1.mySuspend();
        Thread.sleep(1000);
        countThread1.myResume();
        countThread2.mySuspend();
        Thread.sleep(1000);

        countThread2.myStop();

        countThread1.join();
        countThread2.join();
        System.out.println("All thread ended");
    }
}
