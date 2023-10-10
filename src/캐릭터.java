public class 캐릭터 {
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 0;
    int 경험치 = 중량/2;
    int 현재_소지한_골드 = 5000;
    int 경험치양 = 0;
    int 레벨 = 1;

    public void 운동진행() {

    }
    public void 경험치_설정() {
        경험치 = 중량_선택 / 2;
        경험치양 = 경험치 + 경험치양;
        System.out.println("현재 경험치 => "+경험치양);

        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
        }
    }
    public void 체력_설정() {//객체 변수에 아무런 값이 없음
        this.체력 = 체력;
        if (체력 > 0) {
            체력 = 체력 - (중량_선택 - 근력);
            System.out.println("남은 체력 => "+ 체력);
        } else {
            System.out.println("체력이 부족합니다.");
        }
    }

}
