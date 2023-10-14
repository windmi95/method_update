import java.util.Scanner;

public class 가방 {//아이템 관리하는 클래스
    Scanner sc = new Scanner(System.in);
    int 소지한_bcaa_개수 = 5;
    int 소지한_탄수화물_보충제_개수;
    int 소지한_프로틴_개수 = 5;
    int 소지한_크레아틴_개수;
    캐릭터 캐릭터_체력 = new 캐릭터();
    캐릭터 캐릭터_근력 = new 캐릭터();

    public void 소모품_목록 () {//운동 실행 시 아이템 사용

    }
    public void 아이템_사용 () {
        System.out.println("");
        System.out.println("어떤 것을 선택하시겠습니까?");
        System.out.println("1.아이템 2.장비");
        int 가방_선택 = sc.nextInt();
        if (가방_선택 == 1) {
            System.out.println("아이템을 선택하셨습니다.");
            System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
            int 아이템_사용 = sc.nextInt();
            if (아이템_사용 == 1) {
                if (소지한_bcaa_개수 > 0) {
                    System.out.println("체력+1이 회복되었습니다.");
                    캐릭터_체력.체력 = 캐릭터_체력.체력+1;
                } else {
                    System.out.println("개수가 부족합니다.");
                }
            } else if (아이템_사용 == 2) {
                if (소지한_탄수화물_보충제_개수 > 0) {
                    System.out.println("탄수화물 보충제를 선택하셨습니다. (" +"보유한 개수 " + 소지한_탄수화물_보충제_개수 +"개"+")");
                    System.out.println("체력+3이 회복되었습니다.");
                    캐릭터_체력.체력 = 캐릭터_체력.체력+3;
                }
            } else if (아이템_사용 == 3) {
                if (소지한_프로틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 소지한_프로틴_개수 +"개"+")");
                    System.out.println("근력+1이 증가되었습니다.");
                    캐릭터_근력.근력 = 캐릭터_근력.근력+1;
                }
            } else if (아이템_사용 == 4) {
                if (소지한_크레아틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 소지한_크레아틴_개수 +"개"+")");
                    System.out.println("근력+3이 증가되었습니다.");
                    캐릭터_근력.근력 = 캐릭터_근력.근력+3;
                }
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (가방_선택 == 2) {
            System.out.println("장비를 선택하셨습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
}
