import org.example.캐릭터;
import org.example.크레아틴;

interface 체력을_올려주는_기능 {
    public void 캐릭터_체력을_올려준다(캐릭터 게임_캐릭터);
}

interface 근력을_올려주는_기능 {
    public void 캐릭터_근력을_올려준다(캐릭터 게임_캐릭터);
}

public abstract class 물건 {
    int 가격;

    abstract int 가격_정보_가져오기();

    abstract void 가격_설정(int 가격);
}
class 물약 extends 물건 {
    int 근력을_올려주는_효과 = 0;
    int 체력을_올려주는_효과 = 0;


    public void set근력을_올려주는_효과_지정(int 근력을_올려주는_효과) {
        this.근력을_올려주는_효과 = 근력을_올려주는_효과;
    }

    public void set체력을_올려주는_효과_지정(int 체력을_올려주는_효과) {
        this.체력을_올려주는_효과 = 체력을_올려주는_효과;
    }

    public int get근력을_올려주는_효과_지정() {
        return 근력을_올려주는_효과;
    }

    public int get체력을_올려주는_효과_지정() {
        return 체력을_올려주는_효과;
    }

    @Override
    int 가격_정보_가져오기 () {
        return this.가격;
    }

    @Override
    void 가격_설정(int 가격) {
        this.가격 = 가격;
    }
}

class bcaa extends 물약 implements 체력을_올려주는_기능 {
    int 가격 = 500;
    int 체력_올려주기 = 1;

    bcaa() {
        가격_설정(가격);
        set체력을_올려주는_효과_지정(체력_올려주기);
    }

    @Override
    public int get체력을_올려주는_효과_지정() {
        return super.get체력을_올려주는_효과_지정();
    }

    @Override
    public void set체력을_올려주는_효과_지정(int 체력을_올려주는_효과) {
        super.set체력을_올려주는_효과_지정(체력을_올려주는_효과);
    }

    @Override
    int 가격_정보_가져오기 () {
        return super.가격_정보_가져오기();
    }

    @Override
    void 가격_설정 (int 가격) {
        super.가격_설정(가격);
    }


    @Override
    public void 캐릭터_체력을_올려준다(캐릭터 게임_캐릭터) {
        게임_캐릭터.체력 = 게임_캐릭터.체력 + get체력을_올려주는_효과_지정();
    }
}

abstract class 탄수화물_보충제 extends 물약 implements 체력을_올려주는_기능 {
    int 가격  = 700;
    int 체력_올려주기 = 3;

    탄수화물_보충제() {
        가격_설정(가격);
        set체력을_올려주는_효과_지정(체력_올려주기);
    }
    public int get체력을_올려주는_효과_지정 () {
        return super.get체력을_올려주는_효과_지정();
    }

    public void set체력을_올려주는_효과_지정(int set체력을_올려주는_효과) {
        super.set체력을_올려주는_효과_지정(체력_올려주기);
    }

    @Override
    int 가격_정보_가져오기() {
        return super.가격_정보_가져오기();
    }

    @Override
    void 가격_설정 (int 가격) {
        super.가격_설정(가격);
    }

    @Override
    public void 캐릭터_체력을_올려준다(캐릭터 게임_캐릭터) {
        게임_캐릭터.체력 = 게임_캐릭터.체력 + get체력을_올려주는_효과_지정();
    }
}

abstract class 프로틴 extends 물약 implements 근력을_올려주는_기능 {
    int 가격 = 500;
    int 근력을_올려준더 = 1;


    프로틴() {
        가격_설정(가격);
        set근력을_올려주는_효과_지정(근력을_올려준더);
    }

    public int get근력을_올려주는_효과_지정 () {
        return super.get근력을_올려주는_효과_지정();
    }

    public void set근력을_올려주는_효과_지정 (int 근력을_올려주는_효과) {
        super.set근력을_올려주는_효과_지정(근력을_올려준더);
    }

    @Override
    int 가격_정보_가져오기() {
        return super.가격_정보_가져오기();
    }


    @Override
    void 가격_설정(int 가격) {
        super.가격_설정(가격);
    }

    @Override
    public void 캐릭터_근력을_올려준다(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력 = 게임_캐릭터.근력 + get근력을_올려주는_효과_지정();
    }
}
abstract class creatine extends 물약 implements 근력을_올려주는_기능{
    int 가격 = 700;
    int 근력을_올려준다 = 3;

    creatine () {
        가격_설정(가격);
        set근력을_올려주는_효과_지정(근력을_올려준다);
    }

    public void set근력을_올려주는_효과_지정(int 근력을_올려주는_효과) {
        super.set근력을_올려주는_효과_지정(근력을_올려주는_효과);
    }

    public int get근력을_올려주는_효과_지정() {
        return super.get근력을_올려주는_효과_지정();
    }

    void 가격_설정(int 가격) {
        super.가격_설정(가격);
    }

    @Override
    int 가격_정보_가져오기() {
        return super.가격_정보_가져오기();
    }

    @Override
    public void 캐릭터_근력을_올려준다(캐릭터 게임_캐릭터) {
        게임_캐릭터.근력 = 게임_캐릭터.근력 + get근력을_올려주는_효과_지정();
    }
 }