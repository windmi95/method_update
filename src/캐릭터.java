public class 캐릭터 {
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 1;
    int 경험치양 = 0;
    int 경험치 = 0;
    int 보유한_골드 = 5000;
    int 레벨 = 1;
    int 중량_선택 = 0;
    int 스탯_포인트 = 5;
    private 손목보호대 손목보호대 = null;
    private 리프팅웨어 리프팅웨어 = null;
    private 역도화 역도화 = null;
    private 복압_벨트 복압벨트 = null;
    boolean 캐릭터_메뉴_확인중 = true;

    public void 손목보호대_장착(손목보호대 손목보호대, 가방 내가방) {
        this.손목보호대 = 손목보호대;
        this.손목보호대.캐릭터한테_장착되어있는지_여부 = true;
        this.손목보호대.손목보호대_장착_효과_적용하기(this);
    }
    public void 손목보호대_벗기() {
        this.손목보호대.손목보호대_효과_제거(this);
        this.손목보호대 = null;
    }
    public void 리프팅웨어_장착(리프팅웨어 리프팅웨어, 가방 내가방){
        this.리프팅웨어 = 리프팅웨어;
        this.리프팅웨어.캐릭터한테_장착되어있는지_여부 = true;
        this.리프팅웨어.리프팅웨어_장착_효과_적용하기(this);
    }
    public void 리프팅웨어_벗기(){
        this.리프팅웨어.리프팅웨어_장착_효과_제거하기(this);
        this.리프팅웨어 = null;
    }
    public void 역도화_장착(역도화 역도화, 가방 내가방) {
        this.역도화 = 역도화;
        this.역도화.캐릭터한테_장착되어있는지_여부 = true;
        this.역도화.역도화_장착_효과_적용하기(this);
    }
    public void 역도화_벗기() {
        this.역도화.역도화_장착_효과_제거하기(this);
        this.역도화 = null;
    }
    public void 복압벨트_장착(복압_벨트 복압벨트, 가방 내가방) {
        this.복압벨트 = 복압벨트;
        this.복압벨트.캐릭터한테_장착되어있는지_여부 = true;
        this.복압벨트.복압벨트_장착_효과_적용하기(this);
    }
    public void 복압벨트_벗기() {
        this.복압벨트.복압벨트_장착_효과_제거하기(this);
        this.복압벨트 = null;
    }
    public boolean 캐릭터_장착한_장비_리스트_보여주기() {
        if(this.손목보호대 == null && this.리프팅웨어 == null && this.역도화 == null && this.복압벨트 == null) {
            System.out.println("아무것도 착용중인 장비가 없습니다.");
            캐릭터_메뉴_확인중 = false;
            return  false;
        }

        if (this.손목보호대 != null && this.손목보호대.캐릭터한테_장착되어있는지_여부) {
            System.out.println("손목보호대");
        }

        if (this.리프팅웨어 != null && this.리프팅웨어.캐릭터한테_장착되어있는지_여부) {
            System.out.println("리프팅웨어");
        }

        if (this.역도화 != null && this.역도화.캐릭터한테_장착되어있는지_여부) {
            System.out.println("역도화");
        }

        if (this.복압벨트 != null && this.복압벨트.캐릭터한테_장착되어있는지_여부) {
            System.out.println("복압벨트");
        }

        return  true;
    }

    public int 캐릭터_해제할_장비_선택(int 해제할_장비_번호_선택) {
        if (해제할_장비_번호_선택 == 1) {
            System.out.println("손목보호대를 장착하시겠습니까?");
            System.out.println("1.장착 해제한다 2.장착 해제하지 않는다.");
        } else if (해제할_장비_번호_선택 == 2) {
            System.out.println("리프팅웨어를 장착하시겠습니까?");
            System.out.println("1.장착 해제한다 2.장착 해제하지 않는다.");
        } else if (해제할_장비_번호_선택 == 3) {
            System.out.println("역도화를 장착하시겠습니까?");
            System.out.println("1.장착 해제한다 2.장착 해제하지 않는다.");
        } else if (해제할_장비_번호_선택 == 4) {
            System.out.println("복압벨트를 장착하시겠습니까?");
            System.out.println("1.장착 해제한다 2.장착 해제하지 않는다.");
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }
        return 해제할_장비_번호_선택;
    }

    public boolean 캐릭터_장비_해제할_수_있는_목록_출력() {
        if (this.손목보호대 == null && this.리프팅웨어 == null && this.역도화 == null && this.복압벨트== null) {
            System.out.println("해체할 수 있는 장비가 없습니다.");
            return false;
        }

        if (this.손목보호대 != null && this.손목보호대.캐릭터한테_장착되어있는지_여부) {
            System.out.println("1.손목보호대");
        }

        if (this.리프팅웨어 != null && this.리프팅웨어.캐릭터한테_장착되어있는지_여부){
            System.out.println("2.리프팅웨어");
        }

        if (this.역도화 != null && this.역도화.캐릭터한테_장착되어있는지_여부) {
            System.out.println("3.역도화");
        }

        if (this.복압벨트 != null && this.복압벨트.캐릭터한테_장착되어있는지_여부) {
            System.out.println("4.복압벨트");
        }
        return true;
    }

    public void 캐릭터_스탯(캐릭터 게임_캐릭터) {
        System.out.println("현재 체력 => " + 체력);
        System.out.println("현재 근력 => " + 근력);
    }
    public boolean 레벨업_했는지_여부_확인() {
        if (경험치양 > this.레벨 * 100) {
            this.레벨 = 레벨 + 1;
            System.out.println("레벨이 상승했습니다.");
            return true;
        }
        else {
            return false;
        }
    }
    public void 경험치_획득() {
        int 경험치 = 중량_선택 * 2;
        경험치양 = 경험치 + 경험치양;
        System.out.println("현재 경험치 => " + 경험치양);

    }
    public void 체력_감소() {//객체 변수에 아무런 값이 없음
        if (this.체력 > 0) {
            this.체력 = 체력 - (중량_선택 - 근력);
            System.out.println("남은 체력 => "+ 체력);
        } else {
            System.out.println("체력이 부족하여 메인 메뉴로 이동하겠습니다.");
        }
    }
    public int 레벨업_이후_올릴_스탯_번호_선택(int 상승시킬_스탯_번호_선택) {
        if (경험치양 >= this.레벨 * 100) {
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
            System.out.println("남은 스탯포인트: " + i);
        }
        }
        return 상승시킬_스탯_번호_선택;
    }
}