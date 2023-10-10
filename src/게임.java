import java.util.Random;
import java.util.Scanner;

public class 게임 {

     int 현재_레벨 = 1;

     int 구매 = 0;

     int 아이템_사용 = 0;

     int 현재_등급 = 1;

     int 중량_선택 = 0;

     int 승급_심사_선택 = 0;

     int 경험치 = 0;

     int bcaa_개수 = 0;

     int 탄수화물_보충제_개수 = 0;

     int 프로틴_개수 = 0;

     int 크레아틴_개수 = 0;

     int bcaa_사용한_개수 = 0;

     int 탄수화물_보충제_사용한_개수 = 0;

     int 프로틴_사용한_개수 = 0;

     int 크레아틴_사용한_개수 = 0;

     int bcaa_메뉴_선택 = 0;

     int 탄수화물_보충제_메뉴_선택 = 0;

     int 프로틴_메뉴_선택 = 0;

     int 크레아틴_메뉴_선택 = 0;

     int bcaa_사용_계산 = 0;

     int 경험치양 = 0;

     int 참여여부 = 0;

     int 구매개수 = 0;

     int 랜덤뽑기 = 0;

     int 당첨금뽑기 = 0;

     boolean 상품구매 = false;

    int 남은_횟수 = 0;

    int 현재_횟수 = 0;

    int 승급_심사_메뉴_선택 = 0;

