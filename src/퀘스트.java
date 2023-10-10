import java.util.Random;

public class 퀘스트 {

    캐릭터 현재_등급 = new 캐릭터();


    public void 의뢰() {
        Random 퀘스트_설정 = new Random();
        int 랜덤_퀘스트 = 퀘스트_설정.nextInt(2);
        Random 운동횟수 = new Random();
        int 랜덤_운동횟수 = 운동횟수.nextInt(5)*100;
        if (랜덤_퀘스트 == 1) {
            System.out.println("");
        } else {
            체력 = 체력 / 2;
            System.out.println(체력);
        }
    }
    public void 승급_심사 () {

    }
}
