public class Exception {
    public static void main(String args[]){
        Exceptionobj exobj = new Exceptionobj();
        try{
            int value = exobj.divide(10,0);
            System.out.println(value);
        }catch(ArithmeticException ex){
            System.out.println("0으로 나눌수 없습니다.");
        }
        
    }

}

class Exceptionobj{
    /**
     * 
     * i를 k로 나눈 나머지를 반환한다. 
     * @throws ArithmeticException
     */
    public int divide(int i,int k) throws ArithmeticException{
        int value = 0;
        value = i / k;
        return value;
    }
}
