import java.util.Scanner;

public class 메뉴 {

    static int 메뉴_선택;
    String 메뉴바;

    public void 게임메뉴_선택() {
        운동 운동메뉴결정 = new 운동();
        this.메뉴_선택 = 메뉴_선택;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.운동하기 2.가방 3.의뢰 4.상점 5.퀘스트 현황 6.능력치 확인 7.장비 슬롯 8.게임 설정 9.퀵슬롯");
        System.out.println("어떤 것을 선택하시겠습니까?");
        메뉴_선택 = sc.nextInt();
        if (메뉴_선택 == 1) {
            System.out.println("1번 운동하기를 선택하셨습니다.");
            운동메뉴결정.운동실행();
        } else if (메뉴_선택 == 2) {
            System.out.println("2번 가방을 선택하셨습니다.");
        } else if (메뉴_선택 == 3) {
            System.out.println("3번 의뢰를 선택하셨습니다.");
        } else if (메뉴_선택 == 4) {
            System.out.println("4번 상점을 선택하셨습니다.");
        } else if (메뉴_선택 == 5) {
            System.out.println("5번 퀘스트 현황을 선택하셨습니다.");
        } else if (메뉴_선택 == 6) {
            System.out.println("6번 능력치 확인을 선택하셨습니다.");
        } else if (메뉴_선택 == 7) {
            System.out.println("7번 장비 슬롯을 선택하셨습니다.");
        } else if (메뉴_선택 == 8) {
            System.out.println("8번 설정을 선택하셨습니다.");
        } else if (메뉴_선택 == 9) {
            System.out.println("9번 퀵슬롯을 선택하셨습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static String 게임메뉴_꾸미기() {
        System.out.println("");
        return ("============================게임 메뉴============================");
    }


}