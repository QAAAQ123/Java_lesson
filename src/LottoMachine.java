/*인터페이스로 로또기계 구현
 * 1. 1~45까지 써있는 Ball을 로또 기계에 넣는다
 * 2. 로또 기계에 있는 Ball을 섞는다.
 * 3. 섞인 Ball중에서 6개를 꺼낸다.
 */
import java.util.Random;
public interface LottoMachine {
    int MAX_BALL_COUNT = 45;//public static 생략
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls);//볼 만들기
    public void mix(Random random);//볼 섞기
    public Ball[] getBalls(); //6개의 볼을 반환
}
