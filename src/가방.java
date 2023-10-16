import java.util.Scanner;

public class 가방 {//아이템 관리하는 클래스
    Scanner sc = new Scanner(System.in);
    int 보유한_bcaa_개수 = 5;
    int 보유한_탄수화물_보충제_개수;
    int 보유한_프로틴_개수 = 5;
    int 보유한_크레아틴_개수;
    캐릭터 게임_캐릭터 = new 캐릭터();

    public int 아이템_사용 (int 사용할_소모품_선택) {
        System.out.println("");
        System.out.println("======================소모품 선택======================");
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 소모품을 선택하시겠습니까?");
        if (사용할_소모품_선택 == 1) {
            System.out.println("아이템을 선택하셨습니다.");
            int 아이템_사용 = sc.nextInt();
            if (아이템_사용 == 1) {
                게임_캐릭터.체력 = 게임_캐릭터.체력+1;
                }
            } else if (사용할_소모품_선택 == 2) {
                if (보유한_탄수화물_보충제_개수 > 0) {
                    System.out.println("탄수화물 보충제를 선택하셨습니다. (" +"보유한 개수 " + 보유한_탄수화물_보충제_개수 +"개"+")");
                    System.out.println("체력+3이 회복되었습니다.");
                    게임_캐릭터.체력 = 게임_캐릭터.체력 + 3;
                }
            } else if (사용할_소모품_선택 == 3) {
                if (보유한_프로틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 보유한_프로틴_개수 +"개"+")");
                    System.out.println("근력+1이 증가되었습니다.");
                    게임_캐릭터.근력 = 게임_캐릭터.근력 + 1;
                }
            } else if (사용할_소모품_선택 == 4) {
                if (보유한_크레아틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 보유한_크레아틴_개수 +"개"+")");
                    System.out.println("근력+3이 증가되었습니다.");
                    게임_캐릭터.근력 = 게임_캐릭터.근력 + 3;
                }
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        return 사용할_소모품_선택;
    }

}

