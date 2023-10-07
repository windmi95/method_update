import java.util.Scanner;
//게임 전반적인 운영을 담당하는 클래스

public class 게임운영 {
    Boolean 게임_종료 = false;

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
                System.out.println();

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
}
