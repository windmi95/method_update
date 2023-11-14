import java.util.Random;

public class 헬스장_관장 {
    int 초급_심사_중량 = 10;
    int 중급_심사_중량 = 50;
    int 고급_심사_중량 = 70;
    int 초월_심사_중량 = 100;
    boolean 승급심사_진행중 = false;
    boolean 퀘스트_진행중 = false;
    boolean 퀘스트_메뉴_진행중 = true;
    Random 랜덤으로_운동횟수_주기 = new Random();
    int 해야할_운동횟수 = 0;
    int 진행중인_퀘스트_운동_실행_횟수 = 0;

    public void 퀘스트_및_승급심사_메뉴() {
        System.out.println("1.퀘스트 2.승급 심사 3.퀘스트 현황 4.퀘스트 보상 5.메뉴에서 나가기");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }

    public void 퀘스트_유형_선택(int 퀘스트_번호_선택, int 퀘스트_승낙_여부_선택, int 캐릭터_레벨, int 캐릭터_등급) {
        if (퀘스트_번호_선택 == 1) {// 기본 퀘스트
            if (퀘스트_승낙_여부_선택 == 1) {
                해야할_운동횟수 = (랜덤으로_운동횟수_주기.nextInt(5)+1)  * 100;
                System.out.println("실행해야 하는 횟수는 " + 해야할_운동횟수 + "회를 실행해야 합니다.");
            } else {
                System.out.println("중량은 등급에 맞게 원하는 무게를 사용할 수 있으며, 운동 횟수는 랜덤으로 설정됩니다.");
            }
        } else if (퀘스트_번호_선택 == 2) {//승급 심사
            if (캐릭터_등급 == 1 && 캐릭터_레벨 == 30) {//초급 -> 중급
                System.out.println("승급 심사를 진행하시겠습니까?");
                System.out.println("실행해야 하는 중량은 10kg로 실행하며");
                System.out.println("제한시간 5분이 주어지고 운동 횟수 100개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (캐릭터_등급 == 2 && 캐릭터_레벨 == 50) {//중급 -> 고급
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 50kg로 실행하며");
                System.out.println("제한시간 5분이 주어지고 운동 횟수 300개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (캐릭터_등급 == 3 && 캐릭터_레벨 == 70) {//고급 -> 초월
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 70kg로 실행하며 제한시간 5분이 주어지고");
                System.out.println("운동 실행을 선택했을 때 랜덤으로 체력 10이 감소됩니다.");
                System.out.println("운동 횟수 400개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (캐릭터_등급 == 4 && 캐릭터_레벨 == 100) {//최종 승급
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 100kg로 실행하며 제한시간 5분이 주어지고");
                System.out.println("운동 실행을 선택했을 때 랜덤으로 체력 20이 감소됩니다.");
                System.out.println("운동 횟수 500개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else {
                System.out.println("승급 심사를 실행할 수 있는 단계가 아닙니다.");
            }
        }
    }

    public void 승급_가능_메시지_출력(int 캐릭터_레벨) {
        if (30 <= 캐릭터_레벨  && 캐릭터_레벨 < 31) {//초급
            System.out.println("중급 심사를 진행하실 수 있습니다.");
        } else if (50 <= 캐릭터_레벨 && 캐릭터_레벨 < 51) {//중급
            System.out.println("고급 심사를 진행하실 수 있습니다.");
        } else if (70 <= 캐릭터_레벨 && 캐릭터_레벨 < 71) {//고급
            System.out.println("초월 심사를 진행하실 수 있습니다.");
        } else if (캐릭터_레벨 <= 100) {
            System.out.println("최종 심사를 진행하실 수 있습니다.");
        }
    }

    public void 퀘스트_진행_여부() {
        System.out.println("계속 진행하시겠습니까?");
        System.out.println("1.진행한다. 2.거절한다.");
    }

    public void 퀘스트_현황_보여주기() {
        // 퀘스트 진행중이면 퀘스트 내용을 출력
        if (퀘스트_진행중) {
            System.out.println("=====================현재 진행중인 퀘스트=====================");
            System.out.println();
            System.out.println("실행해야 할 운동 횟수 -> " + 해야할_운동횟수 + "회");
            System.out.println();
            int 남은횟수 = 해야할_운동횟수 - 진행중인_퀘스트_운동_실행_횟수;
            System.out.println("남은 운동 횟수 -> "+ 남은횟수+ "회");
        } else {
            // 퀘스트 진행중이 아니면 퀘스트가 없다고 출력
            System.out.println("현재 진행중인 퀘스트가 없습니다.");
        }
    }
    public void 진행중인_퀘스트_운동_개수_올리기() {
        진행중인_퀘스트_운동_실행_횟수++;
    }
    public void 퀘스트_진행상태_체크하기(캐릭터 게임_캐릭터) {
        // 운동 횟수가 퀘스트 운동 개수보다 크거나 같으면 퀘스트 완료
        int 남은횟수 = 해야할_운동횟수 - 진행중인_퀘스트_운동_실행_횟수;
        if (퀘스트_진행중) {
            if (남은횟수 <= 0) {
                게임_캐릭터.경험치 = 게임_캐릭터.경험치 + 해야할_운동횟수;
                System.out.println("퀘스트를 완료하였습니다.");
                System.out.println(게임_캐릭터.경험치 + " xp를 획득하였습니다.");
                게임_캐릭터.보유한_골드 = (게임_캐릭터.보유한_골드 + 해야할_운동횟수) / 2;
            } else {
                // 운동 횟수가 퀘스트 운동 개수보다 작으면 퀘스트 진행중
                System.out.println("퀘스트를 진행중입니다.");
                System.out.println();
                System.out.println("아직 " + 남은횟수 + "회 남았습니다.");
                System.out.println();
            }
        }
    }
    public int 승급심사_랜덤_체력_차감(캐릭터 게임_캐릭터) {
        Random 승급심사_랜덤_체력_차감_실행 = new Random();
        int 승급심사_랜덤으로_체력_감소 = 승급심사_랜덤_체력_차감_실행.nextInt(10);
        if (승급심사_랜덤으로_체력_감소 < 5) {
            게임_캐릭터.체력 = 게임_캐릭터.체력 - 10;
            System.out.println("체력이 " + 게임_캐릭터.체력 + "로 차감되었습니다.");
        } else if (승급심사_랜덤으로_체력_감소 >= 5) {

        }

    return 승급심사_랜덤으로_체력_감소;
    }
}