import java.util.Scanner;

public class 체육관 {
    int 바벨_무게;
    Scanner scanner = new Scanner(System.in);
    캐릭터 캐릭터_선택_가능한_무게체크 = new 캐릭터();
    public boolean 선택할_수_있는_무게체크(int 캐릭터_중량, int 캐릭터_레벨) {//중량 1~ 10 -> 초급 중량 1 ~ 50 -> 중급 중량
        if (캐릭터_선택_가능한_무게체크.레벨 > 10) {
            return false;
        } else {
            return true;
        }
    }
}

