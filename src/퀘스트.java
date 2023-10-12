import java.util.Random;
import java.util.Scanner;

public class 퀘스트 {
    Scanner sc = new Scanner(System.in);
    캐릭터 현재_등급 = new 캐릭터();
    캐릭터 현재_레벨 = new 캐릭터();

    public void 의뢰() {
        Random 운동횟수 = new Random();
        int 랜덤_운동횟수 = 운동횟수.nextInt(5)*100;

        System.out.println("관장: 퀘스트를 진행하겠는가?");
        System.out.println("1. 진행 2. 거부");
        int 퀘스트_선택 = sc.nextInt();
        if (퀘스트_선택 == 1) {
            System.out.println("");
        } else if (퀘스트_선택 == 2) {
            System.out.println("");
        }
            return 랜덤_운동횟수();


    }


}
