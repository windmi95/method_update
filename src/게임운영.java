import java.util.Scanner;
//게임 전반적인 운영을 담당하는 클래스

public class 게임운영 {
    Boolean 게임_종료 = false;
    캐릭터 현재_레벨 = new 캐릭터();


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
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("1.운동하기 2.가방 3.의뢰 4.상점 5.퀘스트 현황 6.능력치 확인 7.장비 슬롯 8.게임 설정");
        System.out.println("어떤 것을 선택하시겠습니까?");
        메인_메뉴_선택지 = sc.nextInt();
        switch (메인_메뉴_선택지) {
            case 1:
                System.out.println("1번 운동을 하러 장소를 이동한다.");
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
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("1.운동 실행 2.아이템 사용 3.중량 변경 4.게임에서 나가기");
        운동_메뉴_선택지 = sc.nextInt();
        switch (운동_메뉴_선택지) {
            case 1:
                System.out.println("운동을 실행하러 이동");
                break;
            case 2:
                System.out.println("아이템을 사용");
                break;
            case 3:
                System.out.println("중량을 변경합니다.");
                break;

            case 4:
                System.out.println("게임플레이를 취소하였습니다.");
                break;
        }
        return 운동_메뉴_선택지;
    }
    public void 등급_제한() {//
        if (현재_등급 == 1) {
            System.out.println("현재 등급이 맞지 않아서 진행할 수 없습니다.");
        } else if (현재_등급 == 2) {
            System.out.println("");
        }
    }
    public void 승급_가능_메시지_출력() {
        if (30 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 31) {//초급
            System.out.println("중급 심사를 진행하실 수 있습니다.");
        } else if (50 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 51) {//중급
            System.out.println("고급 심사를 진행하실 수 있습니다.");
        } else if (70 <= 현재_레벨.레벨 && 현재_레벨.레벨 < 71) {//고급
            System.out.println("초월 심사를 진행하실 수 있습니다.");
        }
    }

}
