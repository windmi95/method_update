import java.util.Scanner;

//게임을 진행하는 클래스
public class 플레이 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        게임운영 게임_진행 = new 게임운영();
        체육관 중량 = new 체육관();
        캐릭터 게임_캐릭터 = new 캐릭터();
        이벤트 게임_이벤트 = new 이벤트();
        헬스장_관장 퀘스트 = new 헬스장_관장();
        소모품_상점 소모품상점 = new 소모품_상점();
        장비_상점 장비상점 = new 장비_상점();
        가방 아이템_관리 = new 가방();


        while (!게임_진행.게임_종료) {
            게임_진행.프롤로그();
            게임_진행.캐릭터_이름_작성(scanner.next());
            게임_진행.메인_메뉴();
            int 메인_메뉴_선택 = 게임_진행.메인_메뉴_선택(scanner.nextInt());
            if (메인_메뉴_선택 == 1) {
                게임_진행.운동_메뉴();
                int 운동_메뉴_선택 = 게임_진행.운동_메뉴_선택(scanner.nextInt());
                if (운동_메뉴_선택 == 1) {
                    게임_캐릭터.운동진행();
                    게임_캐릭터.무게_선택();
                    게임_이벤트.이벤트_실행();
                    게임_캐릭터.경험치_설정();
                    게임_캐릭터.체력_설정();

                } else if (운동_메뉴_선택 == 2) {
                    아이템_관리.아이템_사용();

                } else if (운동_메뉴_선택 == 3) {
                    중량.선택할_수_있는_무게체크(게임_캐릭터.중량_선택, 게임_캐릭터.레벨);
                } else if (운동_메뉴_선택 == 4) {

                }
            } else if (메인_메뉴_선택 == 2) {

            } else if (메인_메뉴_선택 == 3) {
                퀘스트.의뢰();
                퀘스트.승급심사();
                게임_캐릭터.무게_선택();
            } else if (메인_메뉴_선택 == 4) {
                소모품상점.소모품_목록();
                int 소모품구매 = 게임_캐릭터.소모품_구매_선택(scanner.nextInt());
                if (소모품구매 == 1) {

                } else if (소모품구매 == 2) {

                } else if (소모품구매 == 3) {

                } else if (소모품구매 == 4) {

                }
            } else if (메인_메뉴_선택 == 5) {

            } else if (메인_메뉴_선택 == 6) {

            } else if (메인_메뉴_선택 == 7) {

            } else if (메인_메뉴_선택 == 8) {

            }
        }
    }


}
