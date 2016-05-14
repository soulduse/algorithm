package tryhelloworld;

/**
 * Created by sould on 2016-05-14.
 * 제목 : 스트링을 숫자로 바꾸기
 * 내용 : strToInt 메소드는 String형 str을 매개변수로 받습니다.
 str을 숫자로 변환한 결과를 반환하도록 strToInt를 완성하세요.
 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
 str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 */
public class StrToInt04 {

    public int getStrToInt(String str) {

        return Integer.parseInt(str);
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt04 strToInt = new StrToInt04();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
