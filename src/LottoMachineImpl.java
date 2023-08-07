import java.util.Random;
public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    public void setBalls(Ball[] balls){
        this.balls = balls;
    }

    public void mix(Random random){
        for(int i = 0;i < 10000;i++){
            int x1 =random.nextInt(MAX_BALL_COUNT);
            int x2 =random.nextInt(MAX_BALL_COUNT);
            if(x1 != x2){
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }

    }

    public Ball[] getBalls(){
        Ball[] result = new Ball[6];//Ball6개를 참조
        for(int  i = 0; i< 6;i++){
            result[i] = balls[i];
        }
        return result;
    }
}
