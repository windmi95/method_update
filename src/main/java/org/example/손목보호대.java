package org.example;

public class 손목보호대 {
    int 가격 = 3000;
    boolean 캐릭터한테_장착되어있는지_여부 = false;
    String name = "손목보호대";


    public void 손목보호대_장착_효과_적용하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 + 10;
    }
    public void 손목보호대_효과_제거(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 - 10;
    }
}
