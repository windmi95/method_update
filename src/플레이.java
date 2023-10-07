import java.util.Scanner;

//게임을 진행하는 클래스
public class 플레이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        게임 메뉴 = new 게임();
        String 메뉴_꾸미기 = 게임.게임메뉴_꾸미기();
        String 이름 = 게임.계약서();

        while(!게임_종료) {
            if (!이름.equals("")) {
                System.out.println("계약서 서명 " + 이름);
                System.out.println("게임을 시작하겠습니다.");
                System.out.println("");
                System.out.println(메뉴_꾸미기);
                메뉴.게임메뉴_선택();

            } else {
                System.out.println("게임을 종료하겠습니다.");
                break;
            }
        }
    }
}
