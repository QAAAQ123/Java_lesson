package Thread;

//1. Thread클래스를 상속받는다.
//2. run메소드 오버라이딩 한다.
//동시에 실행시키고 싶은 코드를 작성한다.
public class MyThread extends Thread{
    private String str;

    public MyThread(String str){
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
