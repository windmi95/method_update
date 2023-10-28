import java.util.ArrayList;

public class 가방 {//아이템 관리하는 클래스
    int 보유한_bcaa_개수 = 5;
    int 보유한_탄수화물_보충제_개수 = 3;
    int 보유한_프로틴_개수 = 5;
    int 보유한_크레아틴_개수 = 3;
    캐릭터 게임_캐릭터;
    ArrayList<bcaa> bcaa_list;
    ArrayList 탄수화물_보충제_list;
    ArrayList 프로틴_list;
    ArrayList 크레아틴_list;
    손목보호대 손목보호대;
    리프팅웨어 리프팅웨어;
    역도화 역도화;
    복압_벨트 복압_벨트;


    public 가방() {
        bcaa_list = new ArrayList<bcaa>();
        for (int i = 0; i < 보유한_bcaa_개수; i++) {
            bcaa_list.add(new bcaa());
        }
        탄수화물_보충제_list = new ArrayList<탄수화물_보충제>();
        for (int i = 0; i < 보유한_탄수화물_보충제_개수; i++) {
            탄수화물_보충제_list.add(new 탄수화물_보충제());
        }
        프로틴_list = new ArrayList<프로틴>();
        for (int i = 0; i < 보유한_프로틴_개수; i++) {
            프로틴_list.add(new 프로틴());
        }
        크레아틴_list = new ArrayList<크레아틴>();
        for (int i = 0; i < 보유한_크레아틴_개수; i++) {
            크레아틴_list.add(new 크레아틴());
        }
        손목보호대 손목보호대 = new 손목보호대();
        리프팅웨어 리프팅웨어 = new 리프팅웨어();
        역도화 역도화 = new 역도화();
        복압_벨트 복압_벨트 = new 복압_벨트();
        게임_캐릭터 = new 캐릭터();
    }
    public void bcaa_먹기(캐릭터 게임_캐릭터) {
        if (게임_캐릭터.체력 < 게임_캐릭터.체력) {
            bcaa_list.remove(bcaa_list.size() - 1);
        } else {
            System.out.println("체력이 채워져있기 때문에 더 이상 사용할 수 없습니다.");
        }
    }
    public void 탄수화물_보충제_먹기(캐릭터 게임_캐릭터) {
        if (게임_캐릭터.체력 < 게임_캐릭터.체력) {
        탄수화물_보충제_list.remove(탄수화물_보충제_list.size()-1);
        } else {
            System.out.println("체력이 채워져있기 때문에 더 이상 사용할 수 없습니다.");
        }
    }

