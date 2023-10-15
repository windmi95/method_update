import java.util.Scanner;

//게임을 진행하는 클래스
public class 플레이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        게임운영 게임_진행_메시지 = new 게임운영();
        체육관 체육관_무게_선택 = new 체육관();
        캐릭터 캐릭터_결과_선택 = new 캐릭터();

        int c = 체육관.선택할_수_있는_무게체크(3,4);



        while(!게임_진행_메시지.게임_종료) {
                게임_진행_메시지.프롤로그();
                게임_진행_메시지.캐릭터_이름_작성();
                게임_진행_메시지.메인_메뉴_선택(scanner.nextInt());
                게임_진행_메시지.승급_가능_메시지_출력();
                체육관_무게_선택.캐릭터_선택할_수_있는_무게체크();
        }
    }
}
