package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.prefs.Preferences;

public class 게임_설정 {
    Preferences preferences = Preferences.userRoot();
    ObjectMapper objectMapper = new ObjectMapper();
    boolean 게임_bgm_틀기 = false;
    boolean 게임설정_메뉴_진행중 = true;

    public boolean 게임_bgm_효과_적용() {
        if (게임_bgm_틀기) {
            System.out.println("==================배경 음악 재생중==================");
        }
        return false;
    }

    public void 게임_bgm_여부_확인() {
        System.out.println("bgm 효과를 적용하시겠습니까?");
        System.out.println("1.효과를 적용한다. 2.메인 메뉴로 이동한다.");
    }
    public void 게임_설정_메뉴_보여주기() {
        System.out.println("========================게임 설정 메뉴========================");
        System.out.println("1.게임 bgm 2.게임 저장 3.메인 메뉴로 이동");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
    public void 게임_저장하기(캐릭터 게임_캐릭터) {
        String json = "";
        try {
            json = objectMapper.writeValueAsString(게임_캐릭터);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        preferences.put("캐릭터정보",json);
        System.out.println("캐릭터 정보 ->" + 게임_캐릭터.체력);
        System.out.println("캐릭터 정보 ->" + 게임_캐릭터.근력);
        System.out.println("캐릭터 정보 ->" + 게임_캐릭터.등급);

        String 캐릭터정보 = preferences.get("캐릭터정보","없음");
    }
}

