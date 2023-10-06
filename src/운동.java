import java.util.Scanner;

public class 운동 {
    static int 운동_메뉴_선택;

public void 운동실행() {
        int 운동메뉴선택 = this.운동_메뉴_선택;
        운동_메뉴_선택 = 운동_메뉴_선택;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.운동 실행 2.아이템 사용 3.중량 변경 4.게임에서 나가기");
        운동_메뉴_선택 = sc.nextInt();
        if (운동_메뉴_선택 == 1) {
            System.out.println("운동을 실행하겠습니다.");
        } else if (운동_메뉴_선택 == 2) {
            System.out.println("아이템을 사용합니다.");
        } else if (운동_메뉴_선택 == 3) {
            System.out.println("중량을 변경합니다.");
        } else if (운동_메뉴_선택 == 4) {
            System.out.println("게임플레이를 취소하였습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }

}


