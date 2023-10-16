//소모품을 사고 팔 수 있는 클래스
public class 소모품_상점 {
    int bcaa = 500;

    int 탄수화물_보충제 = 700;

    int 프로틴 = 500;

    int 크레아틴 = 700;

    public void 소모품_목록() {
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 것을 구매하시겠습니까?");
    }

    public void 소모품_개수체크(){
        System.out.println("몇 개나 구매하시겠습니까?");
    }
    public void 소모품_구매(int 소모품_구매_선택_번호,int 소모품_구매_개수,캐릭터 내캐릭터,가방 내가방) {
        if (소모품_구매_선택_번호 == 1) {
            System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            int 총금액 = this.bcaa * 소모품_구매_개수;
            if (내캐릭터.보유한_골드 >= 총금액) {//살수 있다.
                //구매햇으니까  차감해준다.
                내캐릭터.보유한_골드 = 내캐릭터.보유한_골드 - this.bcaa * 소모품_구매_개수;
                System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            } else {//살수 없을때
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매_선택_번호 == 2) {
            System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            System.out.println("탄수화물 보충제를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = this.탄수화물_보충제 * 소모품_구매_개수;
            if (내캐릭터.보유한_골드 >= 총금액) {
                내캐릭터.보유한_골드 = 내캐릭터.보유한_골드 - this.탄수화물_보충제 * 소모품_구매_개수;
                System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매_선택_번호 == 3) {
            System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            System.out.println("프로틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = this.프로틴 * 소모품_구매_개수;
            if (내캐릭터.보유한_골드 >= 총금액) {
                내캐릭터.보유한_골드 = 내캐릭터.보유한_골드 - this.프로틴 * 소모품_구매_개수;
                System.out.println("현재 소지하고 있는 골드 ->" + 내캐릭터.보유한_골드);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매_선택_번호 == 4) {
            System.out.println("현재 소지하고 있는 골드 -> " + 내캐릭터.보유한_골드);
            System.out.println("크레아틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = this.크레아틴 * 소모품_구매_개수;
            if (내캐릭터.보유한_골드 >= 총금액) {
                내캐릭터.보유한_골드 = 내캐릭터.보유한_골드 - this.크레아틴 * 소모품_구매_개수;
                System.out.println("현재 소지하고 있는 골드 ->" + 내캐릭터.보유한_골드);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        }
        else{
            System.out.println("잘못된 번호 입니다. ");
        }
    }
}