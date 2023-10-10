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


    public static void 상점() {
        Scanner sc = new Scanner(System.in);
        구매 = sc.nextInt();
        if (구매 == 1) {
            System.out.println("bcaa를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            구매개수 = sc.nextInt();
            int 총금액 = bcaa * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(bcaa * 구매개수);
                System.out.println(계산);
                bcaa_개수 = bcaa_개수 + 구매개수;
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 2) {
            System.out.println("탄수화물 보충제 몇 개를 구매하시겠습니까?");
            구매개수 = sc.nextInt();
            int 총금액 = 탄수화물_보충제 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(탄수화물_보충제 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 3) {
            System.out.println("프로틴을 구매하셨습니다.");
            구매개수 = sc.nextInt();
            int 총금액 = 프로틴 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(프로틴 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 4) {
            System.out.println("크레아틴을 구매하셨습니다.");
            구매개수 = sc.nextInt();
            int 총금액 = 크레아틴 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드 - (크레아틴 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 5) {
            System.out.println("손목 보호대를 구매하셨습니다.");
            if (현재_소지한_골드 >= 손목보호대) {
                int 계산 = 현재_소지한_골드-손목보호대;
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 6) {
            if (상품구매 == false) {
                System.out.println("리프팅 웨어를 구매하셨습니다.");
                if (현재_소지한_골드 >= 리프팅웨어) {
                    int 계산 = 현재_소지한_골드 - 리프팅웨어;
                    System.out.println();
                    System.out.println(계산);
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            } else {
                System.out.println("등급이 낮기 때문에 구매하실 수 없습니다.");
            }
        } else if (구매 == 7) {
            if (상품구매 == false) {
                System.out.println("역도화를 구매하셨습니다.");
                if (현재_소지한_골드 >= 역도화) {
                    int 계산 = 현재_소지한_골드 - 역도화;
                    System.out.println(계산);
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            }
        } else if (구매 == 8) {
            if (상품구매 == false) {
                System.out.println("복압 벨트를 구매하셨습니다.");
                int 총금액 = 복압벨트;
                if (현재_소지한_골드 >= 복압벨트) {
                    int 계산 = 현재_소지한_골드 - 복압벨트;
                    System.out.println(계산);
                  } else {
                    System.out.println("골드가 부족합니다.");
                }
            }
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static void 장비_슬롯() {

    }


    public static void 등급() {

    }
}
