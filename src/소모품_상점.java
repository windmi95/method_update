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
    public int 소모품_구매_안내_메시지(int 소모품_구매_선택) {
        int 소모품_구매 = scanner.nextInt();
        if (소모품_구매 == 1) {
            System.out.println("현재 소지하고 있는 골드 -> " + 게임_캐릭터.보유한_골드);
            System.out.println("bcaa를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품.bcaa * 게임_캐릭터.소모품_구매();
            if (게임_캐릭터.골드 >= 총금액) {
                게임_캐릭터.골드 = 게임_캐릭터.골드 - 소모품.bcaa * 게임_캐릭터.소모품_구매();
                int bcaa_개수 = 가방_소지한_아이템.보유한_bcaa_개수 + 게임_캐릭터.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 2) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 게임_캐릭터.골드);
            System.out.println("탄수화물 보충제를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품.탄수화물_보충제 * 게임_캐릭터.소모품_구매();
            if (게임_캐릭터.골드 >= 총금액) {
                게임_캐릭터.골드 = 게임_캐릭터.골드 - 소모품.탄수화물_보충제 * 게임_캐릭터.소모품_구매();
                int 탄수화물_보충제_개수 = 가방_소지한_아이템.보유한_탄수화물_보충제_개수 + 게임_캐릭터.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 3) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 게임_캐릭터.골드);
            System.out.println("프로틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품.프로틴 * 게임_캐릭터.소모품_구매();
            if (게임_캐릭터.골드 >= 총금액) {
                게임_캐릭터.골드 = 게임_캐릭터.골드 - 소모품.프로틴 * 게임_캐릭터.소모품_구매();
                int 프로틴 = 가방_소지한_아이템.보유한_프로틴_개수 + 게임_캐릭터.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 4) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 게임_캐릭터.골드);
            System.out.println("크레아틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품.크레아틴 * 게임_캐릭터.소모품_구매();
            if (게임_캐릭터.골드 >= 총금액) {
                게임_캐릭터.골드 = 게임_캐릭터.골드 - 소모품.크레아틴 * 게임_캐릭터.소모품_구매();
                int 크레아틴_개수 = 가방_소지한_아이템.보유한_크레아틴_개수 + 게임_캐릭터.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        }
    }
}

