import java.util.Random;

public class quest {
    public quest() {
    }

    public static void main(String[] args) {
    }

    public static void A_트레이너() {
        Random 퀘스트_설정 = new Random();
        int 랜덤_퀘스트 = 퀘스트_설정.nextInt(6);
        if (랜덤_퀘스트 == 1) {
            System.out.println("벤치프레스 15회 && 스쿼트 15회 && 데드리프트 15회를 실행하세요.");
        } else if (랜덤_퀘스트 == 2) {
            System.out.println("인클라인 벤치프레스 15회 && 스미스 머신 스쿼트 15회 && 스모 데드리프트 15회를 실행하세요.");
        } else if (랜덤_퀘스트 == 3) {
            System.out.println("벤치프레스 20회 && 스쿼트 20회 && 데드리프트 20회를 실행하세요.");
        } else if (랜덤_퀘스트 == 4) {
            System.out.println("스미스 머신 벤치프레스 8회 && 내로우 스쿼트 8회 && 스미스 머신 데드리프트 8회를 실행하세요.");
        } else if (랜덤_퀘스트 == 5) {
            System.out.println("벤치프레스 8회 && 스쿼트 8회 && 데드리프트 8회를 실행하세요.");
        } else {
            System.out.println("잘 못 선택하셨습니다. 다시 입력해주세요.");
        }

    }

    public static void B_트레이너() {
        Random 퀘스트_설정 = new Random();
        int 랜덤_퀘스트 = 퀘스트_설정.nextInt(6);
        if (랜덤_퀘스트 == 1) {
            System.out.println("벤치프레스 6회 && 스쿼트 6회 && 데드리프트 6회를 실행하세요.");
        } else if (랜덤_퀘스트 == 2) {
            System.out.println("인클라인 벤치프레스 8회 && 스미스 머신 스쿼트 8회 && 스모 데드리프트 8회를 실행하세요.");
        } else if (랜덤_퀘스트 == 3) {
            System.out.println("디클라인 벤치프레스 6회 && 와이드 스쿼트 6회 && 루마니안 데드리프트 6회를 실행하세요.");
        } else if (랜덤_퀘스트 == 4) {
            System.out.println("스미스 머신 벤치프레스 8회 && 내로우 스쿼트 8회 && 스미스 머신 데드리프트 8회를 실행하세요.");
        } else if (랜덤_퀘스트 == 5) {
            System.out.println("벤치프레스 8회 && 스쿼트 8회 && 데드리프트 8회를 실행하세요.");
        } else {
            System.out.println("잘 못 선택하셨습니다. 다시 입력해주세요.");
        }

    }

    public static void C_트레이너() {
        Random 퀘스트_설정 = new Random();
        int 랜덤_퀘스트 = 퀘스트_설정.nextInt(6);
        if (랜덤_퀘스트 == 1) {
            System.out.println("벤치프레스 3회 && 스쿼트 3회 && 데드리프트 3회를 실행하세요.");
        } else if (랜덤_퀘스트 == 2) {
            System.out.println("인클라인 벤치프레스 3회 && 스미스 머신 스쿼트 3회 && 스모 데드리프트 3회를 실행하세요.");
        } else if (랜덤_퀘스트 == 3) {
            System.out.println("벤치프레스 3회 && 스쿼트 3회 && 데드리프트 3회를 실행하세요.");
        } else if (랜덤_퀘스트 == 4) {
            System.out.println("3*3 벤치프레스 && 3*3 스쿼트 && 3*3 데드리프트를 실행하세요.");
        } else if (랜덤_퀘스트 == 5) {
            System.out.println(" 5*5 벤치프레스 && 5*5 스쿼트 && 5*5 데드리프트를 실행하세요.");
        } else {
            System.out.println("잘 못 선택하셨습니다. 다시 입력해주세요.");
        }

    }
}