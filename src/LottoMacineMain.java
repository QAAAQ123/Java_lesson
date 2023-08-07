import java.util.Random;
public class LottoMacineMain extends LottoMachineImpl {
    public static void main(String args[]){
        Ball[] balls = new Ball[45];
        for(int i = 0; i< 45;i++){
            balls[i] = new Ball(i+1);
        }

        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix(new Random());
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i< result.length;i++){
            System.out.println(result[i].getNumber());
        }
    }
}
