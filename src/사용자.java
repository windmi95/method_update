public class 사용자 {
    int 체력;
    int 골드;
    int 레벨;

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
