package Thread;
//1초마다 *,+를 동시에 10번 출력하는 프로그램 작성
public class MyThreadExam {
    public static void main(String args[]){
        String name = Thread.currentThread().getName();
        System.out.println("thread name: " + name);
        System.out.println("Start!"); 
        
        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        //thread는 start메소드로 실행한다.
        mt1.start();
        mt2.start();
        //총 스레드는 3개(main,mt1,mt2)
        System.out.println("end");
        }
         
    }
