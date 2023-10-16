import java.util.Random;
import java.util.Scanner;

//운동 실행 중 랜덤으로 이벤트가 실행되는 클래스
public class 이벤트 {
    게임운영 게임_진행 = new 게임운영();
    캐릭터 게임_캐릭터 = new 캐릭터();
    Scanner scanner = new Scanner(System.in);
    Random 뽑기 = new Random();

    int 이벤트_참여_선택;
    int 랜덤뽑기;



    public int 이벤트_실행() {
    Random random  = new Random();
    int 이벤트확률 = random.nextInt(10);
    if(이벤트확률 < 5) {
        System.out.println("골드를 획득할 수 있는 깜짝 이벤트가 있습니다. 참여를 하실 것인지 선택해주세요.");
        System.out.println("이벤트에 참여하시겠습니까?");
        System.out.println("1.참여한다. 2번 참여하지 않는다.");
        이벤트_참여_선택 = scanner.nextInt();
        if (이벤트_참여_선택 == 1) {
            System.out.println("이벤트를 실행하겠습니다.");
            System.out.println("이벤트의 경우 랜덤으로 당첨 혹은 꽝이 나옵니다.");
            System.out.println("추가적으로 꽝일 경우 체력의 1/2가 감소됩니다.");
            랜덤뽑기 = 뽑기.nextInt(10);
            if (랜덤뽑기 <= 4) {
                Random 당첨금 = new Random();
                int 당첨금_뽑기 = 당첨금.nextInt(100)*100;
                System.out.println(당첨금_뽑기+ "골드를 획득하셨습니다.");
            } else if (랜덤뽑기 >= 5) {
                게임_캐릭터.체력 = 게임_캐릭터.체력 - 10;
                System.out.println("체력이 " + 게임_캐릭터.체력 + " 차감되었습니다." );
            }
        } else if (이벤트_참여_선택 == 2) {

        }
    } else if (이벤트확률 > 5) {
        게임_진행.운동_메뉴_선택(scanner.nextInt());
    }
        return 이벤트확률;
    }
}
