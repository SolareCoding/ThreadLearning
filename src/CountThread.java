public class CountThread extends Thread {

    String name;

    CountThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 15; i++){
            System.out.println(name + " "  + i);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
