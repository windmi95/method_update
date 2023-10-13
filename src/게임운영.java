import java.util.Scanner;
import java.util.ServiceLoader;
//게임 전반적인 운영을 담당하는 클래스

public class 게임운영 {
    Boolean 게임_종료 = false;
    캐릭터 운동_실행 = new 캐릭터();
    캐릭터 현재_레벨 = new 캐릭터();
    캐릭터 현재_등급 = new 캐릭터();
    캐릭터 운동실행 = new 캐릭터();
    이벤트 이벤트_선택지 = new 이벤트();
    소모품_상점 소모품_bcaa_가격 = new 소모품_상점();
    소모품_상점 소모품_탄수화물_보충제_가격 = new 소모품_상점();
    소모품_상점 소모품_프로틴_가격 = new 소모품_상점();
    소모품_상점 소모품_크레아틴_가격 = new 소모품_상점();
    장비_상점 장비_손목_보호대 = new 장비_상점();
    장비_상점 장비_리프팅웨어 = new 장비_상점();
    장비_상점 장비_역도화 = new 장비_상점();
    장비_상점 장비_복압_벨트 = new 장비_상점();
    캐릭터 bcaa_구매_개수_입력받기 = new 캐릭터();
    캐릭터 탄수화물_보충제_구매_개수_입력받기 = new 캐릭터();
    캐릭터 프로틴_구매_개수_입력받기 = new 캐릭터();
    캐릭터 크레아틴_구매_개수_입력받기 = new 캐릭터();
    캐릭터 현재_소지한_골드 = new 캐릭터();
    가방 현재_소지한_bcaa = new 가방();
    가방 현재_소지한_탄수화물_보충제 = new 가방();
    가방 현재_소지한_프로틴 = new 가방();
    가방 현재_소지한_크레아틴 = new 가방();
    public int 계산 = 0;
    Scanner sc = new Scanner(System.in);


