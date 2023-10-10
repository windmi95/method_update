import java.util.Scanner;

public class 캐릭터 {
    Scanner scanner = new Scanner(System.in);
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 1;
    int 경험치 = 중량/2;
    int 현재_소지한_골드 = 5000;
    int 경험치양 = 0;
    int 레벨 = 1;
    int 중량_선택 =0;

    게임운영 운동메뉴선택 = new 게임운영();

    public void 운동진행() {
        운동메뉴선택.운동_메뉴_선택(scanner.nextInt());
    }
    public void 경험치_설정() {
        경험치 = 중량_선택 / 2;
        경험치양 = 경험치 + 경험치양;
        System.out.println("현재 경험치 => "+경험치양);

        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
        }
    }
    public void 체력_설정() {//객체 변수에 아무런 값이 없음
        if (체력 > 0) {
            체력 = 체력 - (중량_선택 - 근력);
            System.out.println("남은 체력 => "+ 체력);
        } else {
            System.out.println("체력이 부족합니다.");
        }
    }
    public int 무게_설정() {
    if(등급 == 1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("중량 1 ~ 10를 입력해주세요.");
        중량_선택 = sc.nextInt();
        System.out.println(중량_선택+"kg를 선택하셨습니다.");
        System.out.println("운동 장소로 이동하겠습니다.");
        if (중량_선택 >= 11) {
            System.out.println("현재 등급이 초급이기 때문에 중급 등급의 무게를 이용하실 수 없습니다.");
        }
    } else if (등급 == 2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("중량 1 ~ 50을 입력해주세요.");
        중량_선택 = sc.nextInt();
        System.out.println(중량_선택+"kg를 선택하셨습니다.");
        System.out.println("운동 장소로 이동하겠습니다.");
        if (중량_선택 >= 51) {
            System.out.println("현재 등급이 중급이기 때문에 고급 등급의 무게를 이용하실 수 없습니다.");
        }
    } else if (등급 == 3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("중량 1 ~ 70을 입력해주세요.");
        중량_선택 = sc.nextInt();
        System.out.println(중량_선택+"kg를 선택하셨습니다.");
        System.out.println("운동 장소로 이동하겠습니다.");
        if (중량_선택 >= 71) {
            System.out.println("현재 등급이 고급이기 때문에 초월 등급의 무게를 이용하실 수 없습니다.");
        }
    } else if (등급 == 4) {
        Scanner sc = new Scanner(System.in);
        System.out.println("중량 1 ~ 100을 입력해주세요.");
        중량_선택 = sc.nextInt();
        System.out.println(중량_선택+"kg를 선택하셨습니다.");
        System.out.println("운동 장소로 이동하겠습니다.");
    }
    return 무게_설정();
    }

}
