import java.util.Random;
import java.util.Scanner;

public class Game {
    static Boolean 게임_종료 = false;
    static int 현재_소지한_골드 = 0;
    static int 현재_레벨 = 1;
    static int 메뉴_선택 = 0;
    static int 구매 = 0;
    static int 아이템_사용 = 0;

    static int bcaa = 0;
    static int 프로틴_보충제 = 0;
    static int 크레아틴 = 0;
    static int 탄수화물_보충제 = 0;

    static int 초급 = 0;

    static int 중급 = 0;

    static int 고급 = 0;

    static int 초월 = 0;

    public Game() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("=======================프롤로그=============================");
        System.out.println("");
        System.out.println("D-DAY 오늘부터 헬스장에서 운동 시작이다.");
        System.out.println("헬스장 앞에 도착하여 벨을 누른다.....");
        System.out.println("");
        System.out.println("직원: 어서오세요. 처음 방문하시나요?");
        System.out.println("네 헬스장 이용하려고 하는데 안내 부탁드립니다.");
        System.out.println("직원: 레벨 100이 될 때 까지 여기서 나가실 수 없습니다.");
        System.out.println("직원: 계속 진행을 원하시면 계약서에 서명 부탁드립니다.");

        while(!게임_종료) {
            String 이름 = 계약서(scanner);
            if (!이름.equals("")) {
                System.out.println("계약서 서명 " + 이름);
                System.out.println("게임을 시작하겠습니다.");
                메뉴바();
                메뉴_선택();
                가방();
            } else {
                System.out.println("게임을 종료하겠습니다.");
                break;
            }


        }

    }
    public static void 메뉴바() {
        System.out.println("============================게임 메뉴============================");
    }

    public static String 계약서(Scanner scanner) {
        String 서명 = scanner.nextLine();
        return 서명;
    }
    public static void 메뉴_선택() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.운동하기 2.가방 3.관장에게 의뢰하러 가기 4.상점 5.퀘스트 현황 6.능력치 확인 7.장비 슬롯 8.설정 9.주머니");
        System.out.println("어떤 것을 선택하시겠습니까?");
        메뉴_선택 = sc.nextInt();
        if (메뉴_선택 == 1) {
            System.out.println("1번 운동하기를 선택하셨습니다.");
            운동하기();
        } else if (메뉴_선택 == 2) {
            System.out.println("2번 아이템을 선택하셨습니다.");

        } else if (메뉴_선택 == 3) {
            System.out.println("3번 상점을 선택하셨습니다.");
            상점();
        } else if (메뉴_선택 == 4) {
            System.out.println("4번 퀘스트 현황을 선택하셨습니다.");
            퀘스트();
        } else if (메뉴_선택 == 5) {
            System.out.println("5번 능력치 확인을 선택하셨습니다.");
            능력치();
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }

    }
    public static void 운동하기() {
        Scanner sc = new Scanner(System.in);
        System.out.println("해당 장소로 이동하겠습니다.");
        System.out.println("운동을 실행하고자 한다면 1번을 눌러주세요.");
        int 운동_실행 = sc.nextInt();
        if (운동_실행 == 1) {
            System.out.println("");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static int 경험치(int 근력, int 중량) {
        return 근력-중량;
    }

    public static void 가방() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 것을 선택하시겠습니까?");
        System.out.println("1.아이템 2.장비 착용");
        int 가방_선택 = sc.nextInt();
        if (가방_선택 == 1) {
            System.out.println("아이템을 선택하셨습니다.");
            System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
            아이템_사용 = sc.nextInt();
            if (아이템_사용 == 1) {
                System.out.println("bcaa를 선택하셨습니다.");
                System.out.println("체력+1이 회복되었습니다.");
            } else if (아이템_사용 == 2) {
                System.out.println("탄수화물 보충제를 선택하셨습니다.");
                System.out.println("체력+2이 회복되었습니다.");
            } else if (아이템_사용 == 3) {
                System.out.println("프로틴을 선택하셨습니다.");
                System.out.println("근력+1이 증가되었습니다.");
            } else if (아이템_사용 == 4) {
                System.out.println("크레아틴을 선택하셨습니다.");
                System.out.println("근력+2이 증가되었습니다.");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (가방_선택 == 2) {
            System.out.println("장비 착용을 선택하셨습니다.");
        }

    }


    public static void 상점() {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 것을 구매하시겠습니까?");
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴 5.손목 보호대 6.리프팅 웨어 7.역도화 8.복압 벨트");
        구매 = sc.nextInt();
        if (구매 == 1) {
            System.out.println("bcaa를 구매하셨습니다.");
        } else if (구매 == 2) {
            System.out.println("탄수화물 보충제를 구매하셨습니다.");
        } else if (구매 == 3) {
            System.out.println("프로틴을 구매하셨습니다.");
        } else if (구매 == 4) {
            System.out.println("크레아틴을 구매하셨습니다.");
        } else if (구매 == 5) {
            System.out.println("손목 보호대를 구매하셨습니다.");
        } else if (구매 == 6) {
            System.out.println("리프팅 웨어를 구매하셨습니다.");
        } else if (구매 == 7) {
            System.out.println("역도화를 구매하셨습니다.");
        } else if (구매 == 8) {
            System.out.println("복압 벨트를 구매하셨습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static void 퀘스트() {

    }
    public static void 능력치() {
        Random 퀘스트_설정 = new Random();
        int 랜덤_퀘스트 = 퀘스트_설정.nextInt(6);
    }
    public static void 중량() {
    }

}