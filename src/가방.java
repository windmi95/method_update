import java.util.Scanner;
import java.util.ArrayList;

public class 가방 {//아이템 관리하는 클래스
    Scanner sc = new Scanner(System.in);
    int 보유한_bcaa_개수 = 5;
    int 보유한_탄수화물_보충제_개수;
    int 보유한_프로틴_개수 = 5;
    int 보유한_크레아틴_개수;
    캐릭터 게임_캐릭터;
    ArrayList bcaa_list;
    ArrayList 탄수화물_보충제_list;
    ArrayList 프로틴_list;
    ArrayList 크레아틴_list;
    ArrayList 손목보호대;
    ArrayList 리프팅웨어;
    ArrayList 역도화;
    ArrayList 복압_벨트;

    public 가방() {
        bcaa_list = new ArrayList<bcaa>();
        탄수화물_보충제_list = new ArrayList<탄수화물_보충제>();
        프로틴_list = new ArrayList<프로틴>();
        크레아틴_list = new ArrayList<크레아틴>();
        게임_캐릭터 = new 캐릭터();
    }
    public void bcaa_먹기(캐릭터 게임_캐릭터) {
        bcaa_list.remove(bcaa_list.size()-1);
    }
    public void 탄수화물_보충제_먹기(캐릭터 게임_캐릭터) {
        탄수화물_보충제_list.remove(탄수화물_보충제_list.size()-1);
    }
    public void 프로틴_먹기(캐릭터 게임_캐릭터) {
        프로틴_list.remove(프로틴_list.size()-1);
    }
    public void 크레아틴_먹기(캐릭터 게임_캐릭터) {
        크레아틴_list.remove(크레아틴_list.size()-1);
    }
    public void 아이템_목록() {
        System.out.println("");
        System.out.println("======================소모품 선택======================");
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 소모품을 선택하시겠습니까?");
    }
    public void 아이템_사용 (int 사용할_아이템_번호_선택) {
        if (사용할_아이템_번호_선택 == 1) {
            System.out.println("bcaa를 선택하셨습니다.");
            if (bcaa_list.isEmpty()) {
                System.out.println("bcaa가 부족하여 사용하실 수 없습니다.");
                return;
            }
            bcaa_list.remove(bcaa_list.size()-1);
            System.out.println("bcaa를 섭취하였습니다.");

            } else if (사용할_아이템_번호_선택 == 2) {
                System.out.println("탄수화물 보충제를 선택하셨습니다.");
                if (탄수화물_보충제_list.isEmpty()) {
                    System.out.println("탄수화물 보충제가 부족하여 사용하실 수 없습니다.");
                    return;
                }
                탄수화물_보충제_list.remove(탄수화물_보충제_list.size()-1);
                System.out.println("탄수화물 보충제를 섭취하였습니다.");
            } else if (사용할_아이템_번호_선택 == 3) {
                System.out.println("프로틴을 선택하셨습니다.");
                if (프로틴_list.isEmpty()) {
                    System.out.println("프로틴이 부족하여 사용하실 수 없습니다.");
                    return;
                }
            프로틴_list.remove(프로틴_list.size()-1);
            System.out.println("프로틴을 섭취하였습니다.");
            } else if (사용할_아이템_번호_선택 == 4) {
                System.out.println("크레아틴을 선택하셨습니다.");
                if (크레아틴_list.isEmpty()) {
                    System.out.println("크레아틴이 부족하여 사용하실 수 없습니다.");
                }
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
    }
    public void 장비_장착() {

    }

}

