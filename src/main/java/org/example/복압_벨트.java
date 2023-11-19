package org.example;

public class 복압_벨트 {
    int 가격 = 10000;
    boolean 캐릭터한테_장착되어있는지_여부 = false;

    public void 복압벨트_장착_효과_적용하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 + 50;
    }
    public void 복압벨트_장착_효과_제거하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 - 50;
    }
}
