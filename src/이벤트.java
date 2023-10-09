import java.util.Random;

//운동 실행 중 랜덤으로 이벤트가 실행되는 클래스
public class 이벤트 {
    public int 이벤트_실행(캐릭터 캐릭터_이벤트) {
    Random random  = new Random();
    int 이벤트확률 = random.nextInt(10);
    if(이벤트확률 < 5) {
        System.out.println("이벤트가 실행됩니다. ");
        System.out.println("이벤트에 참여하시겠습니까?");

    } else if (이벤트확률 > 5) {

    }
        return 이벤트확률;
    }
}
