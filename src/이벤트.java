import java.util.Random;
import java.util.Scanner;

//운동 실행 중 랜덤으로 이벤트가 실행되는 클래스
public class 이벤트 {
    게임운영 운동메뉴선택 = new 게임운영();
    Scanner scanner = new Scanner(System.in);
    int 이벤트_참여_선택;

    public int 이벤트_실행() {
    Random random  = new Random();
    int 이벤트확률 = random.nextInt(10);
    if(이벤트확률 < 5) {
        System.out.println("골드를 획득할 수 있는 깜짝 이벤트가 있습니다. 참여를 하실 것인지 선택해주세요.");
        System.out.println("이벤트에 참여하시겠습니까?");
        System.out.println("1.참여한다. 2번 참여하지 않는다.");
        이벤트_참여_선택 = scanner.nextInt();
        if (이벤트_참여_선택 == 1) {
            System.out.println("");
        }
    } else if (이벤트확률 > 5) {
        운동메뉴선택.운동_메뉴_선택(scanner.nextInt());
    }
        return 이벤트확률;
    }
}
