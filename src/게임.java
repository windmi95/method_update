import java.util.Random;
import java.util.Scanner;

public class 게임 {


     int 중량_선택 = 0;

     int 승급_심사_선택 = 0;

     int 경험치 = 0;

     int bcaa_개수 = 0;

     int 탄수화물_보충제_개수 = 0;

     int 프로틴_개수 = 0;

     int 크레아틴_개수 = 0;

     int bcaa_사용한_개수 = 0;

     int 탄수화물_보충제_사용한_개수 = 0;

     int 프로틴_사용한_개수 = 0;

     int 크레아틴_사용한_개수 = 0;

     int bcaa_메뉴_선택 = 0;

     int 탄수화물_보충제_메뉴_선택 = 0;

     int 프로틴_메뉴_선택 = 0;

     int 크레아틴_메뉴_선택 = 0;

     int bcaa_사용_계산 = 0;

     int 경험치양 = 0;

     int 참여여부 = 0;

     int 구매개수 = 0;

     int 랜덤뽑기 = 0;

     boolean 상품구매 = false;

    int 남은_횟수 = 0;

    int 현재_횟수 = 0;

    int 승급_심사_메뉴_선택 = 0;

    int 초보_심사_중량 = 10;

    }



    public static void 장비_슬롯() {

    }

    public void 승급심사_설정() {
        Scanner sc = new Scanner(System.in);
        승급_심사_메뉴_선택 = sc.nextInt();
        System.out.println("1.운동 실행 2.아이템 사용 3.게임에서 나가기");
        if (승급_심사_메뉴_선택 == 1) {
            if (체력 > 0) {
                체력 = 체력 - (초보_심사_중량 - 근력);
                현재_횟수++;
                남은_횟수 = 100;
                System.out.println("남은 체력 => "+ 체력);
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
        } else if (승급_심사_메뉴_선택 == 2) {



        } else if (승급_심사_메뉴_선택 == 3) {
            System.out.println("메인 메뉴로 이동합니다.");

        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }

    }
    public void 승급심사() {
        Scanner sc = new Scanner(System.in);
        if (30 <= 현재_레벨 && 현재_레벨 < 31) {//초급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
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
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println("승급 심사를 진행하실 수 있습니다.");
                System.out.println("승급 심사를 진행하시겠습니까?");
                System.out.println("1번 진행한다. 2번 진행하지 않는다.");
                return;
            }
        } else if (50 <= 현재_레벨 && 현재_레벨 < 51) {//중급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (70 <= 현재_레벨 && 현재_레벨 < 101) {//고급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (현재_레벨 >= 100) {
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        if (현재_등급 == 1) {
            Random 승급심사_운동횟수_결정 = new Random();
            승급_레벨();

        } else {
            System.out.println("게임 메뉴로 이동합니다.");
        }
    }
    public static void 등급() {

    }
}
