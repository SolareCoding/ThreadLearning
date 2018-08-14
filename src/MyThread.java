public class MyThread implements Runnable {

    MyNumber myNumber;

    MyThread(MyNumber myNumber){
        this.myNumber = myNumber;
    }

    public void run() {
        for(int i = 0; i < 1000; i++){
            myNumber.addNumber();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
