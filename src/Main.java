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
//        thread1.start();
//        thread2.start();
        WaitAndSleep waitAndSleep = new WaitAndSleep();
        ExecuteSleepThread executeSleepThread = new ExecuteSleepThread(waitAndSleep);
        ExecuteWaitThread executeWaitThread = new ExecuteWaitThread(waitAndSleep);
        executeWaitThread.start();
        executeSleepThread.start();
    }
}
