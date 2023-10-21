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
    private 손목보호대 손목보호대 = null;
    private 리프팅웨어 리프팅웨어 = null;
    private 역도화 역도화 = null;
    private 복압_벨트 복압벨트 = null;
    private boolean 손목보호대_착용여부;
    private boolean 리프팅웨어_착용여부;
    private boolean 역도화_착용여부;
    private boolean 복압벨트_착용여부;

    public void 손목보호대_장착(손목보호대 손목보호대) {
        this.손목보호대 = 손목보호대;
        this.손목보호대.캐릭터한테_장착되어있는지_여부 = true;
        this.손목보호대.손목보호대_장착_효과_적용하기(this);
    }
    public void 손목보호대_벗기() {
        this.손목보호대 = null;
        this.손목보호대.손목보호대_효과_제거(this);
    }
    public void 리프팅웨어_장착(리프팅웨어 리프팅웨어){
        this.리프팅웨어 = 리프팅웨어;
        this.리프팅웨어.캐릭터한테_장착되어있는지_여부 = true;
        this.리프팅웨어.리프팅웨어_장착_효과_적용하기(this);
    }
    public void 리프팅웨어_벗기(){
        this.리프팅웨어 = null;
        this.리프팅웨어.리프팅웨어_장착_효과_제거하기(this);
    }
    public void 역도화_장착(역도화 역도화) {
        this.역도화 = 역도화;
        this.역도화.캐릭터한테_장착되어있는지_여부 = true;
        this.역도화.역도화_장착_효과_적용하기(this);
    }
    public void 역도화_벗기() {
        this.역도화 = null;
        this.역도화.역도화_장착_효과_제거하기(this);
    }
    public void 복압벨트_장착(복압_벨트 복압벨트) {
        this.복압벨트 = 복압벨트;
        this.복압벨트.캐릭터한테_장착되어있는지_여부 = true;
        this.복압벨트.복압벨트_장착_효과_적용하기(this);
    }
    public void 복압벨트_벗기() {
        this.복압벨트 = null;
        this.복압벨트.복압벨트_장착_효과_제거하기(this);
    }
    public void 캐릭터_장착_장비_리스트_보여주기() {
        if (this.손목보호대 != null && this.손목보호대.캐릭터한테_장착되어있는지_여부) {
            System.out.println("손목보호대");
        } else if (this.리프팅웨어 != null && this.리프팅웨어.캐릭터한테_장착되어있는지_여부){
            System.out.println("리프팅웨어");
        } else if (this.역도화 != null && this.역도화.캐릭터한테_장착되어있는지_여부) {
            System.out.println("역도화");
        } else if (this.복압벨트 != null && this.복압벨트.캐릭터한테_장착되어있는지_여부) {
            System.out.println("복압벨트");
        }
    }
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