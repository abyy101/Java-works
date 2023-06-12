public class thread extends multithereading{

    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(i);

            thread.sleep(1000);
        }
    }
}
