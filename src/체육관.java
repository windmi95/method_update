import java.util.Scanner;

public class 체육관 {
    int 바벨_무게;
    Scanner scanner = new Scanner(System.in);

    캐릭터 게임_캐릭터 = new 캐릭터();
    public boolean 선택할_수_있는_무게체크(int 캐릭터_중량, int 캐릭터_레벨) {//중량 1~ 10 -> 초급 중량 1 ~ 50 -> 중급 중량
        if (게임_캐릭터.레벨 < 10 && 게임_캐릭터.레벨 > 10) {
            System.out.println("해당 중량은 사용할 수 없습니다.");
            return false;
        } else {
            return true;
        }
    }
}

