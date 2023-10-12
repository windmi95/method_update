import java.util.Scanner;

public class 체육관 {
    int 바벨_무게;
    Scanner scanner = new Scanner(System.in);
    캐릭터 등급_무게_구별 = new 캐릭터();

    public void 바벨() {//중량 1~ 10 -> 초급 중량 1 ~ 50 -> 중급 중량
        if (등급_무게_구별.등급 == 1) {
            System.out.println("중량 1 ~ 10kg");
        } else if (등급_무게_구별.등급 == 2) {
            System.out.println("중량 1 ~ 50kg");
        } else if (등급_무게_구별.등급 == 3) {
            System.out.println("중량 1 ~ 100kg");
        }

    }

}
