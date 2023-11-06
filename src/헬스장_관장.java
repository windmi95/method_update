import java.util.Random;

public class 헬스장_관장 {
    int 현재_횟수 = 0;
    int 남은_횟수 = 0;
    int 초급_심사_중량 = 10;
    int 중급_심사_중량 = 50;
    int 고급_심사_중량 = 70;
    int 초월_심사_중량 = 100;
    boolean 퀘스트_진행중 = true;
    boolean 퀘스트_메뉴_진행중 = true;
    Random 운동횟수 = new Random();
    int 랜덤_운동횟수 = 운동횟수.nextInt(5+1) * 100;

    public void 퀘스트_및_승급심사_메뉴() {
        System.out.println("1.퀘스트 2.승급 심사 3.퀘스트 현황 4.퀘스트 보상");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
    public void 퀘스트_유형_선택(int 퀘스트_번호_선택, int 퀘스트_승낙_여부_선택, int 캐릭터_레벨, int 캐릭터_등급) {
        if (퀘스트_번호_선택 == 1) {// 기본 퀘스트
            System.out.println("퀘스트를 진행하겠습니다.");
            System.out.println("중량은 등급에 맞게 원하는 무게를 사용할 수 있으며, 운동 횟수는 랜덤으로 설정됩니다.");

            if (퀘스트_승낙_여부_선택 == 1) {
            System.out.println("실행해야 하는 횟수는 "+this.랜덤_운동횟수 +"회를 실행해야 합니다." );
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
                System.out.println("실행해야 하는 중량은 70kg로 실행하며 제한시간 5분이 주어지고 1번 랜덤으로 5초동안 운동할 수 없습니다.");
                System.out.println("운동 횟수 400개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else if (캐릭터_등급 == 4 && 캐릭터_레벨 == 100) {//최종 승급
                System.out.println("승급 심사를 진행하겠습니다.");
                System.out.println("실행해야 하는 중량은 100kg로 실행하며 제한시간 5분이 주어지고 2번 랜덤으로 5초동안 운동할 수 없습니다.");
                System.out.println("운동 횟수 500개를 실행하지 못할 경우 다시 도전해야 합니다.");
            } else {
                System.out.println("승급 심사를 실행할 수 있는 단계가 아닙니다.");
            }
        }
    }
    public void 승급_가능_메시지_출력(int 캐릭터_레벨) {
        if (30 <= 캐릭터_레벨 && 캐릭터_레벨 < 31) {//초급
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
}