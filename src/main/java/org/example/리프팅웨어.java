package org.example;

public class 리프팅웨어 {
    int 가격 = 5000;
    boolean 캐릭터한테_장착되어있는지_여부 = false;
    String name = "리프팅웨어";
    public void 리프팅웨어_장착_효과_적용하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 + 20;
    }
    public void 리프팅웨어_장착_효과_제거하기(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력  = 게임_캐릭터.근력 - 20;
    }


}

