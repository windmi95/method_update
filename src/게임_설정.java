public class 게임_설정 {
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
        System.out.println("1.게임 bgm 2.메인 메뉴로 이동");
        System.out.println("어떤 것을 선택하시겠습니까?");
    }
}
