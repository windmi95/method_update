public class 캐릭터 {
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 1;
    int 경험치 = 0;
    int 보유한_골드 = 5000;
    int 경험치양 = 0;
    int 레벨 = 1;
    int 중량_선택 =0;
    int 스탯_포인트 = 5;

    캐릭터 게임_캐릭터;

public 캐릭터() {
    게임_캐릭터 = new 캐릭터();
}


    public void 경험치_설정() {
        경험치 = 중량_선택 / 2;
        경험치양 = 경험치 + 경험치양;
        System.out.println("현재 경험치 => " + 경험치양);

        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
            System.out.println("체력과 근력 중 어떤 스탯을 상승시키겠습니까?");
            System.out.println("1.체력 2.근력");
            int 스탯_선택 = 1;
            if (스탯_선택 == 1) {
                체력 = 체력 + 10;
            } else if (스탯_선택 == 2) {
                근력 = 근력 + 1;
            }
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
    public void 레벨업() {
        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
        }
    }
    public void 상승시킬_스탯_목록() {
        System.out.println("1.근력 2.체력");
        System.out.println("어떤 스탯을 올릴 것인지 선택하세요.");
    }
    public void 상승시킬_스탯_선택(int 상승시킬_스탯_번호) {
        if (상승시킬_스탯_번호 == 1) {
            System.out.println("근력 +1이 상승했습니다.");
            게임_캐릭터.근력 = 게임_캐릭터.근력 + 1;
        } else if (상승시킬_스탯_번호 == 2) {
            System.out.println("체력 +10이 상승했습니다.");
            게임_캐릭터.체력 = 게임_캐릭터.체력 + 10;
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}