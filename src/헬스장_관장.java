import java.util.Random;
import java.util.Scanner;

public class 헬스장_관장 {
    캐릭터 게임_캐릭터;
    Scanner sc;
    체육관 체육관;


    public 헬스장_관장() {
        게임_캐릭터 = new 캐릭터();
        sc = new Scanner(System.in);
        체육관 = new 체육관();
    }
    int 현재_횟수 = 0;
    int 남은_횟수 = 0;
    int 초급_심사_중량 = 10;
    int 중급_심사_중량 = 50;
    int 고급_심사_중량 = 70;
    int 초월_심사_중량 = 100;

    public void 퀘스트_목록() {
        System.out.println("1.퀘스트 2.승급 심사");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
    public void 퀘스트_유형_선택(int 퀘스트_번호_선택, int 캐릭터_레벨, int 캐릭터_등급) {
        if (퀘스트_번호_선택 == 1) {// 기본 퀘스트
            System.out.println("퀘스트를 진행하겠습니다.");
            System.out.println("중량은 등급에 맞게 원하는 무게를 사용할 수 있으며, 운동 횟수는 랜덤으로 설정됩니다.");
        } else if (퀘스트_번호_선택 == 2) {//승급 심사
            if (게임_캐릭터.등급 == 1 && 게임_캐릭터.레벨 == 30) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 10kg로 실행하며");
                System.out.println("제한시간 5분이 주어지고 운동 횟수 100개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (게임_캐릭터.등급 == 2 && 게임_캐릭터.레벨 == 50) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 50kg로 실행하며");
                System.out.println("제한시간 5분이 주어지고 운동 횟수 300개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (게임_캐릭터.등급 == 3 && 게임_캐릭터.레벨 == 70) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 70kg로 실행하며 제한시간 5분이 주어지고 1번 랜덤으로 5초동안 운동할 수 없습니다.");
                System.out.println("운동 횟수 400개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (게임_캐릭터.등급 == 4 && 게임_캐릭터.레벨 == 100) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 100kg로 실행하며 제한시간 5분이 주어지고 2번 랜덤으로 5초동안 운동할 수 없습니다.");
                System.out.println("운동 횟수 500개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else {
                System.out.println("승급 심사를 실행할 수 있는 단계가 아닙니다.");
            }
        }
    }
    public void 승급_가능_메시지_출력() {
        if (30 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 31) {//초급
            System.out.println("중급 심사를 진행하실 수 있습니다.");
        } else if (50 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 51) {//중급
            System.out.println("고급 심사를 진행하실 수 있습니다.");
        } else if (70 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 71) {//고급
            System.out.println("초월 심사를 진행하실 수 있습니다.");
        } else if (게임_캐릭터.레벨 <= 100) {
            System.out.println("최종 심사를 진행하실 수 있습니다.");
        }
    }
    public void 퀘스트_보상() {

    }
}