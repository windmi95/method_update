import java.util.Scanner;

public class 가방 {
    public void 아이템_선택 () {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 것을 선택하시겠습니까?");
        System.out.println("1.아이템 2.장비");
        int 가방_선택 = sc.nextInt();
        if (가방_선택 == 1) {
            System.out.println("아이템을 선택하셨습니다.");
            System.out.println("1.bcaa 2.탄수화물 보충제 3.프로틴 4.크레아틴");
            //아이템_사용 = sc.nextInt(); 
            if (아이템_사용 == 1) {
                if (bcaa_개수 > 0) {
                    System.out.println("bcaa를 선택하셨습니다. (" +"보유한 개수 " + bcaa_개수 +"개"+")");
                    System.out.println("1.사용한다. 2.사용하지 않는다. 3.다른 아이템을 사용한다.");
                    bcaa_메뉴_선택 = sc.nextInt();
                    if (bcaa_메뉴_선택 == 1) {
                        System.out.println("몇 개를 사용하시겠습니까?");
                        bcaa_사용한_개수 = sc.nextInt();
                        bcaa_사용_계산 = 체력+ bcaa_사용한_개수 * 1;
                        if (bcaa_사용_계산 < 체력) {
                            System.out.println(bcaa_사용한_개수+"개를 사용하였습니다.");
                        } else {
                            System.out.println("체력이 가득차서 더 사용할 수 없습니다.");
                        }
                    }
                    System.out.println(bcaa_개수);
                    System.out.println("체력+1이 회복되었습니다.");
                    체력 = 체력+1;
                } else {
                    System.out.println("개수가 부족합니다.");
                }
            } else if (아이템_사용 == 2) {
                if (탄수화물_보충제_개수 > 0) {
                    System.out.println("탄수화물 보충제를 선택하셨습니다. (" +"보유한 개수 " + 탄수화물_보충제_개수 +"개"+")");
                    System.out.println("체력+3이 회복되었습니다.");
                    체력 = 체력+3;
                }
            } else if (아이템_사용 == 3) {
                if (프로틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 프로틴_개수 +"개"+")");
                    System.out.println("근력+1이 증가되었습니다.");
                    근력 = 근력+1;
                }
            } else if (아이템_사용 == 4) {
                if (크레아틴_개수 > 0) {
                    System.out.println("프로틴을 선택하셨습니다. (" +"보유한 개수 " + 크레아틴_개수 +"개"+")");
                    System.out.println("근력+3이 증가되었습니다.");
                    근력 = 근력+3;
                }
            } else {
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }
        } else if (가방_선택 == 2) {
            System.out.println("장비를 선택하셨습니다.");
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
}