    public void 프롤로그() {
        System.out.println("");
        System.out.println("");
        System.out.println("=======================프롤로그=============================");
        System.out.println("");
        System.out.println("한 날, 잠을 청하던 나는 꿈 속에서 헬스장에 도착했다.");
        System.out.println("호기심에 벨을 누르고 헬스장 안으로 들어갔다..... ");
        System.out.println("헬스장 안으로 들어가자 심상치 않은 느낌에 나가고자 했을 때 문이 잠기게 되었다.");
        System.out.println("");
        System.out.println("직원: 어서오세요. 처음 방문하시나요?");
        System.out.println("나: 네 헬스장 이용하려고 하는데 안내 부탁드립니다.");
        System.out.println("직원: 최종 승급 심사를 통과하지 못하면 여기서 빠져나올 수 없습니다.");
        System.out.println("직원: 계속 진행을 원하시면 계약서에 서명 부탁드립니다.");
        System.out.println("캐릭터 이름을 입력해주세요 이름: ");
    }
    public String 캐릭터_이름_작성() {
        Scanner scanner = new Scanner(System.in);
        String 이름 = scanner.next();
        return 이름;
    }
    public int 메인_메뉴_선택(int 메인_메뉴_선택지) {
        System.out.println("=================================================================================");
        System.out.println("1.운동하기 2.가방 3.의뢰 4.상점 5.퀘스트 현황 6.능력치 확인 7.장비 슬롯 8.게임 설정");
        System.out.println("어떤 것을 선택하시겠습니까?");
        메인_메뉴_선택지 = sc.nextInt();
        switch (메인_메뉴_선택지) {
            case 1:
                운동실행.무게_선택();
                운동_메뉴_선택(sc.nextInt());
                운동실행.운동진행();
                break;
            case 2:
                System.out.println("2번 가방을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("3번 퀘스트를 받으러 이동한다.");
                break;
            case 4:
                System.out.println("4번 상점을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("5번 퀘스트 현황을 선택하셨습니다.");
                break;
            case 6:
                System.out.println("6번 능력치 확인을 선택하셨습니다.");
                break;
            case 7:
                System.out.println("7번 장비 슬롯을 선택하셨습니다.");
                break;
            case 8:
                System.out.println("8번 설정을 선택하셨습니다.");
                break;
            case 9:
                System.out.println("9번 퀵슬롯을 선택하셨습니다.");
                break;
        }
        return 메인_메뉴_선택지;
    }
    public int 운동_메뉴_선택(int 운동_메뉴_선택지) {
        System.out.println("======================운동 메뉴 선택======================");
        System.out.println("1.운동 실행 2.아이템 사용 3.중량 변경 4.게임에서 나가기");
        운동_메뉴_선택지 = sc.nextInt();
        switch (운동_메뉴_선택지) {
            case 1:
                운동_실행.운동진행();
                운동_실행.무게_선택();
                이벤트_선택지.이벤트_실행();
                break;
            case 2:
                System.out.println("아이템 사용");

                break;
            case 3:
                System.out.println("중량을 변경합니다.");
                운동_실행.무게_선택();
                break;

            case 4:
                System.out.println("게임플레이를 취소하였습니다.");
                메인_메뉴_선택(sc.nextInt());
                break;
        }
        return 운동_메뉴_선택지;
    }
    /*public void 등급_제한() {
        if (현재_등급.등급 == 1) {//초급 이상의 등급을 선택했을 때 결과
            System.out.println("현재 등급이 맞지 않아서 진행할 수 없습니다.");
        } else if (현재_등급.등급 == 2) {//중급 이상의 등급을 선택했을 때 결과
            System.out.println("");
        } else if (현재_등급.등급 == 3) {
            System.out.println("");
        }
    }*/
    public void 승급_가능_메시지_출력() {
        if (30 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 31) {//초급
            System.out.println("중급 심사를 진행하실 수 있습니다.");
        } else if (50 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 51) {//중급
            System.out.println("고급 심사를 진행하실 수 있습니다.");
        } else if (70 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 71) {//고급
            System.out.println("초월 심사를 진행하실 수 있습니다.");
        }
    }
    public void 소모품_구매_안내_메시지() {
        System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
        System.out.println("어떤 것을 구매하시겠습니까?");
        int 소모품_구매 = sc.nextInt();
        if (소모품_구매 == 1) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("bcaa를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품_bcaa_가격.bcaa * bcaa_구매_개수_입력받기.소모품_구매();
            if (현재_소지한_골드.골드 >= 총금액) {
                현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 소모품_bcaa_가격.bcaa * bcaa_구매_개수_입력받기.소모품_구매();
                int bcaa_개수 = 현재_소지한_bcaa.소지한_bcaa_개수 + bcaa_구매_개수_입력받기.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 2) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("탄수화물 보충제를 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품_탄수화물_보충제_가격.탄수화물_보충제 * 탄수화물_보충제_구매_개수_입력받기.소모품_구매();
            if (현재_소지한_골드.골드 >= 총금액) {
                현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 소모품_탄수화물_보충제_가격.탄수화물_보충제 * 탄수화물_보충제_구매_개수_입력받기.소모품_구매();
                int 탄수화물_보충제_개수 = 현재_소지한_탄수화물_보충제.소지한_탄수화물_보충제_개수 + 탄수화물_보충제_구매_개수_입력받기.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 3) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("프로틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품_프로틴_가격.프로틴 * 프로틴_구매_개수_입력받기.소모품_구매();
            if (현재_소지한_골드.골드 >= 총금액) {
                현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 소모품_프로틴_가격.프로틴 * 프로틴_구매_개수_입력받기.소모품_구매();
                int 프로틴 = 현재_소지한_프로틴.소지한_프로틴_개수 + 프로틴_구매_개수_입력받기.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (소모품_구매 == 4) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("크레아틴을 선택하셨습니다.");
            System.out.println("몇 개를 구매하시겠습니까?");
            int 총금액 = 소모품_크레아틴_가격.크레아틴 * 크레아틴_구매_개수_입력받기.소모품_구매();
            if (현재_소지한_골드.골드 >= 총금액) {
                현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 소모품_크레아틴_가격.크레아틴 * 크레아틴_구매_개수_입력받기.소모품_구매();
                int 크레아틴_개수 = 현재_소지한_크레아틴.소지한_크레아틴_개수 + 크레아틴_구매_개수_입력받기.소모품_구매();
            } else {
                System.out.println("골드가 부족합니다.");
            }
        }
    }
    public void 장비_안내_메시지_출력() {
        System.out.println("현재 소지하고 있는 골드 -> " + 현재_소지한_골드.골드);
        System.out.println("1.손목보호대 2.리프팅웨어 3.역도화 4.복압벨트");
        System.out.println("어떤 것을 구매하시겠습니까?");
        int 장비_구매 = sc.nextInt();
        if (장비_구매 == 1) {
            System.out.println("손목보호대를 선택하셨습니다.");
            if (현재_소지한_골드.골드 >= 장비_손목_보호대.손목보호대) {
                현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 장비_손목_보호대.손목보호대;
            } else {
                System.out.println("골드가 부족합니다.");
            }
        } else if (장비_구매 == 2) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("리프팅웨어를 선택하셨습니다.");
            if (현재_등급.등급 == 2) {
                if (현재_소지한_골드.골드 >= 장비_리프팅웨어.리프팅웨어) {
                    현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 장비_리프팅웨어.리프팅웨어;
                } else {
                    System.out.println("골드가 부족합니다.");

                }
            } else {
                System.out.println("현재 등급이 맞지 않아 구매하실 수 없습니다.");
            }
        } else if (장비_구매 == 3) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("역도화를 선택하셨습니다.");
            if (현재_등급.등급 == 3) {
                if (현재_소지한_골드.골드 >= 장비_역도화.역도화) {
                    현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 장비_역도화.역도화;
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            } else {
                System.out.println("현재 등급이 맞지 않아 구매하실 수 없습니다.");
            }
        } else if (장비_구매 == 4) {
            System.out.println("현재 소지하고 있는 골드 -> "+ 현재_소지한_골드.골드);
            System.out.println("역도화를 선택하셨습니다.");
            if (현재_등급.등급 <= 4) {
                if (현재_소지한_골드.골드 >= 장비_역도화.역도화) {
                    현재_소지한_골드.골드 = 현재_소지한_골드.골드 - 장비_역도화.역도화;
                } else {
                    System.out.println("골드가 부족합니다.");
                }
            } else {
                System.out.println("현재 등급이 맞지 않아 구매하실 수 없습니다.");
            }
        }
        return;
    }

    /* public int 장비_안내_메시지(int 소모품_구매_개수, int 구매한_장비) {
        return 구매한_장비 - 구매개수;
    }*/

}
