import java.util.Scanner;

public class 캐릭터 {
    Scanner scanner = new Scanner(System.in);
    int 체력 = 50;
    int 근력 = 1;
    int 등급 = 1;
    int 경험치 = 0;
    int 골드 = 5000;
    int 경험치양 = 0;
    int 레벨 = 1;
    int 중량_선택 =0;


    게임운영 운동메뉴선택 = new 게임운영();
    게임운영 소모품_구매_메시지_출력 = new 게임운영();
    게임운영 장비_구매_메시지_출력 = new 게임운영();
    체육관 무게선택 = new 체육관();
    가방 소모품선택 = new 가방();
    헬스장_관장 퀘스트_운동횟수 = new 헬스장_관장();

    public void 운동진행() {
        운동메뉴선택.운동_메뉴_선택(scanner.nextInt());
        경험치_설정();
        체력_설정();

    }
    public void 경험치_설정() {
        경험치 = 중량_선택 / 2;
        경험치양 = 경험치 + 경험치양;
        System.out.println("현재 경험치 => " + 경험치양);

        if (경험치양 > 레벨 * 100) {//레벨 상승 조건
            레벨 = 레벨 + 1;
        }
    }
    public void 체력_설정() {//객체 변수에 아무런 값이 없음
        if (체력 > 0) {
            체력 = 체력 - (중량_선택 - 근력);
            System.out.println("남은 체력 => "+ 체력);
        } else {
            System.out.println("체력이 부족합니다.");
        }
    }
    public void 골드_획득() {

    }
    public int 무게_선택() {
    if(등급 == 1) {//체육관 클래스에 있는 중량 선택  -> scanner 운동실행 ->
        무게선택.바벨();
        중량_선택 = scanner.nextInt();
        System.out.println(중량_선택+" kg 운동하러 가야겠다.");
    } else if (등급 == 2) {
        무게선택.바벨();
        중량_선택 = scanner.nextInt();
        System.out.println(중량_선택+ "kg 운동하러 가야겠다.");
    } else if (등급 == 3) {
        무게선택.바벨();
        중량_선택 = scanner.nextInt();
        System.out.println(중량_선택+ "kg 운동하러 가야겠다.");
    } else if (등급 == 4) {
        무게선택.바벨();
        중량_선택 = scanner.nextInt();
        System.out.println(중량_선택+ "kg 운동하러 가야겠다.");
    }
    return 무게_선택();

    }
    public int 소모품_구매() {//소모품 구매에서 사용자가 입력하고 게임운영 클래스에서 만든 것을 리턴?
        소모품_구매_메시지_출력.소모품_구매_안내_메시지();
        //소모품_구매_개수 = scanner.nextInt();

        /*장비_구매_메시지_출력.장비_안내_메시지(소모품_구매_개수, 장비_구매_개수);
        return 소모품_구매_개수 - 장비_구매_개수;*/
        //return 소모품_구매_개수;
        return 0;
    }
    public void 장비_구매() {// 장비 선택했을 때 안내 메시지 출력 ->

    }
    public void 아이템_사용() {



    }




}
