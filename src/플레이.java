import java.util.Scanner;

//게임을 진행하는 클래스
public class 플레이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        게임운영 게임_메뉴_선택 = new 게임운영();
        체육관 체육관_무게_선택 = new 체육관();
        캐릭터 게임_캐릭터 = new 캐릭터();

        while(!게임_메뉴_선택.게임_종료) {
                게임_메뉴_선택.프롤로그();
                게임_메뉴_선택.캐릭터_이름_작성(scanner.next());
                게임_메뉴_선택.메인_메뉴();
                int 메인_메뉴_선택 = 게임_메뉴_선택.메인_메뉴_선택(scanner.nextInt());
                if (메인_메뉴_선택 == 1) {
                    게임_메뉴_선택.운동_메뉴();
                    게임_메뉴_선택.운동_메뉴_선택(scanner.nextInt());
                } else if (메인_메뉴_선택 == 2) {

                } else if (메인_메뉴_선택 == 3) {

                } else if (메인_메뉴_선택 == 4) {

                } else if (메인_메뉴_선택 == 5) {

                } else if (메인_메뉴_선택 == 6) {

                } else if (메인_메뉴_선택 == 7) {

                } else if (메인_메뉴_선택 == 8) {

                }
        }
    }
}
