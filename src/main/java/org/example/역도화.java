package org.example;

public class 역도화 {
    int 가격 = 8000;
    boolean 캐릭터한테_장착되어있는지_여부 = false;

    public void 역도화_장착_효과_적용하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 + 30;
    }
    public void 역도화_장착_효과_제거하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 - 30;
    }
}
