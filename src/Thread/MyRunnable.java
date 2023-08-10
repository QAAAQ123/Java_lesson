package Thread;

public class MyRunnable implements Runnable{
    private String str;

    public MyRunnable(String str){
        this.str = str;
    }
 
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("---" + name + "---");
        for(int i = 0;i < 10; i++){
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     }
}