    public void 프로틴_먹기(캐릭터 게임_캐릭터) {
        if (게임_캐릭터.체력 < 게임_캐릭터.체력) {
            프로틴_list.remove(프로틴_list.size() - 1);
        } else {
            System.out.println("체력이 채워져있기 때문에 더 이상 사용할 수 없습니다.");
        }
    }
    public void 크레아틴_먹기(캐릭터 게임_캐릭터) {
        if (게임_캐릭터.체력 < 게임_캐릭터.체력) {
            크레아틴_list.remove(크레아틴_list.size() - 1);
        } else {
            System.out.println("체력이 채워져있기 때문에 더 이상 사용할 수 없습니다.");
        }
    }
    public void 가방_메뉴() {
        System.out.println();
        System.out.println("============================================가방 메뉴 선택=======================================================");
        System.out.println("1.장비 장착하기 2.장착 해제하기 3.착용한 장비 확인하기 4.소모품 사용하기 5.소모품 개수 확인 6.소모품 버리기 7.가방 메뉴에서 나가기");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
    public int 가방_메뉴_선택(int 가방_메뉴_선택지) {
        switch (가방_메뉴_선택지) {
            case 1:
                System.out.println("어떤 장비를 장착하시겠습니까?");
                break;
            case 2:
                System.out.println("어떤 장비를 해체하시겠습니까?");
                break;
            case 3:
                System.out.println("어떤 장비를 확인하시겠습니까?");
                break;
            case 4:
                System.out.println("어떤 소모품을 사용하시겠습니까?");
                break;
            case 5:
                System.out.println("어떤 소모품의 개수를 확인하시겠습니까?");
                break;
            case 6:
                System.out.println("어떤 소모품을 버리시겠습니까?");
                break;
            case 7:
                System.out.println("가방 메뉴에서 나가겠습니다.");
                break;
            default:
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                break;
        }
        return 가방_메뉴_선택지;
    }
    public void 소모품_목록() {
        System.out.println("");
        System.out.println("======================소모품 선택======================");
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 소모품을 선택하시겠습니까?");
    }
    public void 소모품_사용 (int 사용할_아이템_번호_선택) {
        if (사용할_아이템_번호_선택 == 1) {
            System.out.println("bcaa를 선택하셨습니다.");
            if (bcaa_list.isEmpty()) {
                System.out.println("bcaa가 부족하여 사용하실 수 없습니다.");
                return;
            }
            bcaa_list.remove(bcaa_list.size()-1);
            System.out.println("bcaa를 섭취하였습니다.");
            System.out.println("체력 +1 상승하였습니다.");
            } else if (사용할_아이템_번호_선택 == 2) {
                System.out.println("탄수화물 보충제를 선택하셨습니다.");
                if (탄수화물_보충제_list.isEmpty()) {
                    System.out.println("탄수화물 보충제가 부족하여 사용하실 수 없습니다.");
                    return;
                }
                탄수화물_보충제_list.remove(탄수화물_보충제_list.size()-1);
                System.out.println("탄수화물 보충제를 섭취하였습니다.");
                System.out.println("체력 +3 상승하였습니다.");
            } else if (사용할_아이템_번호_선택 == 3) {
                System.out.println("프로틴을 선택하셨습니다.");
                if (프로틴_list.isEmpty()) {
                    System.out.println("프로틴이 부족하여 사용하실 수 없습니다.");
                    return;
                }
                프로틴_list.remove(프로틴_list.size()-1);
                System.out.println("프로틴을 섭취하였습니다.");
                System.out.println("근력 +1 상승하였습니다.");
            } else if (사용할_아이템_번호_선택 == 4) {
                System.out.println("크레아틴을 선택하셨습니다.");
                System.out.println("근력 +3 상승하였습니다.");
                if (크레아틴_list.isEmpty()) {
                    System.out.println("크레아틴이 부족하여 사용하실 수 없습니다.");
                }
            }   else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                }
    }

    public void 소모품_체크() {
        System.out.println("남은 bcaa 개수: " + bcaa_list.size());
        System.out.println("남은 탄수화물 보충제 개수: " + 탄수화물_보충제_list.size());
        System.out.println("남은 프로틴 개수: " + 프로틴_list.size());
        System.out.println("남은 크레아틴 개수: " + 크레아틴_list.size());
    }
    public void 버릴_소모품_목록() {
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 소품을 버리시겠습니까?");
    }
    public void 소모품_버리기(int 버릴_소모품_번호_선택) {
        if (버릴_소모품_번호_선택 == 1) {
            if (!bcaa_list.isEmpty()) {
                bcaa_list.remove(0);
                System.out.println("bcaa를 버렸습니다.");
            } else {
                    System.out.println("버릴 bcaa가 없습니다.");
            }
        } else if (버릴_소모품_번호_선택 == 2) {
            if (!탄수화물_보충제_list.isEmpty()) {
                탄수화물_보충제_list.isEmpty();
                System.out.println("탄수화물 보충제를 버렸습니다.");
                return;
            } else {
                System.out.println("버릴 탄수화물 보충제가 없습니다.");
            }
        } else if (버릴_소모품_번호_선택 == 3) {
            if (프로틴_list.isEmpty()) {
                System.out.println("프로틴을 버렸습니다.");
                return;
            }
            else {
                System.out.println("버릴 프로틴이 없습니다.");
            }
        } else if (버릴_소모품_번호_선택 == 4) {
            if (크레아틴_list.isEmpty()) {
                System.out.println("크레아틴을 버렸습니다.");
                return;
            }
            else {
                System.out.println("버릴 크레아틴이 없습니다.");
            }
        }
    }
}

