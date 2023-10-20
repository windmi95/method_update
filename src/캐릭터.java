public class 캐릭터 {
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 1;
    int 경험치 = 0;
    int 보유한_골드 = 5000;
    int 경험치양 = 0;
    int 레벨 = 1;
    int 중량_선택 = 0;
    int 스탯_포인트 = 5;

    public void 캐릭터_스탯() {
        System.out.println("현재 체력 => " + 체력);
        System.out.println("현재 근력 => " + 근력);
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
            System.out.println("체력이 부족하여 메인 메뉴로 이동하겠습니다.");
        }
    }
    public void 레벨업(int 상승시킬_스탯_번호_선택) {
        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
            System.out.println("1.근력 2.체력");
            System.out.println("어떤 스탯을 올릴 것인지 선택하세요.");
            if (상승시킬_스탯_번호_선택 == 1) {
                System.out.println("근력 +1이 상승했습니다.");
                this.근력 = this.근력 + 1;
            } else if (상승시킬_스탯_번호_선택 == 2) {
                System.out.println("체력 +10이 상승했습니다.");
                this.체력 = this.체력 + 10;
            }
            for (int i = this.스탯_포인트; i > 0; i--) {

            }
        }

    }
}