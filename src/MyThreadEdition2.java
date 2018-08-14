public class MyThreadEdition2 extends Thread {

    MyNumber myNumber;

    MyThreadEdition2(MyNumber myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            synchronized (myNumber){
                myNumber.addNumber();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
