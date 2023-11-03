import java.util.Random;
import java.util.Scanner;

public class 헬스장_관장 {
    캐릭터 게임_캐릭터;
    Scanner sc;
    체육관 체육관;

    public 헬스장_관장() {
        게임_캐릭터 = new 캐릭터();
        sc = new Scanner(System.in);
        체육관 = new 체육관();
    }
    int 현재_횟수 = 0;
    int 남은_횟수 = 0;
    int 초급_심사_중량 = 10;
    int 중급_심사_중량 = 50;
    int 고급_심사_중량 = 70;
    int 초월_심사_중량 = 100;

    public void 퀘스트_목록() {
        System.out.println("1.퀘스트 2.승급 심사");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
    public void 퀘스트_유형_선택(int 퀘스트_번호_선택, int 캐릭터_레벨, int 캐릭터_등급) {
        if (퀘스트_번호_선택 == 1) {// 기본 퀘스트
            System.out.println("퀘스트를 진행하겠습니다.");
        } else if (퀘스트_번호_선택 == 2) {//승급 심사
            System.out.println("승급 심사를 진행하겠습니다.");
            if (게임_캐릭터.등급 == 1 && 게임_캐릭터.레벨 == 30) {
                System.out.println("제한시간 5분이 주어지고 100개를 실행하지 못할 경우 다시 도전해야 합니다.");
                if (게임_캐릭터.체력 > 0) {
                    게임_캐릭터.체력 = 게임_캐릭터.체력 - (this.초급_심사_중량 - 게임_캐릭터.근력);
                    현재_횟수++;
                    남은_횟수 = 100;
                    System.out.println("현재 체력 => " + 게임_캐릭터.체력);
                    System.out.println("현재 횟수 => " + 현재_횟수);
                        if (남은_횟수 == 0) {
                            System.out.println("남은 횟수 => " + 남은_횟수);
                            System.out.println("승급 심사를 통과하셨습니다.");
                            System.out.println("중급으로 등급이 상승되었습니다.");
                            for (int j = 300; j > 0; j--) {
                                System.out.println(j / 60 + " 분" + j % 60 + " 초");
                            }
                            게임_캐릭터.등급 = 게임_캐릭터.등급 + 1;
                        }

                } else {
                    System.out.println("승급 심사를 통과하지 못하였습니다.");
                }

            } else if (게임_캐릭터.등급 == 2 && 게임_캐릭터.레벨 == 50) {
                if (게임_캐릭터.체력 > 0) {
                    게임_캐릭터.체력 = 게임_캐릭터.체력 - (this.중급_심사_중량 - 게임_캐릭터.근력);
                    현재_횟수++;
                    남은_횟수 = 300;
                    System.out.println("현재 체력 => " + 게임_캐릭터.체력);
                    System.out.println("현재 횟수 => " + 현재_횟수);
                    for (int i = 남은_횟수; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println("남은 횟수 => " + 남은_횟수);
                            System.out.println("승급 심사를 통과하셨습니다.");
                            System.out.println("중급으로 등급이 상승되었습니다.");
                            for (int j = 300; j > 0; j--) {
                                System.out.println(j / 60 + " 분" + j % 60 + " 초");
                            }
                            게임_캐릭터.등급 = 게임_캐릭터.등급 + 1;
                        } else {
                            System.out.println("승급 심사를 통과하지 못하였습니다.");
                        }
                    }
                }
            } else if (게임_캐릭터.등급 == 3 && 게임_캐릭터.레벨 == 70) {
                if (게임_캐릭터.체력 > 0) {
                    게임_캐릭터.체력 = 게임_캐릭터.체력 - (this.고급_심사_중량 - 게임_캐릭터.근력);
                    현재_횟수++;
                    남은_횟수 = 400;
                    System.out.println("현재 체력 => " + 게임_캐릭터.체력);
                    System.out.println("현재 횟수 => " + 현재_횟수);
                    for (int i = 남은_횟수; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println("남은 횟수 => " + 남은_횟수);
                            System.out.println("승급 심사를 통과하셨습니다.");
                            System.out.println("중급으로 등급이 상승되었습니다.");
                            for (int j = 300; j > 0; j--) {
                                System.out.println(j / 60 + " 분" + j % 60 + " 초");
                            }
                            게임_캐릭터.등급 = 게임_캐릭터.등급 + 1;
                        } else {
                            System.out.println("승급 심사를 통과하지 못하였습니다.");
                        }
                    }
                }
            } else if (게임_캐릭터.등급 == 4 && 게임_캐릭터.레벨 == 100) {
                if (게임_캐릭터.체력 > 0) {
                    게임_캐릭터.체력 = 게임_캐릭터.체력 - (this.초월_심사_중량 - 게임_캐릭터.근력);
                    현재_횟수++;
                    남은_횟수 = 500;
                    System.out.println("현재 체력 => "+ 게임_캐릭터.체력);
                    System.out.println("현재 횟수 => "+ 현재_횟수);
                    for (int i = 남은_횟수; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println("남은 횟수 => " + 남은_횟수);
                            System.out.println("게임이 종료되었습니다.");
                            for (int j = 300; j > 0; j--) {
                                System.out.println(j / 60 + " 분" + j % 60 + " 초");
                            }
                            게임_캐릭터.등급 = 게임_캐릭터.등급 + 1;
                        } else {
                            System.out.println("승급 심사를 통과하지 못하였습니다.");
                         }
                    }
                }
            }
        }
    }
    public void 승급_가능_메시지_출력() {
        if (30 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 31) {//초급
            System.out.println("중급 심사를 진행하실 수 있습니다.");
        } else if (50 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 51) {//중급
            System.out.println("고급 심사를 진행하실 수 있습니다.");
        } else if (70 <= 게임_캐릭터.레벨 && 게임_캐릭터.레벨 < 71) {//고급
            System.out.println("초월 심사를 진행하실 수 있습니다.");
        } else if (게임_캐릭터.레벨 <= 100) {
            System.out.println("최종 심사를 진행하실 수 있습니다.");
        }
    }
}