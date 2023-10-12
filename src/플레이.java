import java.util.Scanner;

//게임을 진행하는 클래스
public class 플레이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        게임운영 게임_운영_설정 = new 게임운영();
        게임운영 게임_메뉴 = new 게임운영();


        while(!게임_운영_설정.게임_종료) {
                게임_운영_설정.프롤로그();
                게임_운영_설정.캐릭터_이름_작성();
                게임_메뉴.메인_메뉴_선택(scanner.nextInt());

        }
    }
}
