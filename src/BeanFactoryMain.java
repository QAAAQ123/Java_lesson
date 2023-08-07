public class BeanFactoryMain {
    public static void main(String args[]){
        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if(bf1 == bf2){
            System.out.println("bf1 == bf2");
        }
        Bus b1 = bf1.getBus(); //생성과정을 다른 클래스에서 해준다->팩토리
        Bus b2 = bf1.getBus();
    }
}
