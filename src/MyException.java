public class MyException extends RuntimeException {
    //오류 메시지,발생한 exception을 감싼결과로 내가 만든 exception을 사용하고 싶을때
    
    public MyException(String message){
        super(message);
    }

    public MyException(Throwable cause){
        super(cause); 
    }
}
