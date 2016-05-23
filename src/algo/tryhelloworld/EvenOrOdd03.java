package algo.tryhelloworld;

/**
 * Created by sould on 2016-05-14.
 * 제목 : 짝수와 홀수
 * 내용 : evenOrOdd 메소드는 int형 num을 매개변수로 받습니다.
 *       num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록 evenOrOdd에 코드를 작성해 보세요.
 *       num은 0이상의 정수이며, num이 음수인 경우는 없습니다
 */

public class EvenOrOdd03 {

    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd03 evenOrOdd = new EvenOrOdd03();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
}
