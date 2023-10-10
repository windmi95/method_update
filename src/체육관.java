import java.util.Scanner;

public class 체육관 {

    public void 바벨_무게() {
        if(현재_등급 == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("중량 1 ~ 10를 입력해주세요.");
            중량_선택 = sc.nextInt();
            System.out.println(중량_선택+"kg를 선택하셨습니다.");
            System.out.println("운동 장소로 이동하겠습니다.");
            if (중량_선택 >= 11) {
                System.out.println("현재 등급이 초급이기 때문에 중급 등급의 무게를 이용하실 수 없습니다.");
            }
        } else if (현재_등급 == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("중량 1 ~ 50을 입력해주세요.");
            중량_선택 = sc.nextInt();
            System.out.println(중량_선택+"kg를 선택하셨습니다.");
            System.out.println("운동 장소로 이동하겠습니다.");
            if (중량_선택 >= 51) {
                System.out.println("현재 등급이 중급이기 때문에 고급 등급의 무게를 이용하실 수 없습니다.");
            }
        } else if (현재_등급 == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("중량 1 ~ 70을 입력해주세요.");
            중량_선택 = sc.nextInt();
            System.out.println(중량_선택+"kg를 선택하셨습니다.");
            System.out.println("운동 장소로 이동하겠습니다.");
            if (중량_선택 >= 71) {
                System.out.println("현재 등급이 고급이기 때문에 초월 등급의 무게를 이용하실 수 없습니다.");
            }
        } else if (현재_등급 == 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println("중량 1 ~ 100을 입력해주세요.");
            중량_선택 = sc.nextInt();
            System.out.println(중량_선택+"kg를 선택하셨습니다.");
            System.out.println("운동 장소로 이동하겠습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
}
