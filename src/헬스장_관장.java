import java.util.Random;
import java.util.Scanner;

public class 헬스장_관장 {
    Scanner sc = new Scanner(System.in);
    캐릭터 현재_등급 = new 캐릭터();
    캐릭터 현재_레벨 = new 캐릭터();
    캐릭터 승급심사_운동실행 = new 캐릭터();
    캐릭터 남은_체력 = new 캐릭터();

    int 남은횟수;

    public void 의뢰() {
        Random 운동횟수 = new Random();

        System.out.println("관장: 퀘스트를 진행하겠는가?");
        System.out.println("1. 진행 2. 거부");
        int 퀘스트_선택 = sc.nextInt();
        if (퀘스트_선택 == 1) {
            System.out.println("좋아 그렇다면 퀘스트를 주겠다.");
            int 랜덤_운동횟수 = 운동횟수.nextInt(5)*100;


        } else if (퀘스트_선택 == 2) {
            System.out.println("그래 다음에 또 오게나.");
        }


    }
    public void 승급심사() {
        if (30 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 31) {//초급
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            int 승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("제한시간 5분이 주어지고 100개를 실행하지 못할 경우 다시 도전해야합니다.");

                System.out.println("분 입력: ");
                int 분 = sc.nextInt();
                int 초 = 분 * 60;
                for(int i = 초; i > 0; i--) {
                    System.out.println(i / 60+ " 분"+ i % 60 + " 초");
                }
            } else if (승급_심사_선택 == 2) {
                System.out.println("메뉴로 돌아가겠습니다.");
                System.out.println();
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println("승급 심사를 진행하실 수 있습니다.");
                System.out.println("승급 심사를 진행하시겠습니까?");
                System.out.println("1번 진행한다. 2번 진행하지 않는다.");
                return;
            }
        } else if (50 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 51) {//중급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            int 승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (70 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 101) {//고급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            int 승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (현재_레벨.레벨 >= 101) {
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            int 승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        if (현재_등급.등급 == 1) {
            Random 승급심사_운동횟수_결정 = new Random();


        } else {
            System.out.println("게임 메뉴로 이동합니다.");
        }
    }
    public void 승급심사_진행() {
        Scanner sc = new Scanner(System.in);
        승급심사_운동실행.운동진행();
        if () {
            if (남은_체력.체력 > 0) {
                남은_체력.체력 = 남은_체력.체력 - (초보_심사_중량 - 근력);
                현재_횟수++;
                남은_횟수 = 100;
                System.out.println("남은 체력 => "+ 남은_체력.체력);
                System.out.println("현재 횟수 => "+ 현재_횟수);
                for (int i = 남은_횟수; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println("승급 심사를 통과하셨습니다.");
                        System.out.println("중급으로 등급이 상승되었습니다.");
                        현재_등급 = 1;
                    } else {
                        System.out.println("승급 심사를 통과하지 못하였습니다.");
                    }
                }
            }
        else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }

    }

}
