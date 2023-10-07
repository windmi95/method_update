import java.util.Scanner;
//게임 전반적인 운영을 담당하는 클래스

public class 게임운영 {

    public void 프롤로그() {

    }





    public int 메인_메뉴_선택(int 메인_메뉴_선택지) {
        System.out.println("");
    }



    public int 운동_메뉴_선택(int 운동_메뉴_선택지) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.운동 실행 2.아이템 사용 3.중량 변경 4.게임에서 나가기");
        운동_메뉴_선택지 = sc.nextInt();
        switch (운동_메뉴_선택지) {
            case 1:
                System.out.println("운동을 실행하러 이동");
                break;
            case 2:
                System.out.println("아이템을 사용");
                break;
            case 3:
                System.out.println("중량을 변경합니다.");
                break;
            case 4:
                System.out.println("게임플레이를 취소하였습니다.");
                break;
        }
        return 운동_메뉴_선택지;
    }
}
