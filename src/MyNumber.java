public class MyNumber {
    public int myNumber = 0;
    public synchronized void addNumber(){
            myNumber = myNumber + 1;
    }
}