    int 초보_심사_중량 = 10;

    }
    public static void 이벤트() {
        Scanner sc = new Scanner(System.in);
        Random 뽑기 = new Random();
        System.out.println("골드를 획득할 수 있는 깜짝 이벤트가 있습니다. 참여를 하실 것인지 선택해주세요.");
        System.out.println("1.참여한다. 2.참가하지 않는다.");
        참여여부 = sc.nextInt();
        if (참여여부 == 1) {//꽝일 경우 아닐 경우
            System.out.println("이벤트의 경우 랜덤으로 당첨 혹은 꽝이 나옵니다.");
            System.out.println("추가적으로 꽝일 경우 체력의 1/2가 감소됩니다.");
            랜덤뽑기 = 뽑기.nextInt(2);
            if (랜덤뽑기 == 1) {
                System.out.println("당첨이 되었습니다.");
                Random 당첨금 = new Random();
                당첨금뽑기 = 당첨금.nextInt(100)*100;
                System.out.println(당첨금뽑기+ "골드를 획득하셨습니다.");
            } else {
                System.out.println("꽝을 고르셨기 때문에 체력의 1/2이 감소되었습니다.");
                체력 = 체력/2;
            }
        } else if (참여여부 == 2) {
            System.out.println("게임을 계속 진행하겠습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static void 가방() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 것을 선택하시겠습니까?");
        System.out.println("1.아이템 2.장비");
        int 가방_선택 = sc.nextInt();
        if (가방_선택 == 1) {
            System.out.println("아이템을 선택하셨습니다.");
            System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
            아이템_사용 = sc.nextInt();
            if (아이템_사용 == 1) {
                if (bcaa_개수 > 0) {
                    System.out.println("bcaa를 선택하셨습니다. (" +"보유한 개수 " + bcaa_개수 +"개"+")");
                    System.out.println("1.사용한다. 2.사용하지 않는다. 3.다른 아이템을 사용한다.");
                    bcaa_메뉴_선택 = sc.nextInt();
                    if (bcaa_메뉴_선택 == 1) {
                        System.out.println("몇 개를 사용하시겠습니까?");
                        bcaa_사용한_개수 = sc.nextInt();
                        bcaa_사용_계산 = 체력+ bcaa_사용한_개수 * 1;
                        if (bcaa_사용_계산 < 체력) {
                            System.out.println(bcaa_사용한_개수+"개를 사용하였습니다.");
                        } else {
                            System.out.println("체력이 가득차서 더 사용할 수 없습니다.");
                        }
                    }
                    System.out.println(bcaa_개수);
                    System.out.println("체력+1이 회복되었습니다.");
                    체력 = 체력+1;
                } else {
                    System.out.println("개수가 부족합니다.");
                }
            } else if (아이템_사용 == 2) {
                if (탄수화물_보충제_개수 > 0) {
                    System.out.println("탄수화물 보충제를 선택하셨습니다. (" +"보유한 개수 " + 탄수화물_보충제_개수 +"개"+")");
                    System.out.println("체력+3이 회복되었습니다.");
                    체력 = 체력+3;
                }
            } else if (아이템_사용 == 3) {
                if (프로틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 프로틴_개수 +"개"+")");
                    System.out.println("근력+1이 증가되었습니다.");
                    근력 = 근력+1;
                }
            } else if (아이템_사용 == 4) {
                if (크레아틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 크레아틴_개수 +"개"+")");
                    System.out.println("근력+3이 증가되었습니다.");
                    근력 = 근력+3;
                }
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (가방_선택 == 2) {
            System.out.println("장비를 선택하셨습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static void 상점() {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 것을 구매하시겠습니까?");
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴 5.손목 보호대 6.리프팅 웨어 7.역도화 8.복압 벨트");
        구매 = sc.nextInt();
        if (구매 == 1) {
            System.out.println("bcaa를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            구매개수 = sc.nextInt();
            int 총금액 = bcaa * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(bcaa * 구매개수);
                System.out.println(계산);
                bcaa_개수 = bcaa_개수 + 구매개수;
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 2) {
            System.out.println("탄수화물 보충제 몇 개를 구매하시겠습니까?");
            구매개수 = sc.nextInt();
            int 총금액 = 탄수화물_보충제 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(탄수화물_보충제 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 3) {
            System.out.println("프로틴을 구매하셨습니다.");
            구매개수 = sc.nextInt();
            int 총금액 = 프로틴 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드-(프로틴 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 4) {
            System.out.println("크레아틴을 구매하셨습니다.");
            구매개수 = sc.nextInt();
            int 총금액 = 크레아틴 * 구매개수;
            if (현재_소지한_골드 >= 총금액) {
                int 계산 = 현재_소지한_골드 - (크레아틴 * 구매개수);
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 5) {
            System.out.println("손목 보호대를 구매하셨습니다.");
            if (현재_소지한_골드 >= 손목보호대) {
                int 계산 = 현재_소지한_골드-손목보호대;
                System.out.println(계산);
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (구매 == 6) {
            if (상품구매 == false) {
                System.out.println("리프팅 웨어를 구매하셨습니다.");
                if (현재_소지한_골드 >= 리프팅웨어) {
                    int 계산 = 현재_소지한_골드 - 리프팅웨어;
                    System.out.println();
                    System.out.println(계산);
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            } else {
                System.out.println("등급이 낮기 때문에 구매하실 수 없습니다.");
            }
        } else if (구매 == 7) {
            if (상품구매 == false) {
                System.out.println("역도화를 구매하셨습니다.");
                if (현재_소지한_골드 >= 역도화) {
                    int 계산 = 현재_소지한_골드 - 역도화;
                    System.out.println(계산);
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            }
        } else if (구매 == 8) {
            if (상품구매 == false) {
                System.out.println("복압 벨트를 구매하셨습니다.");
                int 총금액 = 복압벨트;
                if (현재_소지한_골드 >= 복압벨트) {
                    int 계산 = 현재_소지한_골드 - 복압벨트;
                    System.out.println(계산);
                  } else {
                    System.out.println("골드가 부족합니다.");
                }
            }
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    public static void 장비_슬롯() {

    }

    public static void 승급심사_설정() {
        Scanner sc = new Scanner(System.in);
        승급_심사_메뉴_선택 = sc.nextInt();
        System.out.println("1.운동 실행 2.아이템 사용 3.게임에서 나가기");
        if (승급_심사_메뉴_선택 == 1) {
            if (체력 > 0) {
                체력 = 체력 - (초보_심사_중량 - 근력);
                현재_횟수++;
                남은_횟수 = 100;
                System.out.println("남은 체력 => "+ 체력);
                System.out.println("현재 횟수 => "+ 현재_횟수);
                for (int i = 남은_횟수; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println("승급 심사를 통과하셨습니다.");
                        System.out.println("중급으로 등급이 상승되었습니다.");
                        현재_등급 = 1;
                    } else {
                        System.out.println("승급 심사를 통과하지 못하였습니다.");
                    }
                }
            }
        } else if (승급_심사_메뉴_선택 == 2) {



        } else if (승급_심사_메뉴_선택 == 3) {
            System.out.println("메인 메뉴로 이동합니다.");

        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }

    }
    public static void 승급심사() {
        Scanner sc = new Scanner(System.in);
        if (30 <= 현재_레벨 && 현재_레벨 < 31) {//초급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("제한시간 5분이 주어지고 100개를 실행하지 못할 경우 다시 도전해야합니다.");
                System.out.println("분 입력: ");
                int 분 = sc.nextInt();
                int 초 = 분 * 60;
                for(int i = 초; i > 0; i--) {
                    System.out.println(i / 60+ " 분"+ i % 60 + " 초");
                }
            } else if (승급_심사_선택 == 2) {
                System.out.println("메뉴로 돌아가겠습니다.");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                System.out.println("승급 심사를 진행하실 수 있습니다.");
                System.out.println("승급 심사를 진행하시겠습니까?");
                System.out.println("1번 진행한다. 2번 진행하지 않는다.");
                return;
            }
        } else if (50 <= 현재_레벨 && 현재_레벨 < 51) {//중급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (70 <= 현재_레벨 && 현재_레벨 < 101) {//고급
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (현재_레벨 >= 100) {
            System.out.println("승급 심사를 진행하실 수 있습니다.");
            System.out.println("승급 심사를 진행하시겠습니까?");
            System.out.println("1번 진행한다. 2번 진행하지 않는다.");
            승급_심사_선택 = sc.nextInt();
            if (승급_심사_선택 == 1) {
                System.out.println("");
            } else if (승급_심사_선택 == 2) {
                System.out.println("");
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        if (현재_등급 == 1) {
            Random 승급심사_운동횟수_결정 = new Random();
            승급_레벨();

        } else {
            System.out.println("게임 메뉴로 이동합니다.");
        }
    }
    public static void 등급() {

    }
}
